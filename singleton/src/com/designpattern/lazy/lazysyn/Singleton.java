package com.designpattern.lazy.lazysyn;

/**
 * {@code @Description:} 懒汉式
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    // 加上synchronized线程安全
    public static synchronized Singleton getInstance() {
        // 如果没有instance则创建；有instance则不创建，直接返回
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}