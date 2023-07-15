package com.designpattern;

/**
 * {@code @Description:} 抽象构件类（快餐）
 */
public abstract class FastFood {
    private float price;
    private String desc;

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public float getPrice() {
        return this.price;
    }

    public String getDesc() {
        return this.desc;
    }

    public abstract float cost();
}