package com.designpattern.extend.after;

/**
 * {@code @description:}
 */
public class Client {
    public static void main(String[] args) {
        // 构建Computer对象
        Computer computer = new Computer.Builder()
                .cpu("Intel")
                .screen("三星屏幕")
                .memory("金士顿")
                .mainBoard("华硕")
                .build();
        System.out.println(computer);
    }
}