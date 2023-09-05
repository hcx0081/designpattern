package com.designpattern;

/**
 * {@code @description:}
 */
public class Bag {
    int size;

    public Bag(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Bag{" +
                "size=" + size +
                '}';
    }
}