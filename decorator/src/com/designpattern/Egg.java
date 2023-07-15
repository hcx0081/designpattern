package com.designpattern;

/**
 * {@code @Description:} 具体装饰器类（鸡蛋）
 */
public class Egg extends Decorator {
    public Egg(FastFood fastFood) {
        super(1, "鸡蛋", fastFood);
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