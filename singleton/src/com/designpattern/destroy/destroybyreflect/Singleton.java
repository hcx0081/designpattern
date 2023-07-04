package com.designpattern.destroy.destroybyreflect;

import java.io.Serializable;

/**
 * {@code @Description:}
 */
public class Singleton implements Serializable {

    private static boolean flag = false;

    private Singleton() {
        synchronized (Singleton.class) {
            /*
             * 如果flag的值是true，则对象已存在，直接抛出异常
             * 如果flag的值是false，则对象不存在，正常创建对象
             * */
            if (flag) {
                throw new RuntimeException("不能创建多个对象");
            }
            // 设置为true，否则每次都会创建对象
            flag = true;
        }
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        // 在静态内部类中声明和初始化外部类的对象
        private static final Singleton INSTANCE = new Singleton();
    }
}