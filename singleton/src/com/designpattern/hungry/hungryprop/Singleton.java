package com.designpattern.hungry.hungryprop;

/**
 * {@code @description:} 饿汉式：静态属性方式
 */
public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }
}