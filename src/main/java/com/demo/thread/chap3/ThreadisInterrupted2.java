package com.demo.thread.chap3;

import java.util.concurrent.TimeUnit;

public class ThreadisInterrupted2 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(){
            @Override
            public void run() {
                while (true){
                    try {
                        TimeUnit.MILLISECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        System.out.println("inside is interrupted"+isInterrupted());
                    }
                }
            }
        };
        thread.setDaemon(true);
        thread.start();
        TimeUnit.MILLISECONDS.sleep(2);
        System.out.println("is interrupted:"+thread.isInterrupted());
        thread.interrupt();
        TimeUnit.MILLISECONDS.sleep(2);
        System.out.println("is interrupted:"+thread.isInterrupted());
    }
}
