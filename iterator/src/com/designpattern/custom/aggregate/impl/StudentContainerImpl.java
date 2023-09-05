package com.designpattern.custom.aggregate.impl;

import com.designpattern.custom.Student;
import com.designpattern.custom.aggregate.StudentContainer;
import com.designpattern.custom.iterator.StudentIterator;
import com.designpattern.custom.iterator.impl.StudentIteratorImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * {@code @description:} 具体集合类
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
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(studentList);
    }
}