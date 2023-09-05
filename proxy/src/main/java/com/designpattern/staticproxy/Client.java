package com.designpattern.staticproxy;

/**
 * {@code @description:} 客户端：进行购票操作
 */
public class Client {
    public static void main(String[] args) {
        // 创建代售点对象
        ProxyPoint proxyPoint = new ProxyPoint();
        // 进行购票
        proxyPoint.sell();
    }
}