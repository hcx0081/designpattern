package com.designpattern.factory.factorymethod;

/**
 * {@code @description:}
 */
public class AmericanCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}