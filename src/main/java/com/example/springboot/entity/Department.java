package com.example.springboot.entity;

/**
 * @ClassName Department
 * @Description TODO
 * @Author 张鸿志
 * @Date 2019年4月13日22:14:48 22:14
 * Version 1.0
 **/
public class Department {

    private  Integer id;

    private  String departmentName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
