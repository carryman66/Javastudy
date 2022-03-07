package com.carryman.throwable;

import java.io.File;
import java.util.Scanner;

/**
 * @author carry man
 * @version 1.0
 */
public class test {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        int i = 0;

        while (true){
            System.out.println("输入数字");

            try {
                i = Integer.parseInt(scanner.next());
                break;
            } catch (Exception e) {
                System.out.println("输入错误，重新输入");

            }
        }
            System.out.println(i);





    }
}
