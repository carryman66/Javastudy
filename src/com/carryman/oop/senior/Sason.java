package com.carryman.oop.senior;

/**
 * @author carry man
 * @version 1.0
 */
public class Sason {
}


enum Person{

    //写在第一行，多个用逗号隔开
    TEACHER("小李",11),STUDENT("A",12);

    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }



    public String getName() {
        return name;
    }



    public int getAge() {
        return age;
    }


}
