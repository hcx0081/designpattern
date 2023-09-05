package com.designpattern.custom.iterator.impl;

import com.designpattern.custom.Student;
import com.designpattern.custom.iterator.StudentIterator;

import java.util.List;

/**
 * {@code @description:} 具体迭代器类
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