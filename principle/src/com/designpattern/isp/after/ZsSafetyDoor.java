package com.designpattern.isp.after;

/**
 * {@code @description:}
 */
public class ZsSafetyDoor implements Fireproof, Waterproof, AntiTheft {
    @Override
    public void fireproof() {
        System.out.println("防火");
    }

    @Override
    public void waterproof() {
        System.out.println("防水");
    }

    @Override
    public void antiTheft() {
        System.out.println("防火");
    }
}