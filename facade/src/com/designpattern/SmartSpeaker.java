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
            on();
        } else if (mes.contains("关闭")) {
            off();
        } else {
            System.out.println("I don't know");
        }
    }

    // 一键打开
    private void on() {
        light.on();
        tv.on();
        airConditioner.on();
    }

    // 一键关闭
    private void off() {
        light.off();
        tv.off();
        airConditioner.off();
    }
}