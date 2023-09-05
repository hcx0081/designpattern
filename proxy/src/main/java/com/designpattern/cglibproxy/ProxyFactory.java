package com.designpattern.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * {@code @description:} 代理对象工厂类：获取代理对象的工厂类
 */
public class ProxyFactory implements MethodInterceptor {
    // 声明火车站对象
    private TrainStation trainStation = new TrainStation();

    // 获取代理对象的方法
    public TrainStation getProxyObject() {
        // 创建Enhancer对象，类似于JDK代理中的Proxy类
        Enhancer enhancer = new Enhancer();
        // 设置父类的字节码对象
        enhancer.setSuperclass(TrainStation.class);
        // 设置回调函数
        enhancer.setCallback(this);
        // 创建代理对象
        TrainStation trainStation = (TrainStation) enhancer.create();
        return trainStation;
    }

    /*
     * Object o：代理对象
     * Method method：对接口中的方法进行封装的method对象
     * Object[] args：调用方法的实际参数
     * */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("收取服务费");
        // 执行目标对象的方法
        Object invoke = method.invoke(trainStation, objects);
        return invoke;
    }
}