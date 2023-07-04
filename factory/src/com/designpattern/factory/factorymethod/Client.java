package com.designpattern.factory.factorymethod;

/**
 * {@code @Description:}
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        // 创建xxxCoffeeFactory生产xxxCoffee对象
        CoffeeFactory coffeeFactory = new AmericanCoffeeFactory();
        coffeeStore.setCoffeeFactory(coffeeFactory);
        Coffee coffee = coffeeStore.orderCoffee();
        coffee.show();
    }
}