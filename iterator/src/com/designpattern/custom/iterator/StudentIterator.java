package com.designpattern.custom.iterator;

import com.designpattern.custom.Student;

/**
 * {@code @Description:} 抽象迭代器类
 */
public interface StudentIterator {
    // 判断是否还有元素
    boolean hasNext();

    // 获取下一个元素
    Student next();
}