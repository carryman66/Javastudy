package com.carryman.oop;

public class CloneClass {
    /*克隆对象 将属性一个一个复制*/
    public static void main(String[] args) {

        Dog dog   =    new Dog();
        dog.age=10;
        dog.name="金毛";

        System.out.println(dog.age);

        A a = new A();
        a.change(dog);

        System.out.println(dog.age);
        int factorial = a.factorial(5);
        System.out.println(factorial);

    }

}
class Dog{
    int age;
    String name ;
}

class A{

    public Dog change(Dog dog){

        dog=   new Dog();
        return dog;
    }



    public int factorial(int number){
        if (number==1){
            return 1;
        }else {
           return factorial(number-1)*number;
        }

    }
}
