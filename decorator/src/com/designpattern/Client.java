package com.designpattern;

/**
 * {@code @Description:}
 */
public class Client {
    public static void main(String[] args) {
        FiredRice firedRice = new FiredRice();
        Egg egg = new Egg(firedRice);
        System.out.println(egg.cost());
        System.out.println(egg.getDesc());
    }
}