package com.carryman.collection_.set_;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author carry man
 * @version 1.0
 */
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String a1=(String) o1;
                String a2=(String) o2;
                return a1.length()-a2.length();
            }
        });
        treeSet.add("aaa");
        treeSet.add("baa333");
        treeSet.add("baa323");
        treeSet.add("caa11");
        treeSet.add("da");
        treeSet.add("e");




        System.out.println(treeSet);
    }
}
