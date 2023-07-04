package com.designpattern.custom;

/**
 * {@code @Description:}
 */
public class Client {
    public static void main(String[] args) {
        WeChatUser zs = new WeChatUser("张三");
        WeChatUser ls = new WeChatUser("李四");

        UTools uTools = new UTools();
        uTools.attach(zs);
        uTools.attach(ls);
        uTools.notify("Hi, uTools");
    }
}