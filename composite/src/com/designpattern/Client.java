package com.designpattern;

/**
 * {@code @description:}
 */
public class Client {
    public static void main(String[] args) {
        /* 创建子菜单或子菜单项 */
        MenuComponent menu21 = new Menu("菜单管理", 2);
        menu21.add(new MenuItem("页面访问", 3));
        menu21.add(new MenuItem("展开菜单", 3));

        MenuComponent menu22 = new Menu("权限管理", 2);
        menu22.add(new MenuItem("页面访问", 3));
        menu22.add(new MenuItem("提交保存", 3));

        MenuComponent menu23 = new Menu("角色管理", 2);
        menu23.add(new MenuItem("页面访问", 3));
        menu23.add(new MenuItem("新增角色", 3));

        /* 创建一级菜单 */
        MenuComponent menu1 = new Menu("系统管理", 1);
        menu1.add(menu21);
        menu1.add(menu22);
        menu1.add(menu23);

        // 打印所有子菜单或子菜单项的名称
        menu1.print();
    }
}