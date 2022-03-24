package com.carryman.thread_.work;

/**
 * @author carry man
 * @version 1.0
 */
public class work04 {
    public static void main(String[] args) {
        Person person = new Person();
        new Thread(person).start();
        new Thread(person).start();
    }
}

class Person implements Runnable {
    private static  int salary=10000;
    private int money = 3213;


    @Override
    public void run() {
        while (true){
            System.out.println("取钱金额为"+money);

        synchronized (this){
            if (money!=0){
                if (salary<money){
                    System.out.println(Thread.currentThread().getName()+"卡上余额为不足，卡内余额："+salary);
                    break;
                }
                salary=salary-money;

                System.out.println(Thread.currentThread().getName()+"ATM取钱中..余额："+salary);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                System.out.println("取款金额不能为0");
                break;
            }



        }

        }
    }
}
