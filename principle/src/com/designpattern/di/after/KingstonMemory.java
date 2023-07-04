package com.designpattern.di.after;

/**
 * {@code @Description:}
 */
public class KingstonMemory implements Memory {
    public void save() {
        System.out.println("使用金士顿内存条存储数据");
    }
}