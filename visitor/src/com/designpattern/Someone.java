package com.designpattern;

/**
 * {@code @description:}
 */
public class Someone implements Person {

    @Override
    public void feed(Cat cat) {
        System.out.println("其他人喂猫");

    }

    @Override
    public void feed(Dog dog) {
        System.out.println("其他人喂狗");
    }
}