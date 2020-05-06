package com.demo.thread;

import java.util.concurrent.TimeUnit;

public class TestThread {
    public static void main(String[] args) {
        Thread a = new Thread(){
            @Override
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        a.start();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        a.start();

    }
}
