package com.designpattern.custom;

import com.designpattern.custom.aggregate.StudentContainer;
import com.designpattern.custom.aggregate.impl.StudentContainerImpl;
import com.designpattern.custom.iterator.StudentIterator;

/**
 * {@code @description:}
 */
public class Client {
    public static void main(String[] args) {
        StudentContainer studentContainer = new StudentContainerImpl();
        studentContainer.addStudent(new Student("张三", 10));
        studentContainer.addStudent(new Student("李四", 20));
        StudentIterator studentIterator = studentContainer.getStudentIterator();
        while (studentIterator.hasNext()) {
            Student student = studentIterator.next();
            System.out.println(student);
        }
    }
}