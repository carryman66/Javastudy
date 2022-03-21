package com.carryman.thread_;

/**
 * @author carry man
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();
        int i = runtime.availableProcessors();
        System.out.println("cpu核心"+i);
    }
}
