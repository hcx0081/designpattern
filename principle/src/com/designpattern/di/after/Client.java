package com.designpattern.di.after;

/**
 * {@code @description:}
 */
public class Client {
    public static void main(String[] args) {
        // 创建电脑对象
        Computer computer = new Computer();
        // 创建电脑配件对象
        HardDisk seagateHardDisk = new SeagateHardDisk();
        Cpu intelCpu = new IntelCpu();
        Memory kingstonMemory = new KingstonMemory();
        // 组装电脑
        computer.setHardDisk(seagateHardDisk);
        computer.setCpu(intelCpu);
        computer.setMemory(kingstonMemory);
        // 运行电脑
        computer.run();
    }
}