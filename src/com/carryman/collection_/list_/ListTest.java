package com.carryman.collection_.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author carry man
 * @version 1.0
 */
public class ListTest {
    public static void main(String[] args) {

        List list = new ArrayList();

        list.add("tom");
        list.add("dog");
        list.add("cat");


        System.out.println(list);
        list.add(1,"慧能");
        System.out.println(list);

        int index = list.indexOf("慧能");
        System.out.println(index);

        list.remove(1);
        System.out.println(list);


        list.set(1,"王守仁");
        System.out.println(list);

        System.out.println(list.size());

        List list1 = list.subList(1, 2);
        System.out.println(list1);


    }
}
