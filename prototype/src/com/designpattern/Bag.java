package com.designpattern;

/**
 * {@code @Description:}
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