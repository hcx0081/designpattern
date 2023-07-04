package com.designpattern.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * {@code @Description:}
 */
public class WeChatUser implements Observer {
    private String name;

    public WeChatUser(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object mes) {
        System.out.println(name + "接收到消息：" + mes);
    }
}