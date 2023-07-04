package com.designpattern.liskov.before;

/**
 * {@code @Description:} 正方形类，正方形是特殊的长方形
 */
public class Square extends Rectangle {
    /*
     * 正方形宽高相等
     * 继承长方形类使用两种Setter方法设置的宽高都相等，比较严谨
     * */


    @Override
    public void setHeight(double length) {
        super.setHeight(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double length) {
        super.setHeight(length);
        super.setWidth(length);
    }
}