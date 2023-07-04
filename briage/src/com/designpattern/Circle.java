package com.designpattern;

/**
 * {@code @Description:}
 */
public class Circle extends Shape {
    public Circle(Pen pen) {
        super(pen);
    }

    @Override
    public void draw() {
        super.pen.drawColor("Circle");
    }
}