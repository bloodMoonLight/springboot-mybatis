package com.example.springboot.mapper;

import com.example.springboot.entity.OrderDetail;
import com.example.springboot.entity.Orders;
import com.example.springboot.entity.OrdersCustom;
import com.example.springboot.entity.User;

import java.util.List;

/**
 * @ClassName OrdersCustomMapper
 * @Description TODO
 * @Author 张鸿志
 * @Date 2019年4月16日22:33:43 22:33
 * Version 1.0
 **/
public interface OrdersCustomMapper {


    // 查询订单相关的信息，需要显示用户的信息
    public List<OrdersCustom> findOrdersUser();

    //使用ResultMap配置映射关系后
    public List<Orders> finOrders();

    //查询订单详细信息，需要有用户
    public List<Orders> findOrderDetail();

    //查询每一个用户购买商品
    public List<User> findUserAndItems();

}
