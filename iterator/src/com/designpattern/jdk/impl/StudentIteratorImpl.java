package com.designpattern.jdk.impl;

import com.designpattern.jdk.Student;
import com.designpattern.jdk.StudentIterator;

import java.util.List;

/**
 * {@code @Description:}
 */
public class StudentIteratorImpl implements StudentIterator {
    // 需要遍历的学生集合
    private List<Student> studentList;
    // 遍历位置
    private int position = 0;

    public StudentIteratorImpl(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public boolean hasNext() {
        return position < studentList.size();
    }

    @Override
    public Student next() {
        return studentList.get(position++);
    }
}