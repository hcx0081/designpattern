package com.designpattern;

/**
 * {@code @Description:}
 */
public class SmartSpeaker {
    private Light light;
    private TV tv;
    private AirConditioner airConditioner;

    public SmartSpeaker() {
        light = new Light();
        tv = new TV();
        airConditioner = new AirConditioner();
    }

    public void say(String mes) {
        if (mes.contains("打开")) {
            open();
        } else if (mes.contains("关闭")) {
            close();
        } else {
            System.out.println("I don't know");
        }
    }

    // 一键打开
    private void open() {
        light.on();
        tv.on();
        airConditioner.on();
    }

    // 一键关闭
    private void close() {
        light.off();
        tv.off();
        airConditioner.off();
    }
}