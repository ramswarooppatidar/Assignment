package com.company;
class base1{

    base1(){
        System.out.println("i am a constructor");
    }
    base1(int x){
        System.out.println("i am an overloaded constructor with value of a as " +x);
    }

}
    class derived1 extends base1{

       derived1(){
          super(0);
           System.out.println("i am derived class constructor");
       }
        derived1(int x,int y){
           super(x);
            System.out.println("i am an overloaded constructor with value of y as" +y);
        }
    }
    class childofderived extends derived1{
      childofderived(){
          System.out.println("i am a child of derived1 constructor");
      }
      childofderived(int x,int y,int z){
          super(x,y);
          System.out.println("i am an overloaded constructor of derived1 with value of z is "+z);
      }
        }

public class CWH_46_constructorInheritance {
    public static void main(String[] args) {
      //  base1 b=new base1();
        //derived1 d=new derived1();
      //  derived1 d=new derived1(14,9);
      //   childofderived cd=new childofderived();
    	System.out.println("...");
         childofderived cd=new childofderived(5,6,7);


    }
}
