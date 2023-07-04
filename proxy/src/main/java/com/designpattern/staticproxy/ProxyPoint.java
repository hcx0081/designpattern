package com.designpattern.staticproxy;

/**
 * {@code @Description:} 静态代理对象：代售点
 */
public class ProxyPoint implements SellTickets {
    // 声明火车站对象
    private TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        System.out.println("收取服务费");// 进行方法的增强
        trainStation.sell();
    }
}