package com.designpattern;

/**
 * {@code @description:}
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype realizetype = new Realizetype();
        Realizetype clone = realizetype.clone();
        System.out.println(realizetype == clone);// false
        System.out.println(realizetype.equals(clone));// false，重写equals()方法才为true


        Person zs = new Person("zs", 20, new Bag(10));
        Person zsClone = zs.clone();
        System.out.println(zs == zsClone);// false
        System.out.println(zs.name == zsClone.name);// true
        System.out.println(zs.age == zsClone.age);// true
        System.out.println(zs.bag == zsClone.bag);// true

        zs.age = 30;// 两者独立
        zs.bag.size = 20;// 两者为同一个引用
        System.out.println(zs);// Person{name='zs', age=30, bag=Bag{size=20}}
        System.out.println(zsClone);// Person{name='zs', age=20, bag=Bag{size=20}}
    }
}