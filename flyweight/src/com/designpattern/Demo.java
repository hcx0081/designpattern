package com.designpattern;

/**
 * {@code @Description:}
 */
public class Demo {
    public static void main(String[] args) {
        Integer i1 = 127;
        Integer i2 = 127;
        System.out.println("i1和i2对象是否是同一个对象？" + (i1 == i2));

        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println("i3和i4对象是否是同一个对象？" + (i3 == i4));
        /*
         * IntegerCache.low为-128
         * IntegerCache.high默认为127，但是可以在JVM进行配置，一般默认为127
         *  */
    }
}