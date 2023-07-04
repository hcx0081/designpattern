package com.designpattern;

/**
 * {@code @Description:}
 */
public class Client {
    public static void main(String[] args) {
        Promoter promoter = new Promoter(new StrategyA());
        promoter.promoterShow();// 买一送一
    }
}