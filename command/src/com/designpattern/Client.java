package com.designpattern;

/**
 * {@code @description:}
 */
public class Client {
    public static void main(String[] args) {
        // 创建第一个订单
        Order order1 = new Order();
        order1.setTableNo(1);
        order1.setFood("米饭", 1);

        // 创建第二个订单
        Order order2 = new Order();
        order2.setTableNo(2);
        order2.setFood("面条", 1);

        // 创建厨师
        Cook cook = new Cook();

        // 创建命令
        OrderCommand orderCommand1 = new OrderCommand(cook, order1);
        OrderCommand orderCommand2 = new OrderCommand(cook, order2);

        // 创建服务员
        Waiter waiter = new Waiter();
        waiter.setCommand(orderCommand1);
        waiter.setCommand(orderCommand2);
        // 服务员执行命令
        waiter.orderUp();
    }
}