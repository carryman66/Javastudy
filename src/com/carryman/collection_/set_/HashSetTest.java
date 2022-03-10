package com.carryman.collection_.set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author carry man
 * @version 1.0
 */
public class HashSetTest {
    public static void main(String[] args) {
//        Set set = new HashSet();
//        set.add("动心忍性");
//        set.add("增益其所不能");
//        set.add("格物致知");
//        set.add("出示的精神做入世的事情");
//
//
//        Iterator iterator = set.iterator();
//        while (iterator.hasNext()) {
//            Object next = iterator.next();
//            System.out.println(next);
//        }
        HashSet hashSet = new HashSet();
        hashSet.add("动心忍性");
        hashSet.add("增益其所不能");
        hashSet.add("格物致知");
        hashSet.add("出示的精神做入世的事情");


        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }





    }
}
