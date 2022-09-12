package com.company;
class phone{
    public void showtime(){
        System.out.println("time is 8am");
    }
    public void on(){
        System.out.println("turuning on phone...");
    }
}
class smartphone extends phone{
      public void music(){
          System.out.println("playing music");
      }
      public void on(){
          System.out.println("turuning on smart phone....");
      }
}

public class CWH_49_DYNAMICMETHODDISPATCH {
    public static void main(String[] args) {


          //  phone obj=new phone();
          //  smartphone smobj=new smartphone();
         //   obj.showtime();
    phone obj=new smartphone();  // allowed and object of smphone class
    obj.showtime();
    obj.on();
   // obj.music();  //wrong not allowed
}
}
