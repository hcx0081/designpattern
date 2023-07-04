package com.designpattern;

/**
 * {@code @Description:} 抽象装饰器
 */
public abstract class Decorator extends FastFood {
    private FastFood fastFood;

    public Decorator(float price, String desc, FastFood fastFood) {
        super(price, desc);
        this.fastFood = fastFood;
    }

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }
}