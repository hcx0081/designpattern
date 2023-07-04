package com.designpattern.simplify;

import com.designpattern.standard.Bike;

/**
 * {@code @Description:}
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