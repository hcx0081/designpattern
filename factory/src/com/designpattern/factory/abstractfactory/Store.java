package com.designpattern.factory.abstractfactory;


/**
 * {@code @Description:}
 */
public class Store {
    private Factory factory;

    public void setFactory(Factory factory) {
        this.factory = factory;
    }

    public Coffee orderCoffee() {
        Coffee coffee = factory.createCoffee();
        // 添加配料
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }

    public Dessert orderDessert() {
        Dessert dessert = factory.createDessert();
        return dessert;
    }
}