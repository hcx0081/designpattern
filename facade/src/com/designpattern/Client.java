package com.designpattern;

/**
 * {@code @Description:}
 */
public class Client {
    public static void main(String[] args) {
        SmartSpeaker smartSpeaker = new SmartSpeaker();
        smartSpeaker.say("打开");
        smartSpeaker.say("关闭");
    }
}