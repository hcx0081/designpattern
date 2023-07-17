package com.designpattern.custom.aggregate;

import com.designpattern.custom.Student;
import com.designpattern.custom.iterator.StudentIterator;

/**
 * {@code @Description:} 抽象集合类
 */
public interface StudentContainer {
    void addStudent(Student student);

    void removeStudent(Student student);

    StudentIterator getStudentIterator();
}