package com.designpattern.jdk;

/**
 * {@code @Description:}
 */
public interface StudentContainer extends Iterable<Student> {
    void addStudent(Student student);

    void removeStudent(Student student);
}