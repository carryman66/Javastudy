package com.carryman.collection_.work;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author carry man
 * @version 1.0
 */
public class Work01 {
    public static void main(String[] args) {

        List arrayList = new ArrayList();
        arrayList.add(new Dog("tom1",40));
        arrayList.add(new Dog("tom2",12));
        arrayList.add(new Dog("tom3",14));

        //使用增强for遍历 I
        for (Object o : arrayList) {
            System.out.println(o);
        }

        //使用iterator itit
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
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

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
