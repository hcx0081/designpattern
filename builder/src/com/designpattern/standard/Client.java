package com.designpattern.standard;

/**
 * {@code @Description:}
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director(new MobikeBuilder());
        Bike bike = director.construct();
        System.out.println(bike);// Bike{frame='摩拜车架', seat='摩拜车座'}
    }
}