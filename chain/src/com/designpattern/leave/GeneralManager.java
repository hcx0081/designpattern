package com.designpattern.leave;

/**
 * {@code @description:}
 */
public class GeneralManager extends Handler {
    public GeneralManager() {
        super(Handler.NUM_THREE, Handler.NUM_SEVEN);
    }

    @Override
    public void handleLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName() + "请假" + leaveRequest.getNum() + "天");
        System.out.println("请假内容：" + leaveRequest.getContent());
        System.out.println("总经理同意");
    }
}