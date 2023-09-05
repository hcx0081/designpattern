package com.designpattern.liskov.after;

/**
 * {@code @description:}
 */
public class Client {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);// 设置长方形宽为10
        rectangle.setHeight(20);// 设置长方形高为20
        resize(rectangle);// 扩宽操作
        printWidthAndHeight(rectangle);
        System.out.println("====================");// 扩宽操作传入不了正方形对象，避免错误
    }

    /**
     * 扩宽，将长方形扩宽为正方形
     *
     * @param rectangle
     */
    public static void resize(Rectangle rectangle) {
        // 判断宽如果比高小，扩宽
        while (rectangle.getWidth() <= rectangle.getHeight()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    public static void printWidthAndHeight(Quadrilateral quadrilateral) {
        System.out.println(quadrilateral.getWidth());
        System.out.println(quadrilateral.getHeight());
    }
}