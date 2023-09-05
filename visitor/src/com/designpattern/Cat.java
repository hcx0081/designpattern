package com.designpattern;

/**
 * {@code @description:}
 */
public class Cat implements Animal {
    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("喵~");
    }
}