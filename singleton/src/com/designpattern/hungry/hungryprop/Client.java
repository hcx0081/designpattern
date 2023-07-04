package com.designpattern.hungry.hungryprop;

/**
 * {@code @Description:}
 */
public class Client {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);// true，始终为同一个对象
    }
}