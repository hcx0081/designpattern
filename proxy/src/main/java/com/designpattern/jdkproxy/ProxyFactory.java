package com.designpattern.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description: 代理对象工厂类：获取代理对象的工厂类
 */
public class ProxyFactory {
    //声明目标对象（火车站）
    private TrainStation trainStation = new TrainStation();
    
    //获取代理对象的方法
    public SellTickets getProxyObject() {
        //返回代理对象
        SellTickets sellTickets = (SellTickets) Proxy.newProxyInstance(
                trainStation.getClass().getClassLoader(),
                trainStation.getClass().getInterfaces(),
                new InvocationHandler() {
                    /*
                     * Object proxy：代理对象，和sellTickets对象是同一个对象，在invoke()中基本不用
                     * Method method：对接口中的方法进行封装的method对象
                     * Object[] args：调用方法的实际参数
                     * */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("收取服务费");//进行方法的增强
                        //执行目标对象的方法
                        Object invoke = method.invoke(trainStation, args);
                        return invoke;
                    }
                }
        );
        return sellTickets;
    }
}
