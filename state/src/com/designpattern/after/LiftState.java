package com.designpattern.after;

/**
 * {@code @description:}
 */
public abstract class LiftState {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    // 电梯的动作
    public abstract void open();

    public abstract void close();

    public abstract void run();

    public abstract void stop();
}