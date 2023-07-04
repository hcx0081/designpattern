package com.designpattern.classadapter.impl;

import com.designpattern.classadapter.TFCard;

/**
 * {@code @Description:} 适配者
 */
public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        return "TFCard read: hello";
    }
}