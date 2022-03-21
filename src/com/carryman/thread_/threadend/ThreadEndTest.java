package com.carryman.thread_.threadend;

/**
 * @author carry man
 * @version 1.0
 */
public class ThreadEndTest {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        new Thread(t).start();

        Thread.sleep(1000*10);

        t.setLoop(false);

    }
}

//线程终止 ，使用通知
class T implements Runnable{

    private boolean loop = true;


    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        while (loop) {
            int a = 0;
            System.out.println(Thread.currentThread().getName() + "正在运行" + ++a);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
