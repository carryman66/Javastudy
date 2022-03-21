package com.carryman.thread_.extendthread;

/**
 * @author carry man
 * @version 1.0
 */
public class ExtendThread01 {
    public static void main(String[] args) throws InterruptedException {
        Dog dog = new Dog();
        dog.start();
        while (true){
            //主线程
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName());
        }

    }






}
class Dog extends Thread{
    private int time;

    @Override
    public void run() {
        while(true){
            time++;
            //重写run方法
            System.out.println("狗来也!");
            //线程名字
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (time==10){
                break;
            }
        }

    }
}


