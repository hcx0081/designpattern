package com.designpattern.standard;

/**
 * {@code @Description:}
 */
public class MobikeBuilder extends Builder {
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