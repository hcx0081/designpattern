package com.designpattern.jdk.aggregate.impl;

import com.designpattern.jdk.Student;
import com.designpattern.jdk.aggregate.StudentContainer;
import com.designpattern.jdk.iterator.impl.StudentIteratorImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * {@code @Description:} 具体集合类
 */
public class StudentContainerImpl implements StudentContainer {
    // 存储学生
    private List<Student> studentList = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        studentList.remove(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIteratorImpl(studentList);
    }
}