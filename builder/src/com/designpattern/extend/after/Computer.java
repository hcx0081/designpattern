package com.designpattern.extend.after;

/**
 * {@code @description:}
 */
public class Computer {
    private String cpu;
    private String screen;
    private String memory;
    private String mainBoard;

    public Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.screen = builder.screen;
        this.memory = builder.memory;
        this.mainBoard = builder.mainBoard;
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

    public static final class Builder {
        private String cpu;
        private String screen;
        private String memory;
        private String mainBoard;

        public Builder cpu(String val) {
            cpu = val;
            return this;
        }

        public Builder screen(String val) {
            screen = val;
            return this;
        }

        public Builder memory(String val) {
            memory = val;
            return this;
        }

        public Builder mainBoard(String val) {
            mainBoard = val;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}