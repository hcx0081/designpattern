package com.designpattern;

/**
 * {@code @Description:} 菜单组件
 */
// 无论是菜单或菜单项，都应该继承该抽象类
public abstract class MenuComponent {
    protected String name;
    protected int level;

    public MenuComponent(String name, int level) {
        this.name = name;
        this.level = level;
    }

    // 添加子菜单
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();// 子菜单项无法调用该方法
    }

    // 移除子菜单
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();// 子菜单项无法调用该方法
    }

    // 获取指定的子菜单或子菜单项
    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();// 子菜单项无法调用该方法
    }

    // 打印子菜单或子菜单项的名称
    public abstract void print();
}