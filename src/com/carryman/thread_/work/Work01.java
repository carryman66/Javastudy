package com.carryman.thread_.work;

/**
 * @author carry man
 * @version 1.0
 */
public class Work01 {
    public static void main(String[] args) {
        //买票，需要三个窗口同时售票，开启多线程
//        SellTicket sellTicket1 = new SellTicket();
//        SellTicket sellTicket2 = new SellTicket();
//        SellTicket sellTicket3 = new SellTicket();
//        sellTicket1.start();
//        sellTicket2.start();
//        sellTicket3.start();

        SellTicket02 sellTicket02 = new SellTicket02();
        Thread thread1 = new Thread(sellTicket02);
        Thread thread2 = new Thread(sellTicket02);
        Thread thread3 = new Thread(sellTicket02);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
//使用Thread，售票
class SellTicket extends Thread{
    //线程共享
    private static int num=100;

    @Override
    public void run() {
        while (true){

            if (num<=0){
                break;
            }

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"窗口售出一张票，剩余票数"+--num);

        }
    }
}

class SellTicket02 implements Runnable{
    private int num = 100;

    @Override
    public void run() {
        while (true){
            if (num<=0){
                break;
            }

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"窗口售出一张票，剩余票数"+--num);

        }
        }


}
