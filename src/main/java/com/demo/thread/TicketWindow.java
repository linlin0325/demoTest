package com.demo.thread;

public class TicketWindow extends Thread {
    private final String name;
    private static final int MAX = 50;
    private static int index = 1;
    public TicketWindow(String name){
        this.name = name;
    }

    @Override
    public void run() {
        while (index <= MAX){
            System.out.println("柜台:"+ name + " 当前号:"+ (index++));
        }
    }

    public static void main(String[] args) {
        TicketWindow t1 = new TicketWindow("1号");
        TicketWindow t2 = new TicketWindow("2号");
        TicketWindow t3 = new TicketWindow("3号");
        TicketWindow t4 = new TicketWindow("4号");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
