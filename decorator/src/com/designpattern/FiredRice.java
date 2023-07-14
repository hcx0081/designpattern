package com.designpattern;

/**
 * {@code @Description:} 炒饭类（具体构件）
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