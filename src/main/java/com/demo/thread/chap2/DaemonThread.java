package com.demo.thread.chap2;

public class DaemonThread {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            while (true){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.setDaemon(true); // 设置守护线程，main结束就结束，否则继续执行
        thread.start();
        Thread.sleep(2_00L);
        System.out.println("--------------结束");
    }
}
