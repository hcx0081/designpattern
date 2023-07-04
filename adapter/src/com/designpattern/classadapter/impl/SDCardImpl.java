package com.designpattern.classadapter.impl;

import com.designpattern.classadapter.SDCard;

/**
 * {@code @Description:}
 */
public class SDCardImpl implements SDCard {
    @Override
    public String readSD() {
        return "SDCard read: hello";
    }
}