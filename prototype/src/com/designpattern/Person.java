package com.designpattern;

/**
 * {@code @Description:}
 */
public class Person implements Cloneable {
    String name;
    Integer age;
    Bag bag;

    public Person(String name, Integer age, Bag bag) {
        this.name = name;
        this.age = age;
        this.bag = bag;
    }

    @Override
    protected Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", bag=" + bag +
                '}';
    }
}