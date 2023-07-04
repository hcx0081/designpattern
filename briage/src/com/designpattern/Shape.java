package com.designpattern;

/**
 * {@code @Description:}
 */
public abstract class Shape {
    protected Pen pen;

    public Shape(Pen pen) {
        this.pen = pen;
    }

    public abstract void draw();
}