package com.carryman.thread_.work;

import java.util.Scanner;

/**
 * @author carry man
 * @version 1.0
 */
public class work03 {
    public static void main(String[] args) {
        PrintNumber printNumber = new PrintNumber();
        UserInput userInput = new UserInput();
        new Thread(printNumber).start();
        new Thread(userInput).start();

    }
}

class UserInput implements Runnable{

    private   Scanner scanner = new Scanner(System.in);
    @Override
    public void run() {


        while (true){
            String next = scanner.next();
            if ("q".equals(next)){
                PrintNumber.setFlag(false);
                break;
            }
        }

    }
}


class PrintNumber implements Runnable{
    private static boolean flag=true;

    public static void setFlag(boolean flag) {
        PrintNumber.flag = flag;
    }

    @Override
    public void run() {
        while (flag){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            double random = 100*Math.random()+1;
            System.out.println((int)random);
        }

    }
}
