package com.designpattern.after;

/**
 * {@code @description:}
 */
public class OpeningState extends LiftState {
    @Override
    public void open() {
        System.out.println("电梯打开");
    }

    @Override
    public void close() {
        // 修改状态
        super.context.setLiftState(Context.CLOSING_STATE);
        super.context.close();
    }

    @Override
    public void run() {
        // 什么都不做
    }

    @Override
    public void stop() {
        // 什么都不做
    }
}