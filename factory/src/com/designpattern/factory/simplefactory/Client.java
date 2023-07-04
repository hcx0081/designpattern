package com.designpattern.factory.simplefactory;

/**
 * {@code @Description:}
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee("american");
        coffee.show();
    }
}