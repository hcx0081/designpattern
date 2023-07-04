package com.designpattern.standard;

/**
 * {@code @Description:}
 */
public class OfoBuilder extends Builder {
    @Override
    public void buildFrame() {
        bike.setFrame("ofo车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("ofo车座");
    }

    @Override
    public Bike creatBike() {
        return bike;
    }
}