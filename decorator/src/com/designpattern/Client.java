package com.designpattern;

/**
 * {@code @Description:}
 */
public class Client {
    public static void main(String[] args) {
        FiredRice firedRice = new FiredRice();
        Egg egg = new Egg(firedRice);
        System.out.println(egg.cost());// 11.0
        System.out.println(egg.getDesc());// 鸡蛋炒饭
    }
}