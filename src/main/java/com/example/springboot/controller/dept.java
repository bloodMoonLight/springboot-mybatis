package com.example.springboot.controller;

import com.example.springboot.entity.*;
import com.example.springboot.mapper.EmployeeMapper;
import com.example.springboot.mapper.departementMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName dept
 * @Description TODO
 * @Author 张鸿志
 * @Date 2019年4月13日22:24:14 22:24
 * Version 1.0
 **/
@RestController
public class dept {

    @Resource
    departementMapper departementMappers;

    @Resource
    EmployeeMapper employeeMapper;


    @GetMapping("/dept/{id}")
    public Department getDept(@PathVariable("id")Integer id){
            return departementMappers.getDepartementId(id);
    }

    @GetMapping("/dept")
    public Department insertDept(Department department){
        Integer dept = departementMappers.insertDept(department);
        return department;
    }


    @GetMapping("/emp/{id}")
    public Employee get(@PathVariable("id")Integer id){
        return  employeeMapper.getEmployeeById(id);
    }

}
