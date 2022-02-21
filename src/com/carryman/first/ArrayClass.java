package com.carryman.first;

import java.util.Scanner;

public class ArrayClass {
    public static void main(String[] args) {

//        double [] hens ={1,22,121,3,1,1};
//
//        double sum = 0;
//        for (int i = 0; i < hens.length; i++) {
//            sum+=hens[i];
//            System.out.println("第"+(i+1)+"个元素"+hens[i]);
//        }
//
//        System.out.println("总体重 :"+sum);
//        System.out.println("平均体重 :"+sum/ hens.length);


//        int[] ints = new int[2];
//        for (int i = 0; i < ints.length; i++) {
//            System.out.println(ints[i]);
//        }



        /*array 存储26个英文字母并且打印*/
//        char[] letters=new char[26];
//        for (int i = 0; i < letters.length; i++) {
//
//            letters[i]=(char)('A'+i);
//
//        }
//
//        for (int i = 0; i < letters.length; i++) {
//            System.out.println(letters[i]);
//        }


        /*求出数组中最大的值 并且得到对应下标*/

//        int [] arrays = {43,-41,11,22,32,133};
//        int max = arrays[0];
//        int indexMax=0;
//        for (int i = 0; i < arrays.length; i++) {
//            if (max<arrays[i]){
//                max =arrays[i];
//                indexMax=i;
//
//            }
//
//        }
//        System.out.println(max+" "+indexMax);



//        int [] arrays = new int[]{1,2,3};
//
//        int [] array2 = arrays;
//
//
//        array2[0]=99;
//
//
//
//        for (int i = 0; i < arrays.length; i++) {
//            System.out.print(arrays[i]);
//        }
//        System.out.println(" ");
//        System.out.println(" ");
//
//        for (int i = 0; i < array2.length; i++) {
//            System.out.print(array2[i]);
//        }
//
//
//
//        System.out.println(" ");
//
//
//
//        System.out.println(arrays);;
//        System.out.println(array2);;



        /*数组拷贝，将int[] arr1 = {10，20，30} 拷贝到arr2数组中，要求数据空间独立*/

//        int[] arr1={10,20,30};
//        int[] arr2 = new int[arr1.length];
//
//        for (int i = 0; i <arr1.length; i++) {
//            arr2[i] = arr1[i];
//        }
//        System.out.println("==============");
//        for (int e : arr1) {
//            System.out.println(e);
//        }
//        arr2[2]=1000;
//        for (int e : arr2) {
//            System.out.println(e);
//        }




        /*数组反转*/

//        int [] arr = {11,22,33,44,55};
//
//        for (int i = 0; i < arr.length/2; i++) {
//            int temp = arr[arr.length-1-i];
//            arr[arr.length-1-i]=arr[i];
//            arr[i]=temp;
//
//        }
//        for ( int e : arr) {
//            System.out.println(e);
//        }

        /*数组反转解法2*/

//        int [] arr = {11,22,33,44,55};
//        int[] ints = new int[arr.length];
//
//        System.out.println(arr);
//        System.out.println(ints);
//        for (int i = arr.length-1; i >= 0; i--) {
//              ints [arr.length-i-1] = arr[i];
//        }
//        arr=ints;
//        for (int s : arr){
//            System.out.println(s);
//        }
//        System.out.println(arr);


        /*数组扩容*/

//        int [] arrays = {1,2,3};
//        System.out.println("当前数组");
//        for (int array : arrays) {
//            System.out.println(array);
//        }
//
//        Scanner scanner = new Scanner(System.in);
//
//
//        System.out.println("输入扩容数值");
//        int i = scanner.nextInt();
//
//        int [] arrays2=new int[arrays.length+1];
//
//
//        for (int i1 = 0; i1 < arrays.length; i1++) {
//            arrays2[i1]=arrays[i1];
//        }
//        arrays2[arrays.length]=i;
//
//        arrays=arrays2;
//        for (int i1 : arrays) {
//            System.out.println(i1);
//        }
        

        /*数组扩容2 选择是否继续扩容*/

//        int [] arrays = {1,2,3};
//        System.out.println("当前数组");
//        for (int array : arrays) {
//            System.out.println(array);
//        }
//        do {
//
//            Scanner scanner = new Scanner(System.in);
//
//
//            System.out.println("输入扩容数值");
//
//
//            int i = scanner.nextInt();
//
//            int [] arrays2=new int[arrays.length+1];
//
//
//            for (int i1 = 0; i1 < arrays.length; i1++) {
//                arrays2[i1]=arrays[i1];
//            }
//            arrays2[arrays.length]=i;
//
//            arrays=arrays2;
//            for (int i1 : arrays) {
//                System.out.println(i1);
//            }
//
//            System.out.println("是否继续扩容y/n");
//            char c = scanner.next().charAt(0);
//            if (c!='y'){
//                break;
//            }
//
//        }while (true);



















































































































    }
}
