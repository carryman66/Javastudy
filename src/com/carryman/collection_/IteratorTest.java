package com.carryman.collection_;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author carry man
 * @version 1.0
 */
public class IteratorTest {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.add("tom1");
        arrayList.add("tom2");
        arrayList.add("tom3");

        //使用迭代器ietrator，得到集合初始游标
        Iterator iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }








    }
}
