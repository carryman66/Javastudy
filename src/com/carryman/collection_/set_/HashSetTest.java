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
        hashSet.add("动心忍性1");
        hashSet.add("增益其所不能2");
        hashSet.add("格物致知3");
        hashSet.add("出示的精神做入世的事情4");
        hashSet.add("出示的精神做入世的事情5");
        hashSet.add("出示的精神做入世的事情6");
        hashSet.add("出示的精神做入世的事情7");
        hashSet.add("出示的精神做入世的事情8");
        hashSet.add("出示的精神做入世的事情9");
        hashSet.add("出示的精神做入世的事情10");
        hashSet.add("出示的精神做入世的事情11");
        hashSet.add("出示的精神做入世的事情12");
        hashSet.add("出示的精神做入世的事情13");
        hashSet.add("出示的精神做入世的事情14");


        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }





    }
}
