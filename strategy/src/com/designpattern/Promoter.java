package com.designpattern;

/**
 * {@code @Description:}
 */
public class Promoter {
    private Strategy strategy;

    public Promoter(Strategy strategy) {
        this.strategy = strategy;
    }

    // 促销员将促销活动介绍给消费者
    public void promoterShow() {
        strategy.show();
    }
}