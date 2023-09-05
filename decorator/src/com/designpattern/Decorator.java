package com.designpattern;

/**
 * {@code @description:} 抽象装饰器类
 */
public abstract class Decorator extends FastFood {
    private FastFood fastFood;

    public Decorator(float price, String desc, FastFood fastFood) {
        super(price, desc);
        this.fastFood = fastFood;
    }

    public FastFood getFastFood() {
        return this.fastFood;
    }
}