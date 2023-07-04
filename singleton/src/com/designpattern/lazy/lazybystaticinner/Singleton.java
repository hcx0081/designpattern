package com.designpattern.lazy.lazybystaticinner;

/**
 * {@code @Description:} 懒汉式
 */
public class Singleton {
    private Singleton() {
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        // 在静态内部类中声明和初始化外部类的对象
        private static final Singleton INSTANCE = new Singleton();
    }
}