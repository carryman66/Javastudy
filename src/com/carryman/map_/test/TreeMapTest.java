package com.carryman.map_.test;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author carry man
 * @version 1.0
 */
public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).compareTo((String)o2);
            }
        });

//        TreeMap treeMap = new TreeMap(new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                return ((String)o1).length()-((String)o2).length();
//            }
//        });
        treeMap.put("aaasdasddddffa",21);
        treeMap.put("caffaaafffffffffa",null);
        treeMap.put("adadaaaaaasdaa",21);
        System.out.println(treeMap);




    }
}
