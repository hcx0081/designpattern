package com.designpattern.whitebox;

/**
 * {@code @Description:} 备忘录类
 */
public class RoleStateMemento {
    // 生命力
    private int vit;
    // 攻击力
    private int atk;
    // 防御力
    private int def;

    public RoleStateMemento(int vit, int atk, int def) {
        this.vit = vit;
        this.atk = atk;
        this.def = def;
    }

    public int getVit() {
        return vit;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }
}