package com.designpattern;

/**
 * {@code @Description:} 抽象表达式
 */
public abstract class AbstractExpression {
    public abstract int interpret(Context context);
}