package com.carryman.map_.hashtable_;

import java.util.Hashtable;

/**
 * @author carry man
 * @version 1.0
 */
public class HashTableTest {
    public static void main(String[] args) {

        Hashtable hashtable = new Hashtable();
        hashtable.put("123",321);
        hashtable.put("122223",321);
        hashtable.put("133123",321);
        hashtable.put("12113",321);

        hashtable.remove("123");

        hashtable.put("12113","🐂");


        Object o = hashtable.get("12113");

        System.out.println(o);

    }
}
