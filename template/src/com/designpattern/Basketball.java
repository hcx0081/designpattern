package com.designpattern;

/**
 * {@code @Description:}
 */
public class Basketball extends Game {
    @Override
    public void startPlay() {
        System.out.println("开始篮球游戏");
    }

    @Override
    public void endPlay() {
        System.out.println("结束篮球游戏");
    }
}