package com.carryman.collection_;

import java.util.ArrayList;

/**
 * @author carry man
 * @version 1.0
 */
public class CollectionTest {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();

        arrayList.add(true);

        arrayList.add(123.2);
        arrayList.add("tom");
        System.out.println(arrayList);

        arrayList.remove(0);
        arrayList.remove(true);


        System.out.println(arrayList);

        System.out.println(arrayList.isEmpty());

        System.out.println(arrayList.contains("tom"));

        arrayList.clear();

        ArrayList arrayList1 = new ArrayList();
        arrayList1.add("三国");
        arrayList1.add("坛经");
        arrayList1.add("传习录");



        arrayList.addAll(arrayList1);


        System.out.println(arrayList);

        boolean b = arrayList.containsAll(arrayList1);
        System.out.println(b);


    }
}
