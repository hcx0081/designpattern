package com.designpattern.custom;

/**
 * {@code @Description:}
 */
public interface Publisher {
    // 添加订阅者
    void attach(Subscriber subscriber);

    // 删除订阅者
    void detach(Subscriber subscriber);

    // 通知订阅者
    void notify(String mes);
}