package com.designpattern.jdk.aggregate;

import com.designpattern.jdk.Student;

/**
 * {@code @Description:} 抽象集合类
 */
public interface StudentContainer extends Iterable<Student> {
    void addStudent(Student student);

    void removeStudent(Student student);
}