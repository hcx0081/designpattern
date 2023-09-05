package com.designpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * {@code @description:}
 */
public class Home {
    // 存储元素
    private List<Animal> animalList = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animalList.add(animal);
    }

    public void action(Person person) {
        animalList.forEach(animal -> animal.accept(person));
    }
}