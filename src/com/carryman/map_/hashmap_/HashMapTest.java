package com.carryman.map_.hashmap_;

import java.util.HashMap;
import java.util.Set;

/**
 * @author carry man
 * @version 1.0
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("one",123);
        hashMap.put("one",123);
        hashMap.put("e",123);
        hashMap.put("oe",123);

        hashMap.replace("e",321);

        int size = hashMap.size();
        System.out.println(size);

        System.out.println(hashMap);

        hashMap.put("传习传","王阳明");


        System.out.println(hashMap);

        hashMap.clear();
        System.out.println(hashMap);

        boolean empty = hashMap.isEmpty();
        System.out.println(empty);

        hashMap.put("六祖坛经","慧能");

        boolean key = hashMap.containsKey("六祖坛经");

        System.out.println(key);


    }
}
