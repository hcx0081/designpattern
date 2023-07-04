package com.designpattern.objectadapter.adapter;

import com.designpattern.objectadapter.SDCard;
import com.designpattern.objectadapter.TFCard;

/**
 * {@code @Description:} 适配器类
 */
public class SDAdapterTF implements SDCard {
    // 引入适配者类
    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        return tfCard.readTF();
    }
}