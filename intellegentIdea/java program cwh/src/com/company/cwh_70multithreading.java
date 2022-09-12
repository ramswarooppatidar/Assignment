package com.company;

class Mythread1 extends Thread{
    @Override
    public void run() {
        int i=0;
        while (i<400) {
            System.out.println("my thread is running");
            System.out.println("i am happy1");
            i++;
        }
    }
}
class Mythread2 extends Thread{
    @Override
    public void run() {
        int i=0;
        while (i<400) {
            System.out.println(" thread is good");
            System.out.println("i am sad2");
            i++;
        }
    }
}
public class cwh_70multithreading {
    public static void main(String[] args) {
        Mythread1 t1=new Mythread1();
        Mythread2 t2=new Mythread2();
        t1.start();
        t2.start();

    }
}


