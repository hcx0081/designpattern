package com.designpattern.objectadapter.impl;

import com.designpattern.objectadapter.SDCard;

/**
 * {@code @Description:}
 */
public class SDCardImpl implements SDCard {
    @Override
    public String readSD() {
        return "SDCard read: hello";
    }
}