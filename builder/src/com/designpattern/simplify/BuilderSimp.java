package com.designpattern.simplify;

import com.designpattern.standard.Bike;

/**
 * {@code @description:}
 */
public abstract class BuilderSimp {
    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    public abstract Bike creatBike();

    // 组装共享单车
    public Bike construct() {
        this.buildFrame();
        this.buildSeat();
        return this.creatBike();
    }
}