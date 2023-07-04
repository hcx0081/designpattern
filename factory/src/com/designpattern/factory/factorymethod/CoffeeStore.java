package com.designpattern.factory.factorymethod;

/**
 * {@code @Description:}
 */
public class CoffeeStore {
    private CoffeeFactory coffeeFactory;

    public void setCoffeeFactory(CoffeeFactory coffeeFactory) {
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