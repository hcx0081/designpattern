package com.designpattern.jdkproxy;

/**
 * @Description: 目标对象：火车站
 */
public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火车站售票");
    }
}
