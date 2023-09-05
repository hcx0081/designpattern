package com.designpattern;

import java.util.HashMap;
import java.util.Map;

/**
 * {@code @description:}
 */
public class Order {
    // 餐桌号
    private int tableNo;
    private Map<String, Integer> food = new HashMap<>();

    public int getTableNo() {
        return tableNo;
    }

    public void setTableNo(int tableNo) {
        this.tableNo = tableNo;
    }

    public Map<String, Integer> getFood() {
        return food;
    }

    public void setFood(String foodName, Integer num) {
        this.food.put(foodName, num);
    }
}