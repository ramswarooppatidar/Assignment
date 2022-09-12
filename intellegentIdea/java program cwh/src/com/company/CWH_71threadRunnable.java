package com.company;
class MythreadRunnable1 implements Runnable {





    public void run() {
        System.out.println("i am a thread not a threat 1");

    }
}

class MythreadRunnable2 implements Runnable{
    public void run(){
        System.out.println("i am a thread not a threat 2");
    }
}

public class CWH_71threadRunnable {
    public static void main(String[] args) {
         MythreadRunnable1 bullet1=new MythreadRunnable1();
         Thread gun1=new Thread(bullet1);

         MythreadRunnable2 bullet2=new MythreadRunnable2();
         Thread gun2=new Thread(bullet2);
         gun1.start();
         gun2.start();

    }
}
