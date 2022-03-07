package com.carryman.commonclass.arrays_;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author carry man
 * @version 1.0
 */
public class ArraysTest {
    public static void main(String[] args) {

        //返回数组字符串形式
        Integer [] integers= {1,32,4,12,33,120};
        String s = Arrays.toString(integers);
        System.out.println(s);

        //sort排序，排序会影响到实参

        Arrays.sort(integers);

        System.out.println(Arrays.toString(integers));


        //sort排序可以定制排序，第一个传入数组，第二个实现Comparator接口

        Arrays.sort(integers, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;

                return i1-i2;
            }
        });
        //自定义排序后
        System.out.println(Arrays.toString(integers));

        //二分查找必须，必须排好顺序
        int i = Arrays.binarySearch(integers, 20);
        System.out.println(i);

        //复制数组，指定新数组长度
        Integer[] integers1 = Arrays.copyOf(integers, integers.length);
        System.out.println(Arrays.toString(integers1));
        //比较数组元素值是否一样
        boolean equals = Arrays.equals(integers, integers1);
        System.out.println(equals);
        //替换元素
        Arrays.fill(integers1,11);
        System.out.println(Arrays.toString(integers1));


        //转化为List集合
        List integers2 = Arrays.asList(1, 2, 3, 31);
        System.out.println(integers2);
        //使用数组类种的asList返回的运行时类型是Arrays种的ArrayList内部类
        Class<? extends List> aClass = integers2.getClass();

        //class java.util.Arrays$ArrayList
        System.out.println(aClass);

    }
}
