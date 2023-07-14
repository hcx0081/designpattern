package com.designpattern;

/**
 * {@code @Description:}
 */
public class Egg extends Decorator {
    public Egg(FastFood fastFood) {
        super(1, "鸡蛋", fastFood);
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