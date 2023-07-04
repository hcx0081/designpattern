package com.designpattern.factory.factorymethod;

/**
 * {@code @Description:}
 */
public class LatteCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}