package com.designpattern.factory.abstractfactory;


/**
 * {@code @description:}
 */
public class AmericanFactory implements Factory {
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}