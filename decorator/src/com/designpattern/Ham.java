package com.designpattern;

/**
 * {@code @Description:}
 */
public class Ham extends Decorator {
    public Ham(FastFood fastFood) {
        super(2, "火腿", fastFood);
    }

    @Override
    public float cost() {
        return super.getPrice() + super.getFastFood().getPrice();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + super.getFastFood().getDesc();
    }
}