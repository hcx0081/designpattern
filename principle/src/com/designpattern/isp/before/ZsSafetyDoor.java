package com.designpattern.isp.before;

/**
 * {@code @Description:}
 */
public class ZsSafetyDoor implements SafetyDoor {

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
        System.out.println("防盗");
    }
}