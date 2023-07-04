package com.designpattern.factory.abstractfactory;


/**
 * {@code @Description:}
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