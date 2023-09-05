package com.designpattern.factory.factorymethod;

/**
 * {@code @description:}
 */
public class LatteCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}