package com.designpattern;

/**
 * {@code @Description:}
 */
public class Client {
    public static void main(String[] args) {
        Home home = new Home();
        home.addAnimal(new Cat());
        home.addAnimal(new Dog());
        Person owner = new Owner();
        home.action(owner);
    }
}