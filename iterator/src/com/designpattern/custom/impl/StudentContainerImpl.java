package com.designpattern.custom.impl;

import com.designpattern.custom.Student;
import com.designpattern.custom.StudentContainer;
import com.designpattern.custom.StudentIterator;

import java.util.ArrayList;
import java.util.List;

/**
 * {@code @Description:}
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