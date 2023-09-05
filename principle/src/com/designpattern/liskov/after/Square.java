package com.designpattern.liskov.after;

/**
 * {@code @description:} 正方形类
 */
public class Square implements Quadrilateral {
    // 边长
    private double side;

    @Override
    public double getWidth() {
        return side;
    }

    @Override
    public double getHeight() {
        return side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}