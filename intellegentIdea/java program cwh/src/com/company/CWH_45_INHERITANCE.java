package com.company;
class base{
    int x;

    public int getX() {

        return x;
    }

    public void setX(int x) {
        System.out.println("i am in base and setting x now");

        this.x = x;

    }public void printme(){
        System.out.println("i am constructor");
    }

}
     class derived extends base{
    int y;

         public int getY() {
             return y;
         }

         public void setY(int y) {
             this.y = y;
         }
     }
public class CWH_45_INHERITANCE {
    public static void main(String[] args) {
     base b= new base();
     b.setX(4);
        System.out.println(b.getX());

        derived d=new derived();
        d.setX(43);
        System.out.println(d.getX());
        d.setY(7);
        System.out.println(d.getY());
    }
}
