package com.designpattern;

/**
 * {@code @Description:}
 */
public class Realizetype implements Cloneable {
    @Override
    protected Realizetype clone() throws CloneNotSupportedException {
        System.out.println("浅拷贝对象成功");
        return (Realizetype) super.clone();
    }
}