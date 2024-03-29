package com.designpattern;

/**
 * {@code @description:}
 */
public abstract class Shape {
    protected Pen pen;

    public Shape(Pen pen) {
        this.pen = pen;
    }

    public abstract void draw();
}