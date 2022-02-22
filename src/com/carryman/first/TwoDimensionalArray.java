package com.carryman.first;

public class TwoDimensionalArray {
    public static void main(String[] args) {

        /*二维数组*/
//        int [][] arrays = {{0,0,0,0},{0,1,0,0},{0,0,1,0},{0,0,0,1}};
//        for (int i = 0; i < arrays.length; i++) {
//            for (int j = 0; j < arrays[i].length; j++) {
//                System.out.print(arrays[i][j]);
//            }
//            System.out.println();
//        }

//        int [][] arr = new int[10][];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = new int[i+1];
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j]=i+1;
//            }
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }


        /*遍历二维数组得到累计的和*/



        int [][] arr ={{1,2,3},{1,1,1},{1,1,1}};


        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                sum+=arr[i][j];

            }
        }
        System.out.println(sum);



    }
}
