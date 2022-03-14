package com.carryman.map_.homework;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author carry man
 * @version 1.0
 */
public class HomeWork02 {
    public static void main(String[] args) {

        Car car1 = new Car("宝马", 700000);
        Car car2 = new Car("宾利", 40000000);
        Car car3 = new Car("奥迪", 4500000);
        Car car4 = new Car("保时捷", 10000);

        ArrayList arrayList = new ArrayList();
        arrayList.add(car1);
        arrayList.add(car2);


        //迭代器
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }

        //增强for
        for (Object o : arrayList) {
            System.out.println(o);
        }

        int size = arrayList.size();
        System.out.println("长度为："+size);

        boolean contains = arrayList.contains(car1);
        System.out.println("car1对象存在吗"+contains);

        //删除第一个元素
        arrayList.remove(0);


        //清空数组集合
        arrayList.clear();

        arrayList.add(car1);
        arrayList.add(car2);

        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(car3);
        arrayList1.add(car4);

        arrayList.add(arrayList1);


        arrayList1.containsAll(arrayList);

        arrayList1.removeAll(arrayList);


        Iterator iterator1 = arrayList1.iterator();
        while (iterator1.hasNext()) {
            Object next = iterator1.next();
            System.out.println(next);
        }

        for (Object o :arrayList) {
            System.out.println(o);
        }


    }

    static class Car{
       private String name;
       private double price;

         public Car(String name, double price) {
             this.name = name;
             this.price = price;
         }

         @Override
         public String toString() {
             return "Car{" +
                     "name='" + name + '\'' +
                     ", price=" + price +
                     '}';
         }

         public String getName() {
             return name;
         }

         public void setName(String name) {
             this.name = name;
         }

         public double getPrice() {
             return price;
         }

         public void setPrice(double price) {
             this.price = price;
         }
     }
}

