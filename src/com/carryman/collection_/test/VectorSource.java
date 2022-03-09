package com.carryman.collection_.test;

import java.util.Vector;

/**
 * @author carry man
 * @version 1.0
 */
public class VectorSource {
    public static void main(String[] args) {
        Vector vector = new Vector();
        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }
        vector.add(100);
        System.out.println(vector);
    }
}
