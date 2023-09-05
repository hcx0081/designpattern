package com.designpattern;

/**
 * {@code @description:}
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();

        Variable a = new Variable("a");
        Variable b = new Variable("b");

        context.assign(a, 1);
        context.assign(b, 2);

        int i = new Plus(a, b).interpret(context);
        System.out.println(i);
    }

}