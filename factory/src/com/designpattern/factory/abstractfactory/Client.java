package com.designpattern.factory.abstractfactory;

/**
 * {@code @Description:}
 */
public class Client {
    public static void main(String[] args) {
        Factory factory = new AmericanFactory();
        Store store = new Store();
        store.setFactory(factory);
        Coffee coffee = store.orderCoffee();
        Dessert dessert = store.orderDessert();
        coffee.show();
        dessert.show();
    }
}