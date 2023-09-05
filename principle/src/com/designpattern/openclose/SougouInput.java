package com.designpattern.openclose;

/**
 * {@code @description:}
 */
public class SougouInput {
    private AbstractSkin abstractSkin;

    public void setAbstractSkin(AbstractSkin abstractSkin) {
        this.abstractSkin = abstractSkin;
    }

    public void display() {
        abstractSkin.display();
    }
}