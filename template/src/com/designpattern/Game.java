package com.designpattern;

/**
 * {@code @Description:}
 */
public abstract class Game {
    public void initialize() {
        System.out.println("初始化游戏");
    }

    public abstract void startPlay();

    public abstract void endPlay();

    // 模板方法
    public final void play() {
        // 初始化游戏
        initialize();
        // 开始游戏
        startPlay();
        // 结束游戏
        endPlay();
    }
}