package com.designpattern.custom;

/**
 * {@code @Description:}
 */
public interface StudentContainer {
    void addStudent(Student student);

    void removeStudent(Student student);

    StudentIterator getStudentIterator();
}