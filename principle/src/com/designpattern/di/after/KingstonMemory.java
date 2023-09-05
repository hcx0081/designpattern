package com.designpattern.di.after;

/**
 * {@code @description:}
 */
public class KingstonMemory implements Memory {
    public void save() {
        System.out.println("使用金士顿内存条存储数据");
    }
}