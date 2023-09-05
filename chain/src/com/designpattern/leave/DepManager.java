package com.designpattern.leave;

/**
 * {@code @description:}
 */
public class DepManager extends Handler {
    public DepManager() {
        super(Handler.NUM_ONE, Handler.NUM_THREE);
        // 设置上级领导
        setNextHandler(new GeneralManager());
    }

    @Override
    public void handleLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName() + "请假" + leaveRequest.getNum() + "天");
        System.out.println("请假内容：" + leaveRequest.getContent());
        System.out.println("部门经理同意");
    }
}