package com.designpattern.extend.before;

/**
 * {@code @description:}
 */
public class Computer {
    private String cpu;
    private String screen;
    private String memory;
    private String mainBoard;

    public Computer(String cpu, String screen, String memory, String mainBoard) {
        this.cpu = cpu;
        this.screen = screen;
        this.memory = memory;
        this.mainBoard = mainBoard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", screen='" + screen + '\'' +
                ", memory='" + memory + '\'' +
                ", mainBoard='" + mainBoard + '\'' +
                '}';
    }
}