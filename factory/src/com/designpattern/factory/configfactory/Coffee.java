package com.designpattern.factory.configfactory;

/**
 * {@code @Description:}
 */
public abstract class Coffee {

    public abstract void show();

    public void addSugar() {
        System.out.println("加糖");
    }

    public void addMilk() {
        System.out.println("加奶");
    }
}