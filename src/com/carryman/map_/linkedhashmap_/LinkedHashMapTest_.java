package com.carryman.map_.linkedhashmap_;

import java.util.LinkedHashMap;

/**
 * @author carry man
 * @version 1.0
 */
public class LinkedHashMapTest_ {
    public static void main(String[] args) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(null,1);
        linkedHashMap.put(1111,1);
        linkedHashMap.put(22,1);
        linkedHashMap.put(555,1);
        System.out.println(linkedHashMap);
    }
}
