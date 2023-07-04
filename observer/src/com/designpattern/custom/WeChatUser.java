package com.designpattern.custom;

/**
 * {@code @Description:}
 */
public class WeChatUser implements Subscriber {
    private String name;

    public WeChatUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String mes) {
        System.out.println(name + "接收到消息：" + mes);
    }
}