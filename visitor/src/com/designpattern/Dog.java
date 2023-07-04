package com.designpattern;

/**
 * {@code @Description:}
 */
public class Dog implements Animal {
    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("汪~");
    }
}