package com.demo.thread.chap3;

import java.util.concurrent.TimeUnit;

public class ThreadisInterrupted {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(){
            @Override
            public void run() {
                while (true){}
            }
        };
//        thread.setDaemon(true);
        thread.start();
        TimeUnit.MILLISECONDS.sleep(2);
        System.out.println("is interrupted:"+thread.isInterrupted());
        thread.interrupt();
        System.out.println("is interrupted:"+thread.isInterrupted());
    }
}
