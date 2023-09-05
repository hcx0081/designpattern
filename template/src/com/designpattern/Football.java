package com.designpattern;

/**
 * {@code @description:}
 */
public class Football extends Game {
    @Override
    public void startPlay() {
        System.out.println("开始足球游戏");
    }

    @Override
    public void endPlay() {
        System.out.println("结束足球游戏");
    }
}