package com.designpattern.jdk;

import java.util.Observable;

/**
 * {@code @description:}
 */
public class UTools extends Observable {
    @Override
    protected synchronized void setChanged() {
        super.setChanged();
    }
}