package com.example.springboot.advice;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @ClassName AdviceDemo
 * @Description TODO
 * @Author 张鸿志
 * @Date  23:14
 * Version 1.0
 **/
@Aspect
@Component
public class AdviceDemo {


    //定义一个切入点，改规则表达式表示拦截mapper包下所有的public 方法
    @Pointcut("execution(public * com.example.springboot.mapper..*.*(..))")
    public void pointcutDemo(){}

    @Before("pointcutDemo()")      // 这里指定切入点的地方
    public void beforeShow(){
        System.out.println("前置通知测试");
    }
    @After("pointcutDemo()")
    public void afterShow(){
        System.out.println("这里是后置通知");
    }
}
