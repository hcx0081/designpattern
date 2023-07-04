package com.designpattern.custom;

import java.util.ArrayList;
import java.util.List;

/**
 * {@code @Description:}
 */
public class UTools implements Publisher {
    // 存放订阅者
    private List<Subscriber> weChatUserList = new ArrayList<>();

    @Override
    public void attach(Subscriber subscriber) {
        weChatUserList.add(subscriber);
    }

    @Override
    public void detach(Subscriber subscriber) {
        weChatUserList.remove(subscriber);
    }

    @Override
    public void notify(String mes) {
        weChatUserList.forEach(weChatUser -> weChatUser.update(mes));
    }
}