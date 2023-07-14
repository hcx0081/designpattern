package com.designpattern;

/**
 * {@code @Description:} 炒面类（具体构件）
 */
public class FriedNoodles extends FastFood {
    public FriedNoodles() {
        super(20, "炒面");
    }

    @Override
    public float cost() {
        return super.getPrice();
    }
}