package com.designpattern.factory.simplefactory;

/**
 * {@code @Description:}
 */
public class CoffeeStore {
    // 传入不同咖啡类型的参数，根据指定类型创建对应的Coffee子类对象
    public Coffee orderCoffee(String type) {
        SimpleCoffeeFactory simpleCoffeeFactory = new SimpleCoffeeFactory();
        // 调用生产咖啡的方法
        Coffee coffee = simpleCoffeeFactory.createCoffee(type);
        // 添加配料
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}