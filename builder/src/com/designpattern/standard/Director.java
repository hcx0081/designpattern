package com.designpattern.standard;

/**
 * {@code @Description:}
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    // 组装共享单车
    public Bike construct() {
        builder.buildFrame();
        builder.buildSeat();
        Bike bike = builder.creatBike();
        return bike;
    }
}