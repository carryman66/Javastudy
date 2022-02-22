package com.carryman.first;

public class ArrayExercise {
    public static void main(String[] args) {
        /*数组练习题*/

        /*1.选择题*/
        /*B D */

        /*2.结果题*/
        /*blue*/

        /*3.结果题*/
        /*1
        * 3
        * 5
        * 7
        *
        * */

        /*4.代码题*/
        /*已知升序的一个数组，要求插入一个元素后，该数组依然为升序*/
//        int [] arr = {10,12,45,90};
//        int number = 23;
//        int [] empArr=new int[arr.length+1];
//        int index=-1;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (number<=arr[i]) {
//                index = i;
//                break;
//            }
//        }
//        if (index==-1){
//            index=arr.length;
//        }
//
//        for (int i = 0,j=0; i < empArr.length; i++) {
//
//
//            if(i!=index){
//                empArr[i] =arr[j];
//                j++;
//
//            }else {
//                empArr[index] = number;
//            }
//
//
//
//        }
//
//
//        System.out.println("索引"+index);
//
//
//
//
//        for (int e : empArr) {
//            System.out.println(e);
//        }

        /*5.随机生成10个整数1-100保存在数组，并倒序打印求平均值，最大值，和最大值的下标
        * 并且查找里面是否有8
        * */


//        int [] arrays=new int[10];
//
//        for (int i = 0; i < 10; i++) {
//            arrays[i]= (int)( (Math.random() * 100)+1);
//        }
//        boolean is8=false;
//        int max=0;
//        int maxIndex=-1;
//        int sum=0;
//        for (int i =arrays.length-1; i >= 0 ; i--) {
//            if (arrays[i]==8){
//                is8=true;
//            }
//            if (arrays[i]>=max){
//                max=arrays[i];
//                maxIndex=i;
//            }
//            sum+=arrays[i];
//
//            System.out.print(arrays[i]+" ");
//
//        }
//
//        System.out.println("sum="+sum+" 平均值="+1.0*sum/arrays.length);
//        System.out.println("最大值："+max+" 下标："+(arrays.length-1-maxIndex));
//        System.out.println("有8吗"+ is8);


        /*6.冒泡排序*/


        int [] arr= {12,-12,32,123,36};
        int temp ;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j <arr.length-1-i; j++) {
                if (arr[j]<arr[j+1]){

                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }


        for (int e: arr) {
            System.out.print(e+"\t");
        }












    }
}
