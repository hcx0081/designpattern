package com.designpattern.classadapter;

import com.designpattern.classadapter.adaptee.SDCard;
import com.designpattern.classadapter.adaptee.impl.SDCardImpl;
import com.designpattern.classadapter.adapter.SDAdapterTF;

/**
 * {@code @Description:}
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();

        /* 使用该Computer读取SDCard */
        SDCard sdCard = new SDCardImpl();
        String readSD = computer.readSD(sdCard);
        System.out.println(readSD);

        /* 使用该Computer通过适配器读取TFCard */
        SDAdapterTF sdAdapterTF = new SDAdapterTF();
        String readTF = computer.readSD(sdAdapterTF);
        System.out.println(readTF);
    }
}