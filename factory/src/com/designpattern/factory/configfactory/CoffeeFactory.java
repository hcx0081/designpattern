package com.designpattern.factory.configfactory;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Properties;

/**
 * {@code @Description:}
 */
public class CoffeeFactory {
    /*加载配置文件，获取配置文件中配置的全类名，并通过反射创建该类的对象进行存储*/
    // 1、定义容器对象存储咖啡对象
    private static HashMap<String, Coffee> map = new HashMap<>();

    // 2、加载配置文件，只需加载一次
    static {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("D:\\IDEA\\IntelliJ IDEA 2021.3.3\\Workspace\\designpattern\\factory\\src\\com\\designpattern\\factory\\configfactory\\bean.properties"));
            // 从properties集合中获取全类名
            for (Object key : properties.keySet()) {
                String className = properties.getProperty((String) key);
                // 通过反射创建对象
                Class<?> clazz = Class.forName(className);
                Coffee coffee = (Coffee) clazz.newInstance();
                // 将名称和对象存储到集合中
                map.put((String) key, coffee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Coffee createCoffee(String name) {
        return map.get(name);
    }

}