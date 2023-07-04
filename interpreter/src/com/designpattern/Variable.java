package com.designpattern;

/**
 * {@code @Description:} 变量
 */
public class Variable extends AbstractExpression {
    // 变量名
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Context context) {
        return context.getValue(this);
    }

    @Override
    public String toString() {
        return name;
    }
}