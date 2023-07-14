package com.designpattern.factory.factorymethod;

/**
 * {@code @Description:}
 */
public class Client {
    public static void main(String[] args) {
        // 创建xxxCoffeeFactory生产xxxCoffee对象
        CoffeeFactory coffeeFactory = new AmericanCoffeeFactory();
        CoffeeStore coffeeStore = new CoffeeStore(coffeeFactory);
        Coffee coffee = coffeeStore.orderCoffee();
        coffee.show();
    }
}