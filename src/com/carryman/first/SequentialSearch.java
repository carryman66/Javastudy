package com.carryman.first;

import java.util.Scanner;

public class SequentialSearch {

    /*循序查找*/
    public static void main(String[] args) {
        /*
        * 1.定义字符串数组
        * 2.循环数组一个一个判断
        * 3.没有找到 新增状态码 index
        *
        */

        int [] arrays = {11,22,33,44};
        int index = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入查找的数");
        int num = scanner.nextInt();

        for (int i = 0; i < arrays.length; i++) {
            if (num == arrays[i]){
                System.out.println("找到了，下标为"+i);
                index=i;
                break;
            }

        }

        if (index==-1){
            System.out.println("没有找到数字");
        }
    }
}
