package com.designpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * {@code @Description:} 菜单
 */
public class Menu extends MenuComponent {
    // 一个菜单下可以有多个子菜单或子菜单项
    private List<MenuComponent> menuComponentList = new ArrayList<>();

    public Menu(String name, int level) {
        super(name, level);
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponentList.get(i);
    }

    @Override
    public void print() {
        // 打印菜单的名称
        for (int i = 0; i < level; i++) {
            System.out.print("-");
        }
        System.out.println(name);

        // 打印所有子菜单或子菜单项的名称
        menuComponentList.forEach(MenuComponent::print);
    }
}