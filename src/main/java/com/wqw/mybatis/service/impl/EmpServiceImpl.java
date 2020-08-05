package com.wqw.mybatis.service.impl;

import com.wqw.mybatis.mapper.EmpMapper;
import com.wqw.mybatis.pojo.Emp;
import com.wqw.mybatis.service.EmpService;
import com.wqw.mybatis.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    public List<Emp> findAllEmp() {
        return empMapper.findAllEmp();
    }

    @Override
    public Emp findEmpById(int id) {
        return empMapper.findEmpById(id);
    }

    @Override
    public void insert(Emp emp) {
        empMapper.insert(emp);

    }

    @Override
    public void update(Emp emp) {
        empMapper.update(emp);

    }

    @Override
    public void delete(int id) {
        empMapper.delete(id);

    }

    public void trans(Emp wqw,Emp csz,int v) {
        wqw.setSalary(wqw.getSalary() - v);
        csz.setSalary(csz.getSalary() + v);
        empMapper.update(wqw);
        empMapper.update(csz);
    }
}
