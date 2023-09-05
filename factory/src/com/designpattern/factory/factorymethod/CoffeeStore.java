package com.designpattern.factory.factorymethod;

/**
 * {@code @description:}
 */
public class CoffeeStore {
    private CoffeeFactory coffeeFactory;

    public CoffeeStore(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee orderCoffee() {
        Coffee coffee = coffeeFactory.createCoffee();
        // 添加配料
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}