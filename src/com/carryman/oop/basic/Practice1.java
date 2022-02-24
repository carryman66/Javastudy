package com.carryman.oop.basic;

public class Practice1 {

    public static void main(String[] args) {

        /*1.test*/
//        A01 a01 = new A01();
//        double[] doubleArrays={};
//        double doublesMax = a01.getDoublesMax(doubleArrays);
//        System.out.println(doublesMax);

        /*2.test*/
//        A02 a02 = new A02();
//        int stringArraysIndex = a02.findStringArraysIndex("守一");
//        System.out.println(stringArraysIndex);

        /*3.test*/
//        Book book160 = new Book(160);
//        Book book110 = new Book(110);
//        Book book10 = new Book(10);
//
//        String s10 = book10.updatePrice();
//        System.out.println(s10);
//        String s160 = book160.updatePrice();
//        System.out.println(s160);
//        String s110 = book110.updatePrice();
//        System.out.println(s110);

        /*4.复制数组*/
//        A03 a03 = new A03();
//        int[]copy={3,2,1};
//        int[] ints = a03.copyArray(copy);
//        for (int anInt : ints) {
//            System.out.println(anInt);
//        }
//        System.out.println(copy.hashCode());
//        System.out.println(ints.hashCode());

        /*5.圆周长和面积*/

//        Circle circle = new Circle(3);
//        circle.showArea();
//        circle.showPerimeter();

        /*6.四则运算*/
//        Arithmetic arithmetic = new Arithmetic(12, 0);
//        double plus = arithmetic.add();
//        double reduce = arithmetic.subtract();
//        double ride = arithmetic.multiply();
//        Double except = arithmetic.divide();
//        System.out.println(plus);
//        System.out.println(reduce);
//        System.out.println(ride);
//        if (except!=null){
//            System.out.println(except);
//        }else {
//            System.out.println("除数不能为0");
//        }


        /*7.创建小狗*/

//        Dog dog = new Dog("金毛", 11, "金色");
//        dog.show();

        /*8.循环指定次数
        得到半径对应面积*/
//        PassObject passObject = new PassObject();
//        Circle circle = new Circle();
//        passObject.printAreas(circle,5);
//        double radius = circle.radius;
//        System.out.println(radius);


    }
}

/**
 * 1.编写A01 类，定义max方法，实现求某个double数组的最大值，并返回
 */
class A01 {
    /**
     * 实现求某个double数组的最大值，并返回double的最大值
     *
     * @return maxDoubleArrays
     */
    public double getDoublesMax(double... doubleArrays) {
        if (doubleArrays != null && doubleArrays.length > 0) {

            double max = 0.0;
            for (int i = 0; i < doubleArrays.length; i++) {
                if (doubleArrays[i] > 0) {
                    max = doubleArrays[i];

                }

            }
            return max;
        }
        //参数为null或者长度为0
        return -111;

    }
}

/**
 * 2.A02类，定义方法find，实现查找某字符串数组中的元素，并且返回索引，
 * 找不到则返回-1
 */
class A02 {
    public int findStringArraysIndex(String findString) {
        String[] stringArrays = new String[]{"你", "好", "守一"};
        for (int i = 0; i < stringArrays.length; i++) {
            if (stringArrays[i].equals(findString)) {
                return i;
            }
        }
        return -1;
    }

}

/**
 * 3.实现book类，定义方法updatePrice，实现更改某本书的价格
 * 如果价格大于150则改成150
 * 如果价格大于100则改成100
 * 否则不变
 */
class Book {
    int price;

    Book(int price) {
        this.price = price;
    }

    public String updatePrice() {
        if (this.price > 150) {
            this.price = 150;
            return "更改图书价格为150";
        }
        //this.price<=150 已经做了判断不是
        else if (this.price > 100) {
            this.price = 100;
            return "更改图书价格为100";
        } else return "图书价格小于100 价格不变";
    }
}

/**
 * 4.实现数组的拷贝功能，输入旧数组，返回一个新数组，元素和旧数组一样
 */
class A03 {
    public int[] copyArray(int[] array) {
        int[] ints = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            ints[i] = array[i];
        }
        return ints;

    }

}

/**
 * 5.定义一个Circle圆类，定义属性：半径，
 * 提供显示圆周长功能的方法，
 * 提供显示圆面积的方法
 */
class Circle {
    double radius;

    Circle() {

    }

    Circle(double radius) {
        this.radius = radius;
    }

    public void showPerimeter() {
        double perimeter = 2 * Math.PI * this.radius;
        System.out.println("当前圆周长为 " + perimeter);
    }

    public void showArea() {
        double area = Math.PI * this.radius * this.radius;
        System.out.println("当前圆面积为 " + area);

    }

    public double getArea(double radius) {
        return Math.PI * radius * radius;

    }


}

/**
 * 6.四则运算
 */

class Arithmetic {
    double num1;
    double num2;

    public Arithmetic(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        return this.num1 + this.num2;
    }

    public double subtract() {
        return this.num1 - this.num2;
    }

    public double multiply() {
        return this.num1 * this.num2;
    }

    public Double divide() {
        if (this.num2 != 0) {
            return this.num1 / this.num2;
        } else {
            return null;
        }

    }
}

/**
 * 7.创建小狗类，具有名字颜色年龄属性，具有show展示自己属性
 */
class Dog {
    String name;
    int age;
    String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void show() {
        System.out.println(this.name + " " + this.age + " " + this.color);
    }


}

/**
 * 8.创建雇员类
 * Employee 复原构造器
 */

class Employee {
    String name;
    char gender;
    int age;
    String job;
    double sal;

    Employee(String job, double sal) {
        this.job = job;
        this.sal = sal;
    }

    Employee(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    Employee(String name, char gender, int age, String job, double sal) {

        this(name, gender, age);
        this.job = job;
        this.sal = sal;
    }

}

/**
 * 9.定义一个PassObject
 * 定义一个方法printAreas()
 */
class PassObject {
    public void printAreas(Circle circle, int times) {
        System.out.println("半径\t面积");

        for (int i = 1; i <= times; i++) {
            double area = circle.getArea(i);
            System.out.println(i + "\t" + area);
        }
    }
}