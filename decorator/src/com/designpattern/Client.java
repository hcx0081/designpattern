package com.designpattern;

/**
 * {@code @description:}
 */
public class Client {
    public static void main(String[] args) {
        FiredRice firedRice = new FiredRice();
        Egg egg = new Egg(firedRice);
        // 通过具体装饰器调用
        System.out.println(egg.cost());// 11.0
        System.out.println(egg.getDesc());// 鸡蛋炒饭

        Ham ham = new Ham(egg);
        System.out.println(ham.cost());// 13.0
        System.out.println(ham.getDesc());// 火腿鸡蛋炒饭
    }
}