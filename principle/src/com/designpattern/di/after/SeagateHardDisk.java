package com.designpattern.di.after;

/**
 * {@code @description:}
 */
public class SeagateHardDisk implements HardDisk {
    public String get() {
        System.out.println("使用希捷硬盘获取数据");
        return "数据";
    }

    public void save(String data) {
        System.out.println("使用希捷硬盘存储数据：" + data);
    }
}