package com.example.springboot.mapper;

import com.example.springboot.entity.Employee;

/**
 * @ClassName EmployeeMapper
 * @Description TODO
 * @Author 张鸿志
 * @Date 2019年4月13日22:54:03 22:53
 * Version 1.0
 **/
public interface EmployeeMapper {

    public  Employee getEmployeeById(Integer id);

    public void insertEmp(Employee employee);

}
