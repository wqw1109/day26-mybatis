package com.wqw.mybatis.Test;

import com.wqw.mybatis.pojo.Emp;
import com.wqw.mybatis.web.EmpServlet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext-*.xml");

        EmpServlet empServlet = context.getBean(EmpServlet.class);


        empServlet.trans();
    }
}
