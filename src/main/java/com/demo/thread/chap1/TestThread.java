package com.demo.thread.chap1;

import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class TestThread {
    public static void main(String[] args) {
        /*Thread a = new Thread(){
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
        a.start();*/

/*        IntStream.range(0,5).boxed().map(i -> new Thread(
                ()-> System.out.println(Thread.currentThread().getName())
                )
        ).forEach(Thread::start);*/

        IntStream.range(0,5).boxed().map(i -> new Thread(){
                    @Override
                    public void run() {
                        System.out.println(Thread.currentThread().getName());
                    }
                }
        ).forEach(Thread::start);

    }
}
