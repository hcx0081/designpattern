package com.designpattern.staticproxy;

/**
 * {@code @description:} 真实主题类
 */
public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火车站售票");
    }
}