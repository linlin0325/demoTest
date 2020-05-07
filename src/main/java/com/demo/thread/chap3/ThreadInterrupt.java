package com.demo.thread.chap3;

import java.util.concurrent.TimeUnit;

public class ThreadInterrupt {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            try {
                TimeUnit.MINUTES.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("线程被打断");
            }
        });
        thread.start();
        TimeUnit.MILLISECONDS.sleep(2);
        thread.interrupt();
    }
}
