package com.carryman.map_.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author carry man
 * @version 1.0
 */
public class test {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(null, 123);
        map.put("15", 123);
        map.put("143", 123);
        map.put("163", 123);
        map.put("173", 123);

        Set set = map.entrySet();

        Set set1 = map.keySet();

        Collection values = map.values();



        for (Object o : set1) {
            System.out.println(o);
        }

    }
}
