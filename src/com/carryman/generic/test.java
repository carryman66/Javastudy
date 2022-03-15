package com.carryman.generic;

import java.util.ArrayList;

/**
 * @author carry man
 * @version 1.0
 */
public class test {
    public static void main(String[] args) {
        Dog dog1 = new Dog("旺财", 1);
        Dog dog2 = new Dog("贝拉", 2);
        Dog dog3 = new Dog("黄狗", 4);

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);

        for (Dog dog : dogs) {
            String name = dog.getName();
            System.out.println(name);
        }


    }
}

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
