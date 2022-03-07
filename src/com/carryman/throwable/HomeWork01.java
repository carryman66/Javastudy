package com.carryman.throwable;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author carry man
 * @version 1.0
 */
public class HomeWork01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i1 = 0;
        int i2 = 0;
        try {
            System.out.println("输入您计算的第一个数字");

            i1 = scanner.nextInt();
            System.out.println("输入您计算的第二个数字");
            i2 = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("请输入数字");
        }

        try {
            cal(i1, i2);
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        }


    }

    public static void cal(int a, int b) {
        System.out.println(a / b);
    }
}
