package com.designpattern.classadapter.adapter;

import com.designpattern.classadapter.SDCard;
import com.designpattern.classadapter.impl.TFCardImpl;

/**
 * {@code @Description:} 适配器类
 */
public class SDAdapterTF extends TFCardImpl implements SDCard {
    @Override
    public String readSD() {
        return readTF();
    }
}