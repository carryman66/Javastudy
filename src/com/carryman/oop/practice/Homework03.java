package com.carryman.oop.practice;

/**
 * @author carry man
 * @version 1.0
 */
public class Homework03 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.shout();
        Animal cat = new Cat();
        cat.shout();
    }
}




abstract class  Animal{
    abstract void shout();
}

class Cat extends Animal{

    @Override
    void shout() {
        System.out.println("猫叫");
    }
}

class Dog extends Animal{

    @Override
    void shout() {
        System.out.println("狗叫");
    }
}