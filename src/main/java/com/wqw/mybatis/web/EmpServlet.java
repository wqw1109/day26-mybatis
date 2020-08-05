package com.wqw.mybatis.web;

import com.wqw.mybatis.pojo.Emp;
import com.wqw.mybatis.service.EmpService;
import com.wqw.mybatis.service.impl.EmpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class EmpServlet {
    @Autowired
    private EmpService empService;

    public List<Emp> findAllEmp() {
        return empService.findAllEmp();
    }

    public Emp findEmpById(Integer id) {
        return empService.findEmpById(id);
    }

    public void insert(Emp emp) {
        empService.insert(emp);
    }

    public void update(Emp emp) {
        empService.update(emp);
    }

    public void delete(Integer id) {
        empService.delete(id);
    }

    public void trans() {
        Emp wqw = findEmpById(1201);
        Emp csz = findEmpById(1211);
        empService.trans(wqw,csz,1000000);
    }
}
