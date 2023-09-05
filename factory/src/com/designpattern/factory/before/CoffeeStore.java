package com.designpattern.factory.before;

/**
 * {@code @description:}
 */
public class CoffeeStore {
    // 传入不同咖啡类型的参数，根据指定类型创建对应的Coffee子类对象
    public Coffee orderCoffee(String type) {
        Coffee coffee;
        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("对不起没有该咖啡");
        }
        // 添加配料
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}