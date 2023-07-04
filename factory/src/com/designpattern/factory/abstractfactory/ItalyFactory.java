package com.designpattern.factory.abstractfactory;

/**
 * {@code @Description:}
 */
public class ItalyFactory implements Factory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }
}