package com.designpattern.before;

/**
 * {@code @Description:}
 */
public class Client {
    public static void main(String[] args) {
        ILift lift = new Lift();
        lift.setState(ILift.CLOSING_STATE);
        lift.open();
    }
}