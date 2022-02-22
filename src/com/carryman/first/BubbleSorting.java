package com.carryman.first;

public class BubbleSorting {
    /*冒泡 排序*/

    /*四轮 外层循环时4次
     每轮比较-1次 4 3 2 1 */

    public static void main(String[] args) {
        int[] arrays = {32,12,45,21,46,42,31,-1,111};

        for (int i = 0; i < arrays.length-1; i++) {

            for (int j = 0; j <arrays.length-1-i; j++) {

                if (arrays[j]>arrays[j+1]){
                    int temp ;
                    temp=arrays[j+1];
                    arrays[j+1] = arrays[j];
                    arrays[j]=temp;
//
//                    int temp;
//                    temp = arrays[i];
//                    arrays[i]=arrays[i+1];
//                    arrays[i+1]=temp;
                }

            }
        }
        for (int e: arrays) {
            System.out.print(e+" ");
        }
    }
}
