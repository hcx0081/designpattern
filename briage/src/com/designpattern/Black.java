package com.designpattern;

/**
 * {@code @Description:}
 */
public class Black implements Pen {
    @Override
    public void drawColor(String shape) {
        System.out.println("Black" + shape);
    }
}