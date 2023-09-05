package com.designpattern;

import java.util.Map;
import java.util.Set;

/**
 * {@code @description:}
 */
public class OrderCommand implements Command {
    private Cook cook;
    private Order order;

    public OrderCommand(Cook cook, Order order) {
        this.cook = cook;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getTableNo() + "号桌的订单：");
        Map<String, Integer> food = order.getFood();
        Set<String> foodNameSet = food.keySet();
        foodNameSet.forEach(foodName -> cook.cooking(foodName, food.get(foodName)));
        System.out.println(order.getTableNo() + "号桌的餐品已准备好");
    }
}