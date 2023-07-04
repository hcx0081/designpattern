package com.designpattern.lazy.lazybydcl;

/**
 * {@code @Description:} 懒汉式
 */
public class Singleton {
    // 加上volatile关键字防止空指针
    private static volatile Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        // 第一次判断：如果没有instance则抢占锁；有instance则直接返回
        if (instance == null) {
            synchronized (Singleton.class) {
                // 第二次判断：抢占锁之后判断instance是否为null：为null则创建，不为null则返回
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}