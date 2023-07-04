package com.designpattern.simplify;

import com.designpattern.standard.Bike;

/**
 * {@code @Description:}
 */
public class Client {
    public static void main(String[] args) {
        BuilderSimp builder = new MobikeBuilder();
        Bike bike = builder.construct();
        System.out.println(bike);// Bike{frame='摩拜车架', seat='摩拜车座'}
    }
}