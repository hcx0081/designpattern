package com.designpattern;

/**
 * {@code @description:}
 */
public class Client {
    public static void main(String[] args) {
        Shape circle = new Circle(new Black());
        circle.draw();
    }
}