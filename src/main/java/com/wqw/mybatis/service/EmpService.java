package com.wqw.mybatis.service;

import com.wqw.mybatis.pojo.Emp;

import java.util.List;

public interface EmpService {
    public List<Emp> findAllEmp();
    public Emp findEmpById(int id);
    public void insert(Emp emp);
    public void update(Emp emp);
    public void delete(int id);
    void trans(Emp wqw,Emp csz,int v);
}
