package com.designpattern;

/**
 * {@code @Description:} 具体构件类（炒饭）
 */
public class FiredRice extends FastFood {
    public FiredRice() {
        super(10, "炒饭");
    }

    @Override
    public float cost() {
        return super.getPrice();
    }
}