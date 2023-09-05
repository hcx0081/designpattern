package com.designpattern.extend.before;

/**
 * {@code @description:}
 */
public class Client {
    public static void main(String[] args) {
        // 构建Computer对象
        Computer computer = new Computer("Intel", "三星屏幕", "金士顿", "华硕");
        System.out.println(computer);
    }
}