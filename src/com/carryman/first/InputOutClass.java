package com.carryman.first;

import java.util.Scanner;

public class InputOutClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入姓名！！");
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        System.out.println("您的姓名是" + name);
    }
}
