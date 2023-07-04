package com.designpattern.before;

/**
 * {@code @Description:}
 */
public class Lift implements ILift {
    private int state;

    @Override
    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void open() {
        switch (this.state) {
            case OPENING_STATE:
                // 开门状态电梯不可以开门
                // do nothing
                break;
            case CLOSING_STATE:
                System.out.println("电梯打开");
                this.setState(OPENING_STATE);
                break;
            case RUNNING_STATE:
                // 运行状态电梯不可以开门
                // do nothing
                break;
            case STOPPING_STATE:
                // 停止状态电梯可以开门
                System.out.println("电梯打开");
                this.setState(OPENING_STATE);
                break;

        }
    }

    @Override
    public void close() {
        switch (this.state) {
            case OPENING_STATE:
                System.out.println("电梯关闭");
                this.setState(CLOSING_STATE);
                break;
            case CLOSING_STATE:
                // 关门状态电梯不可以关门
                // do nothing
                break;

            case RUNNING_STATE:
                // 运行状态电梯不可以关门
                // do nothing
                break;

            case STOPPING_STATE:
                // 停止状态电梯是关闭的，不可以关门
                // do nothing
                break;
        }
    }

    @Override
    public void run() {
        switch (this.state) {
            case OPENING_STATE:
                // 开门状态电梯不可以运行
                // do nothing
                break;
            case CLOSING_STATE:
                // 关门状态电梯可以运行
                System.out.println("电梯运行");
                this.setState(RUNNING_STATE);
                break;
            case RUNNING_STATE:
                // 运行状态电梯不可以运行
                // do nothing
                break;
            case STOPPING_STATE:
                // 停止状态电梯可以运行
                System.out.println("电梯运行");
                this.setState(RUNNING_STATE);
                break;
        }
    }

    @Override
    public void stop() {
        switch (this.state) {
            case OPENING_STATE:
                // 开门状态电梯可以停止（正常情况下）
                // do nothing
                break;
            case CLOSING_STATE:
                // 关门状态电梯可以停止
                System.out.println("电梯停止");
                this.setState(STOPPING_STATE);
                break;
            case RUNNING_STATE:
                // 运行状态电梯可以停止
                System.out.println("电梯停止");
                this.setState(STOPPING_STATE);
                break;
            case STOPPING_STATE:
                // do nothing
                break;
        }
    }
}