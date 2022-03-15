package com.carryman.map_.test;

import java.util.*;

/**
 * @author carry man
 * @version 1.0
 */
public class test {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(null, 123);
        map.put("15", 123);
        map.put("15", 122223);
        map.put("163", 123);
        map.put("173", 123);

        Set set = map.entrySet();

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }


        Set set1 = map.keySet();

        Collection values = map.values();



        for (Object o : set1) {
            System.out.println(o);
        }

    }
}
