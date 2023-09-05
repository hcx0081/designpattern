package com.designpattern.classadapter.adapter;

import com.designpattern.classadapter.adaptee.SDCard;
import com.designpattern.classadapter.adaptee.impl.TFCardImpl;

/**
 * {@code @description:} 适配器类
 */
public class SDAdapterTF extends TFCardImpl implements SDCard {
    @Override
    public String readSD() {
        return super.readTF();
    }
}