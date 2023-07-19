package com.designpattern.destroy.destroybyserialize;

import java.io.Serializable;

/**
 * {@code @Description:}
 */
public class Singleton implements Serializable {
    private Singleton() {
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    /* 当进行反序列化时，会自动调用该方法，将该方法的返回值直接返回 */
    public Object readResolve() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        // 在静态内部类中声明和初始化外部类的对象
        private static final Singleton INSTANCE = new Singleton();
    }
}