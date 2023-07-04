package com.designpattern.standard;

/**
 * {@code @Description:}
 */
public class Bike {
    // 车架
    private String frame;
    // 车座
    private String seat;

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "frame='" + frame + '\'' +
                ", seat='" + seat + '\'' +
                '}';
    }
}