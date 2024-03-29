package com.example.springboot.entity;

import java.util.Date;
import java.util.List;

/**
 * @ClassName Orders
 * @Description TODO
 * @Author 张鸿志
 * @Date 2019年4月16日22:29:14 22:29
 * Version 1.0
 **/
public class Orders {

    /** 主键订单Id */
    private Integer id;
    /** 下单用户id */
    private Integer userid;
    /** 订单号 */
    private String number;
    /** 创建订单时间 */
    private Date createTime;
    /** 备注 */
    private String note;
    // 用户信息
    private User user;
    // 订单明细
    private List<OrderDetail> orderdetails;

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", userid=" + userid +
                ", number='" + number + '\'' +
                ", createTime=" + createTime +
                ", note='" + note + '\'' +
                ", user=" + user +
                ", orderdetails=" + orderdetails +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<OrderDetail> getOrderdetails() {
        return orderdetails;
    }

    public void setOrderdetails(List<OrderDetail> orderdetails) {
        this.orderdetails = orderdetails;
    }
}
