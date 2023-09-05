package com.designpattern;

/**
 * {@code @description:} 具体装饰器类（火腿）
 */
public class Ham extends Decorator {
    public Ham(FastFood fastFood) {
        super(2, "火腿", fastFood);
    }

    @Override
    public float cost() {
        return super.getFastFood().cost() + super.getPrice();
    }

    @Override
    public String getDesc() {
        return super.getFastFood().getDesc() + super.getDesc();
    }
}