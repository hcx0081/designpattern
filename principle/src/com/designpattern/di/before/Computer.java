package com.designpattern.di.before;

/**
 * {@code @description:}
 */
public class Computer {
    private SeagateHardDisk seagateHardDisk;
    private IntelCpu intelCpu;
    private KingstonMemory kingstonMemory;

    public SeagateHardDisk getSeagateHardDisk() {
        return seagateHardDisk;
    }

    public void setSeagateHardDisk(SeagateHardDisk seagateHardDisk) {
        this.seagateHardDisk = seagateHardDisk;
    }

    public IntelCpu getIntelCpu() {
        return intelCpu;
    }

    public void setIntelCpu(IntelCpu intelCpu) {
        this.intelCpu = intelCpu;
    }

    public KingstonMemory getKingstonMemory() {
        return kingstonMemory;
    }

    public void setKingstonMemory(KingstonMemory kingstonMemory) {
        this.kingstonMemory = kingstonMemory;
    }

    public void run() {
        System.out.println("开始运行计算机");
        String data = seagateHardDisk.get();
        seagateHardDisk.save(data);
        intelCpu.run();
        kingstonMemory.save();
    }
}