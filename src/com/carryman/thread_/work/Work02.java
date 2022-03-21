package com.carryman.thread_.work;

/**
 * @author carry man
 * @version 1.0
 */
public class Work02 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            System.out.println("主线程"+i);
            if (i==5){
                T t = new T();
                t.start();
                t.join();
            }
        }
        System.out.println("主线程结束。。。。。。");
    }
}
class  T extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("子线程"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("子线程结束。。。。。。");

    }
}
