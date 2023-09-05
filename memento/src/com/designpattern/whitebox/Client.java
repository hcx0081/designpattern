package com.designpattern.whitebox;

/**
 * {@code @description:}
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("----------决斗Boss之前----------");
        Role role = new Role();
        role.initState();
        role.displayState();

        // 存档该游戏角色的内部状态
        RoleStateMementoCaretaker caretaker = new RoleStateMementoCaretaker();
        caretaker.setRoleStateMemento(role.saveState());


        System.out.println("----------决斗Boss之后----------");
        role.fight();
        role.displayState();


        System.out.println("..........恢复存档..........");
        role.recoverState(caretaker.getRoleStateMemento());
        role.displayState();
    }
}