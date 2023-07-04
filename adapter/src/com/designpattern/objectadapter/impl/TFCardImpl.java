package com.designpattern.objectadapter.impl;

import com.designpattern.objectadapter.TFCard;

/**
 * {@code @Description:} 适配者
 */
public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        return "TFCard read: hello";
    }
}