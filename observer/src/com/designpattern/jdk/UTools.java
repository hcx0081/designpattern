package com.designpattern.jdk;

import java.util.Observable;

/**
 * {@code @Description:}
 */
public class UTools extends Observable {
    @Override
    protected synchronized void setChanged() {
        super.setChanged();
    }
}