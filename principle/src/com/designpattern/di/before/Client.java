package com.designpattern.di.before;

/**
 * {@code @description:}
 */
public class Client {
    public static void main(String[] args) {
        // 创建电脑对象
        Computer computer = new Computer();
        // 创建电脑配件对象
        SeagateHardDisk seagateHardDisk = new SeagateHardDisk();
        IntelCpu intelCpu = new IntelCpu();
        KingstonMemory kingstonMemory = new KingstonMemory();
        // 组装电脑
        computer.setSeagateHardDisk(seagateHardDisk);
        computer.setIntelCpu(intelCpu);
        computer.setKingstonMemory(kingstonMemory);
        // 运行电脑
        computer.run();
    }
}