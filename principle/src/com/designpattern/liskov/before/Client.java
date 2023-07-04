package com.designpattern.liskov.before;

/**
 * {@code @Description:}
 */
public class Client {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);// 设置长方形宽为10
        rectangle.setHeight(20);// 设置长方形高为20
        resize(rectangle);// 扩宽操作
        printWidthAndHeight(rectangle);
        System.out.println("====================");// 以下代码发生错误
        Square square = new Square();
        square.setHeight(20);// 设置正方形高为20
        resize(square);// 扩宽操作
        printWidthAndHeight(square);
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

    public static void printWidthAndHeight(Rectangle rectangle) {
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getHeight());
    }
}