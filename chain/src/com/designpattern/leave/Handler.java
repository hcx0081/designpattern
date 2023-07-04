package com.designpattern.leave;

/**
 * {@code @Description:}
 */
public abstract class Handler {
    protected static final int NUM_ZERO = 0;
    protected static final int NUM_ONE = 1;
    protected static final int NUM_THREE = 3;
    protected static final int NUM_SEVEN = 7;

    private int numStart;
    private int numEnd;

    // 后继处理者，即上级领导
    private Handler nextHandler;

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    // 设置上级领导
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    // 领导处理请假条的方法
    public abstract void handleLeave(LeaveRequest leaveRequest);

    // 提交请假条
    public final void submit(LeaveRequest leaveRequest) {
        // 该领导进行处理
        this.handleLeave(leaveRequest);
        if (leaveRequest.getNum() > this.numEnd && this.nextHandler != null) {
            // 提交给上级领导处理
            this.nextHandler.submit(leaveRequest);
        } else {
            System.out.println("请假流程结束");
        }
    }
}