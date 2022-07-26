package com.designpattern.jdkproxy;

/**
 * @Description: 客户：进行购票操作
 */
public class Client {
    public static void main(String[] args) {
        //创建获取代理对象的工厂类对象
        ProxyFactory proxyFactory = new ProxyFactory();
        //通过工厂对象的方法获取代理对象
        SellTickets sellTickets = proxyFactory.getProxyObject();
        //进行购票
        sellTickets.sell();
    }
}
