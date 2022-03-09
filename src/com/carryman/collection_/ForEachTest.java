package com.carryman.collection_;

import java.util.ArrayList;

/**
 * @author carry man
 * @version 1.0
 */
public class ForEachTest {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.add("tom1");
        arrayList.add("tom2");
        arrayList.add("tom3");

        //在集合上使用增强for循环，底层还是迭代器
        for (Object o: arrayList) {
            System.out.println(o);
        }


        //使用for循环

        for (int i = 0; i < arrayList.size(); i++) {
            Object o = arrayList.get(i);
            System.out.println(o);
        }


    }
}
