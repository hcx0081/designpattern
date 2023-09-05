package com.designpattern.factory.simplefactory;

/**
 * {@code @description:}
 */
public class SimpleCoffeeFactory {
    // 加上static修饰符则是静态工厂模式
    public Coffee createCoffee(String type) {
        Coffee coffee;
        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("对不起没有该咖啡");
        }
        return coffee;
    }
}