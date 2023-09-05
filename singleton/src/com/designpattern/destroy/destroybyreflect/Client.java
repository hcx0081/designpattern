package com.designpattern.destroy.destroybyreflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * {@code @description:}
 */
public class Client {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 获取Singleton的字节码对象
        Class<Singleton> singletonClass = Singleton.class;
        // 获取无参构造方法对象
        Constructor<Singleton> constructor = singletonClass.getDeclaredConstructor();
        // 取消访问检查
        constructor.setAccessible(true);
        // 通过反射方式创建Singleton对象
        Singleton singleton1 = constructor.newInstance();
        Singleton singleton2 = constructor.newInstance();
        System.out.println(singleton1 == singleton2);
    }
}