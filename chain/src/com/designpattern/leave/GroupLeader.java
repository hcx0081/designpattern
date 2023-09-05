package com.designpattern.leave;

/**
 * {@code @description:}
 */
public class GroupLeader extends Handler {
    public GroupLeader() {
        super(Handler.NUM_ZERO, Handler.NUM_ONE);
        // 设置上级领导
        setNextHandler(new DepManager());
    }

    @Override
    public void handleLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName() + "请假" + leaveRequest.getNum() + "天");
        System.out.println("请假内容：" + leaveRequest.getContent());
        System.out.println("组长同意");
    }
}