package com.designpattern.factory.factorymethod;

/**
 * {@code @Description:}
 */
public class AmericanCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}