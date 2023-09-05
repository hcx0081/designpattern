package com.designpattern.classadapter.adaptee.impl;

import com.designpattern.classadapter.adaptee.SDCard;

/**
 * {@code @description:} 目标类
 */
public class SDCardImpl implements SDCard {
    @Override
    public String readSD() {
        return "SDCard read: hello";
    }
}