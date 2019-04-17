package com.example.springboot;

import com.example.springboot.entity.*;
import com.example.springboot.mapper.OrdersCustomMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisApplicationTests {

    @Autowired
    OrdersCustomMapper ordersCustomMapper;
    @Test
    public void contextLoads() {
       /* List<OrdersCustom> user  = ordersCustomMapper.findOrdersUser();   一对一使用继承实体类来实现
        for (OrdersCustom  o :user) {
            System.out.println(o.getUsername());
        }*/

//        List<Orders> list = ordersCustomMapper.finOrders();           一对一使用resultMap
//        for ( Orders o: list) {
//            System.out.println(o.getUser().getUsername());
//        }

//        List<Orders> detail = ordersCustomMapper.findOrderDetail();   一对多关系
//        for (Orders o : detail) {
//            List<OrderDetail> details = o.getOrderdetails();
//            for (OrderDetail d : details) {
//                System.out.println(d.getItemsId());
//            }
//        }


        List<User> items = ordersCustomMapper.findUserAndItems();
        for ( User u :items ) {
            System.out.println(u);
        }
//        for (User u : items) {
//            List<Orders> list = u.getOrdersList();
//            for (Orders o : list) {
//                List<OrderDetail> details = o.getOrderdetails();
//                for (OrderDetail od :details) {
//                    Items items1 = od.getItems();
//                    System.out.println(items1.getItemsName());
//                }
//
//            }
//        }

    }

}
