package com.designpattern;

/**
 * {@code @description:}
 */
public class White implements Pen {
    @Override
    public void drawColor(String shape) {
        System.out.println("White" + shape);
    }
}