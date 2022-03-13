package com.carryman.collection_.list_;

import java.sql.SQLOutput;
import java.util.LinkedList;

/**
 * @author carry man
 * @version 1.0
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(null);
        linkedList.add(null);
        linkedList.add(null);
//        linkedList.add("你好");
//        linkedList.add("你好");
//
//        boolean s = linkedList.contains("你好");
//        int index = linkedList.indexOf("你好");
//
//
//        System.out.println(index);
//        linkedList.remove("你好");
//        linkedList.removeFirst();
//
//
//
//        linkedList.set(1,"随心所欲");



        for (Object o : linkedList) {

            System.out.println(o);
        }


        for (int i = 0; i < linkedList.size(); i++) {
            Object o = linkedList.get(i);

            System.out.println(o);
        }
    }
}
