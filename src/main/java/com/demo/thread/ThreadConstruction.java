package com.demo.thread;

import java.util.stream.IntStream;

public class ThreadConstruction {
    private final static String PREFIX = "ALEX-";
    private static Thread createThread(final int i){
        return new Thread(
                ()-> System.out.println(Thread.currentThread().getName())
                ,PREFIX+i);
    }
    public static void main(String[] args) {
/*        IntStream.range(0,5).mapToObj(ThreadConstruction::createThread)
                .forEach(Thread::start);*/
        Thread t1 = new Thread("t1");
        System.out.println(t1.getThreadGroup());
        System.out.println(Thread.currentThread().getThreadGroup());
        ThreadGroup tg = new ThreadGroup("g2");
        Thread t2 = new Thread(tg,"t2");
        System.out.println(t2.getThreadGroup());
    }

}
