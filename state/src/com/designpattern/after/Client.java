package com.designpattern.after;

/**
 * {@code @description:}
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new OpeningState());
        context.close();
    }
}