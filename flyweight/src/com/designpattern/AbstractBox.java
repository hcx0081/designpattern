package com.designpattern;

/**
 * {@code @Description:}
 */
public abstract class AbstractBox {
    public abstract String getShape();

    public void display(String color) {
        System.out.println("方块形状：" + getShape() + "\n方块颜色：" + color);// 即外部状态
    }
}