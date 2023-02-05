package com.huaqx.service;

import com.huaqx.pojo.BookInCart;
import com.huaqx.pojo.Orderform;

import java.util.ArrayList;

public interface OrderformService {
    //通过Oid获取订单对象
    public Orderform findOrderFormByOid(int oid);

    //通过Uid获取这个用户的订单记录总数
    public int getOrderPageCountByUid(int uid);

    //删除订单号为oid的订单
    public void deleteOrder(int oid);

    //添加新订单记录
    public void addOrder(Orderform orderBean);

    public ArrayList<Orderform> findOrderFormsByUidByPage(int uid);

    public ArrayList<BookInCart> findBookByOid(int Oid);

    public ArrayList<Orderform> findBookBySid(int Sid);
}
