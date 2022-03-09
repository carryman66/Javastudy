package com.carryman.collection_.work;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author carry man
 * @version 1.0
 */
public class Work02 {
    public static void main(String[] args) {

        List list = new ArrayList();

        list.add("hello1");
        list.add("hello2");
        list.add("hello3");
        list.add("hello4");
        list.add("hello5");
        list.add("hello6");
        list.add("hello7");
        list.add("hello8");
        list.add("hello9");
        list.add("hello10");
        list.add("hello11");
        list.add("hello12");


        list.add(1,"业力");

        Object o = list.get(4);

        System.out.println(o);



        list.remove(5);



        list.set(6,"禅宗");


        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }







    }
}
