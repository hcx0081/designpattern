package com.designpattern.simplify;

import com.designpattern.standard.Bike;

/**
 * {@code @description:}
 */
public class MobikeBuilder extends BuilderSimp {
    @Override
    public void buildFrame() {
        bike.setFrame("摩拜车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("摩拜车座");
    }

    @Override
    public Bike creatBike() {
        return bike;
    }
}