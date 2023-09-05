package com.designpattern.objectadapter.adapter;

import com.designpattern.objectadapter.adaptee.SDCard;
import com.designpattern.objectadapter.adaptee.TFCard;

/**
 * {@code @description:} 适配器类
 */
public class SDAdapterTF implements SDCard {
    // 引用适配者类
    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        return tfCard.readTF();
    }
}