package com.designpattern.jdk;

import com.designpattern.jdk.aggregate.StudentContainer;
import com.designpattern.jdk.aggregate.impl.StudentContainerImpl;

import java.util.Iterator;

/**
 * {@code @description:}
 */
public class Client {
    public static void main(String[] args) {
        StudentContainer studentContainer = new StudentContainerImpl();
        studentContainer.addStudent(new Student("张三", 10));
        studentContainer.addStudent(new Student("李四", 20));
        Iterator<Student> studentIterator = studentContainer.iterator();
        while (studentIterator.hasNext()) {
            Student student = studentIterator.next();
            System.out.println(student);
        }
    }
}