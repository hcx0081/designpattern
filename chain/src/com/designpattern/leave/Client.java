package com.designpattern.leave;

/**
 * {@code @Description:}
 */
public class Client {
    public static void main(String[] args) {
        LeaveRequest leaveRequest = new LeaveRequest("张三", 11, "回家探亲");
        GroupLeader groupLeader = new GroupLeader();
        groupLeader.submit(leaveRequest);
    }
}