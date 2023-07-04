package com.designpattern;

/**
 * {@code @Description:}
 */
public class Square extends Shape {
    public Square(Pen pen) {
        super(pen);
    }

    @Override
    public void draw() {
        super.pen.drawColor("Square");
    }
}