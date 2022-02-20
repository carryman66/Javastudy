package com.carryman.first;

import java.util.Scanner;

public class BreakClass {
    public static void main(String[] args) {
        /*break练习*/
//        int count=0;
//
//        while (true){
//            count++;
//            if ((int)(Math.random()*100)==0){
//                break;
//            }
//
//        }
//        System.out.println(count);

        /*label练习*/
//        label1:
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 10; j++) {
//                if (j == 2) {
//                    break label1;
//                }
//                System.out.println("i=" + i + ",j=" + j);
//
//            }
//
//        }



        /*break 练习2*/
        /*1-100 的数累计求和，当第一次大于20的时候*/
//        int sum = 0;
//        //退出时候还要保存
//        int n= 0;
//        for (int i = 1; i <=100 ; i++) {
//            sum+=i;
//            if (sum>20){
//                System.out.println("第一次大于20，i="+i+"，sum="+sum);
//                n=i;
//                break;
//            }
//        }
//
//        System.out.println(n);






        /*实现登录验证，有三次机会，如果用户名为"carryman" 密码为"666" 则提示登录成功，否则提示还有几次机会*/
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入您的用户名");
            String username = scanner.nextLine();
            System.out.println("请输入您的密码");
            String password = scanner.nextLine();
            if (username.equals("") && password.equals("666")) {
                System.out.println("登录成功！！" + username + " " + password);
                break;
            } else {
                if (3 - i != 0) {
                    System.out.println("还有" + (3 - i) + "次机会");
                } else {
                    System.out.println("您没有机会了！封禁帐号15分钟");
                }


            }
        }


    }
}
