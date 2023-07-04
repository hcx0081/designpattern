package com.designpattern.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * {@code @Description:} 代理对象工厂类：获取代理对象的工厂类
 */
public class ProxyFactory {
    // 声明目标对象（火车站）
    private TrainStation trainStation = new TrainStation();

    // 动态获取代理对象
    public Object getProxyInstance() {
        // 返回指定目标对象的代理对象，调用该代理对象的方法时自动调用invoke()方法
        Object sellTickets = Proxy.newProxyInstance(
                trainStation.getClass().getClassLoader(),
                trainStation.getClass().getInterfaces(),
                new InvocationHandler() {
                    /**
                     * @param proxy  代理对象，基本不使用
                     * @param method 目标对象的方法对象
                     * @param args   调用目标对象方法的实际参数
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("收取服务费");// 进行方法的增强
                        // 执行目标对象的方法
                        Object returnValue = method.invoke(trainStation, args);
                        return returnValue;
                    }
                }
        );
        return sellTickets;
    }
}