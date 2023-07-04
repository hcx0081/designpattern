package com.designpattern.objectadapter;

/**
 * {@code @Description:}
 */
public class Computer {
    // Computer只能从SDCard中读取数据
    public String readSD(SDCard sdCard) {
        return sdCard.readSD();
    }
}