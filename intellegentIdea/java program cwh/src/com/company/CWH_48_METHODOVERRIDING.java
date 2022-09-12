package com.company;
class A{
    public int harry(){
        return 4;
    }

     public void method2(){
         System.out.println(" i am amethod2 of class A");
     }
    }
    class B extends A{
    @Override
    public void method2(){
        System.out.println("i am method two of class B");
}
    public void method3(){
        System.out.println("i am method 3 of class B");
    }
    }

public class CWH_48_METHODOVERRIDING {
    public static void main(String[] args) {
        A a=new A();
        a.method2();
        B b=new B();
        b.method2();
    }
}
