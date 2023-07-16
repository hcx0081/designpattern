package com.designpattern.classadapter.adaptee.impl;

import com.designpattern.classadapter.adaptee.TFCard;

/**
 * {@code @Description:} 适配者类
 */
public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        return "TFCard read: hello";
    }
}