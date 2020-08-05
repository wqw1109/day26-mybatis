package com.wqw.mybatis.pojo;

public class Emp {
    private Integer id;
    private String name;
    private String deg;
    private Integer salary;
    private String dept;

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", deg='" + deg + '\'' +
                ", salary=" + salary +
                ", dept='" + dept + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeg() {
        return deg;
    }

    public void setDeg(String deg) {
        this.deg = deg;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Emp() {
    }

    public Emp(Integer id, String name, String deg, Integer salary, String dept) {
        this.id = id;
        this.name = name;
        this.deg = deg;
        this.salary = salary;
        this.dept = dept;
    }
}
