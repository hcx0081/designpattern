package com.designpattern.destroy.destroybyserialize;

import java.io.*;

/**
 * {@code @Description:}
 */
public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        writeObject2File();
        /*两次读到的对象的地址不同，说明不是同一个对象*/
        readObjectFromFile();
        readObjectFromFile();
    }

    // 从文件中读取数据（对象）
    public static void readObjectFromFile() throws IOException, ClassNotFoundException {
        ObjectInputStream stream = new ObjectInputStream(new FileInputStream("E:\\file.txt"));
        Singleton singleton = (Singleton) stream.readObject();
        System.out.println(singleton);
        stream.close();
    }

    // 向文件中写入数据（对象）
    public static void writeObject2File() throws IOException {
        Singleton singleton = Singleton.getInstance();
        ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("E:\\file.txt"));
        stream.writeObject(singleton);
        stream.close();
    }
}