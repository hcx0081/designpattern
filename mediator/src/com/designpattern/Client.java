package com.designpattern;

/**
 * {@code @Description:}
 */
public class Client {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();
        User user1 = new User("张三", chatRoom);
        User user2 = new User("李四", chatRoom);
        user1.sendMes("hello, I'm zs");
        user2.sendMes("hello, I'm ls");
    }
}