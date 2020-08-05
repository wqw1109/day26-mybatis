package com.wqw.mybatis.mapper;

import com.wqw.mybatis.pojo.Emp;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpMapper {
    List<Emp> findAllEmp();
    Emp findEmpById(int id);
    void insert(Emp emp);
    void update(Emp emp);
    void delete(int id);

}
