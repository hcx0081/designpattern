package com.designpattern;

/**
 * {@code @description:} 具体构件类（炒面）
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