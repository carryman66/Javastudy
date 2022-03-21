package com.carryman.thread_.ImplRunnableTest;

/**
 * @author carry man
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Thread thread = new Thread(dog);
        thread.start();
        while (true){
            System.out.println("主线程继续"+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class  Dog implements Runnable{
    private int count= 0;

    @Override
    public void run() {
        while (true){
            count++;
            System.out.println("小狗叫第"+count+"次"+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
