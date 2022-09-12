package com.company;

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i=34;
        while(i<=35){
            System.out.println("i am in thread");
            i--;
        }
    }

}

public class CwH_73_ConstructorThread {
    public static void main(String[] args) {
        MyThr t=new MyThr("RAMSWAROP PATIDAR");
        MyThr t1=new MyThr("harry");
        t.start();
        t1.start();
        System.out.println("the id of thread is:"+t.getId());
        System.out.println("the name of thread is:"+t.getName());
        System.out.println("the id of thread is:"+t1.getId());
        System.out.println("the name of thread is:"+t1.getName());

    }
}
