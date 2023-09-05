package com.designpattern;

/**
 * {@code @description:}
 */
public class Client {
    public static void main(String[] args) {
        BoxFactory boxFactory = BoxFactory.getInstance();
        AbstractBox oBox1 = boxFactory.getBox("O");
        oBox1.display("white");

        AbstractBox oBox2 = boxFactory.getBox("O");
        oBox2.display("black");

        System.out.println(oBox1 == oBox2);// true
    }
}