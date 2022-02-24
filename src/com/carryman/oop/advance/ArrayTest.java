package com.carryman.oop.advance;

import java.util.Arrays;

public class ArrayTest {


    public static void main(String[] args) {




        int[] arrays = {-1, 22, 44, 99, 20};

        //使用内置类排序
        Arrays.sort(arrays);

//        for (int i = 0; i < arrays.length - 1; i++) {
//            for (int j = 0; j < arrays.length - 1 - i; j++) {
//                int temp;
//                if (arrays[j] > arrays[j + 1]) {
//                    temp = arrays[j];
//                    arrays[j] = arrays[j + 1];
//                    arrays[j + 1] = temp;
//                }
//            }
//
//
//        }
        for (int e : arrays) {
            System.out.println(e);

        }
    }

}

