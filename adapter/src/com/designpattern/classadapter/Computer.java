package com.designpattern.classadapter;

import com.designpattern.classadapter.adaptee.SDCard;

/**
 * {@code @description:}
 */
public class Computer {
    // Computer只能从SDCard中读取数据
    public String readSD(SDCard sdCard) {
        return sdCard.readSD();
    }
}