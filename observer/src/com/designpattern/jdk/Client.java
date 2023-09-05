package com.designpattern.jdk;

/**
 * {@code @description:}
 */
public class Client {
    public static void main(String[] args) {
        WeChatUser zs = new WeChatUser("张三");
        WeChatUser ls = new WeChatUser("李四");

        UTools uTools = new UTools();
        uTools.addObserver(zs);
        uTools.addObserver(ls);
        uTools.setChanged();
        uTools.notifyObservers("Hi, uTools");
    }
}