package com.designpattern.jdkproxy;

/**
 * {@code @Description:} 客户端：进行购票操作
 */
public class Client {
    public static void main(String[] args) {
        // 创建获取代理对象的工厂类对象
        ProxyFactory proxyFactory = new ProxyFactory();
        // 通过工厂对象的方法动态获取代理对象
        SellTickets sellTickets = (SellTickets) proxyFactory.getProxyInstance();
        // 进行购票
        sellTickets.sell();
    }
}