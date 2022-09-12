package com.company;
abstract class parent {
    public parent() {
        System.out.println("i am constructore of base class");
    }

    public void sayHello() {
        System.out.println("hello");
    }

    abstract public void greet();
    abstract public void greet2();
}
 class child2 extends parent{
    @Override
        public void greet(){
             System.out.println("good morning");
       }
       public  void greet2(){
           System.out.println("good afternoon");
       }
 }
   abstract class child3 extends parent{
        public void th(){
            System.out.println("i am good");
        }
    }
    public class CWH_53_ABSTRACTCLASScHPTR11 {
        public static void main(String[] args) {
            child2 c = new child2();
        //    parent p = new parent();----through error
        //    child3 ch=new child3();---through error
        }

}