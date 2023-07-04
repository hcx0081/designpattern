package com.designpattern;

import java.util.HashMap;

/**
 * {@code @Description:} 工厂模式
 */
public class BoxFactory {
    private static BoxFactory boxFactory = new BoxFactory();
    private HashMap<String, AbstractBox> map;

    private BoxFactory() {
        this.map = new HashMap<>();
        this.map.put("I", new IBox());
        this.map.put("L", new LBox());
        this.map.put("O", new OBox());
    }

    // 单例工厂
    public static BoxFactory getInstance() {
        return boxFactory;
    }

    public AbstractBox getBox(String name) {
        return map.get(name);
    }
}