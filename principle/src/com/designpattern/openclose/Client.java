package com.designpattern.openclose;

/**
 * {@code @description:}
 */
public class Client {
    public static void main(String[] args) {
        // 创建搜狗输入法对象
        SougouInput sougouInput = new SougouInput();
        // 创建皮肤对象
        DefaultSkin defaultSkin = new DefaultSkin();// 默认皮肤
        CustomSkin customSkin = new CustomSkin();// 自定义皮肤
        // 将皮肤设置到输入法中
        sougouInput.setAbstractSkin(defaultSkin);
        // 输入法展示皮肤
        sougouInput.display();
    }
}