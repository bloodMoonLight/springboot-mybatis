package com.example.springboot.entity;

/**
 * @ClassName OrdersCustom
 * @Description TODO(查询用户与订单信息就映射到这个实体类中)
 * @Author 张鸿志
 * @Date 2019年4月16日22:32:18 22:32
 * Version 1.0
 **/
public class OrdersCustom extends Orders{

    // 添加用户的属性
    private String username;
    private String sex;
    private String address;
    // getter and setter......

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
