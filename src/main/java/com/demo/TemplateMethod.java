package com.demo;

public class TemplateMethod {
    public final void print(String msg){
        System.out.println("-----------------");
        warpPrint(msg);
        System.out.println("-----------------");
    }
    protected void warpPrint(String msg){};

    public static void main(String[] args) {
        TemplateMethod a = new TemplateMethod(){
            @Override
            public void warpPrint(String msg) {
                System.out.println("自定义  aaaaaaaaaaaaaaaa");
            }
        };
        TemplateMethod b = new TemplateMethod(){
            @Override
            public void warpPrint(String msg) {
                System.out.println("自定义 bbbbbbbbbbbbbbbbb");
            }
        };
        a.print("111111111111");
        b.print("22222222222222");
    }
}
