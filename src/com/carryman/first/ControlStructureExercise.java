package com.carryman.first;

import java.sql.SQLOutput;
import java.util.Scanner;


public class ControlStructureExercise {
    public static void main(String[] args) {


        /*1.缴费规则 可以通过几次
         * （1）本金>50000 一次交5%
         * (2)本金<=50000，一次交1000
         * 通过几次
         * */
//        double money = 100000;
//
//        int count = 0;
//        while (true){
//            if (money>50000){
//                money=money*0.95;
//                count++;
//            }else if (money>=1000){
//                money=money-1000;
//                count++;
//            }else{
//                break;
//            }
//
//
//            System.out.println(money);
//        }
//        System.out.println("可以经过"+count+"次");
//        //通过62次

        /*2.判断一个整数，属于那个范围？大于0，小于0，等于0
         *
         *
         *
         * */
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("整数检测器，请您输入一个整数");
//        int number = scanner.nextInt();
//        if (number>0){
//            System.out.println("正数");
//        }else if (number<0){
//            System.out.println("负数");
//        }else if (number == 0){
//            System.out.println("为零");
//        }else {
//            System.out.println("您输入的数值有误");
//        }

        /*3.判断哪个年份为闰年*/

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("闰年检测器,请输入一个年份");
//
//        int year = scanner.nextInt();
//
//        if (year%4==0 ||(year%100==0&&year%400!=0)){
//            System.out.println(year+"年是闰年");
//        }else {
//            System.out.println(year+"不是闰年");
//        }


        /*4.判断水仙花数*/
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("水仙花数判断器，请输入一个三位整数");
//
//        int i = scanner.nextInt();
        //百位往上
//        int  bai = i / 100;
        //十位
//        int  shi = (i%100)/10;
        //个位
//        int  ge = i%10;
//
//
//
//
//        System.out.println(bai);
//        System.out.println(shi);
//        System.out.println(ge);
//
//        if (i == (Math.pow(bai,3) + Math.pow(shi,3) + Math.pow(ge,3))){
//            System.out.println(i+"是水仙花数");
//        }else {
//            System.out.println(i+"不是水仙花数");
//        }

//        int temp=0;
//        int newge= i%10;
//        temp=i/10;
//        int newshi=temp%10;
//        temp=temp/10;
//        int newbai=temp%10;
//        System.out.println("新算法"+" "+newbai+newshi+newge);





        /*5.代码输出了什么*/

//        int m =0,n=3;
//        if (m > 0){
//            if (n>2)
//                System.out.println(1);
//            else
//                System.out.println("2");
//        }
//
//        //答：跳出if分支，什么都不输出


        /*6。输出1-100之间不能被5整除的数，每5个一行*/
//        int count = 0;
//        for (int i = 1; i <=100 ; i++) {
//
//                if (i%5!=0){
//                    System.out.print(i+"\t");
//                    count++;
//
//                    if (count%5==0){
//                        System.out.println();
//                    }
//
//                }
//
//
//        }

        /*7.输出小写的a-z以及大写的Z-A*/

//        for (char i = 'a'; i <='z' ; i++) {
//            System.out.print(i +" ");
//        }
//        System.out.println();
//        for (char i = 'Z'; i >='A' ; i--) {
//            System.out.print(i+" ");
//        }


        /*8.求出1-1/2+1/3-1/4...1/100的和*/
//        double sum = 0;
//        for (double i = 1; i <=100; i++) {
//
//            if (i%2!=0){
//                sum+=1.0/i;
//            }
//            else{
//                sum = sum - (1.0 / i);
//            }
//
//        }
//        System.out.println(sum);
        //0.688172179310195


        /*9. 求1+（1+2）+（1+2+3）+(1+2+3+...+100)*/

//        int sum = 0;
//        int i = 1;
//        for (; i <=100; i++) {
//            for (int j = 1; j <=i; j++) {
//                sum+=j;
//                System.out.print(j+"+");
//            }
//            System.out.println();
//
//        }
//        System.out.println(sum);
//        //结果为：171700


    }

}
