package com.designpattern.objectadapter;

import com.designpattern.objectadapter.adaptee.SDCard;
import com.designpattern.objectadapter.adaptee.TFCard;
import com.designpattern.objectadapter.adaptee.impl.SDCardImpl;
import com.designpattern.objectadapter.adaptee.impl.TFCardImpl;
import com.designpattern.objectadapter.adapter.SDAdapterTF;

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
        TFCard tfCard = new TFCardImpl();
        SDAdapterTF sdAdapterTF = new SDAdapterTF(tfCard);
        String readTF = computer.readSD(sdAdapterTF);
        System.out.println(readTF);
    }
}