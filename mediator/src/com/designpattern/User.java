package com.designpattern;

/**
 * {@code @Description:}
 */
public class User {
    private String name;
    private ChatRoom chatRoom;

    public User(String name, ChatRoom chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
    }

    public void sendMes(String mes) {
        chatRoom.showMes(name, mes);
    }
}