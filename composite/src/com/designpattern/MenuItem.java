package com.designpattern;

/**
 * {@code @Description:} 叶子节点类（菜单项）
 */
public class MenuItem extends MenuComponent {
    public MenuItem(String name, int level) {
        super(name, level);
    }

    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("-");
        }
        System.out.println(name);
    }
}