package com.designpattern;

import java.util.ArrayList;

/**
 * {@code @Description:}
 */
public class Waiter {
    // 可以请求多个命令
    private ArrayList<Command> commandList = new ArrayList<>();

    public void setCommand(Command cmd) {
        this.commandList.add(cmd);
    }

    public void orderUp() {
        commandList.forEach(command -> {
            if (command != null) {
                command.execute();
            }
        });
    }
}