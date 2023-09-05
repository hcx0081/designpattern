package com.designpattern.factory.configfactory;


/**
 * {@code @description:}
 */
public class CoffeeStore {
    public Coffee orderCoffee(String name) {
        Coffee coffee = CoffeeFactory.createCoffee(name);
        coffee.addSugar();
        coffee.addMilk();
        return coffee;
    }
}