package com.designpattern.simplify;

import com.designpattern.standard.Bike;

/**
 * {@code @description:}
 */
public class OfoBuilder extends BuilderSimp {
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