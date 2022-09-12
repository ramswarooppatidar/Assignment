package com.company;

import jdk.swing.interop.SwingInterOpUtils;

class circle{
    public int radius;
    circle(){
        System.out.println("i am non parm constructor");
    }
    circle(int r){
        System.out.println("i am circle constructor");
        radius=r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
    class cylinder1 extends circle{
        public int height;
        cylinder1(int r,int h){
          super(r);
            System.out.println("i am cylinder1 perameteried constructor");
            height=h;

        }
        public double volume(){
          return Math.PI *radius*radius*height;
        }
}
class rectangle1{
    public int length;
    public int breadth;
     rectangle1(int l,int b){
         System.out.println("i am a rectangle1 constructor");
         length=l;
         breadth=b;
     }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public double areaOfRectangle(){
         System.out.println("area of rectagle is "+length*breadth);
         return length*breadth;
     }
     public int perimeterofrectangle(){
         System.out.println(" perimeter of rectangle is "+ 2*(length+breadth));
         return  2*(length+breadth);
     }
}
     class cuboide extends rectangle1{
              public int height;

         public int getHeight() {
             return height;
         }

         public void setHeight(int height) {
             this.height = height;
         }

         cuboide(int l, int b, int h){
               super(l,b);
               System.out.println("i am cuboide constructor set height");
               height=h;
           }
           public int areaofcuboide(){
               System.out.println("area of cuboide is " +2*(length*breadth+length*height+breadth*height));
               return 2*(length*breadth+length*height+breadth*height) ;
           }

        }
public class CWH_52_CHP10PS {
    public static void main(String[] args) {
  // prolem 1---cretae a class circle and use inheritance to create  nother clas cylinder from it
      //  circle objc=new circle(5);
      cylinder1 obj1=new cylinder1(12,4);
      //  System.out.println(objc.area());


        //problem 2
        rectangle1 re=new rectangle1(3,8);
        cuboide cb=new cuboide(5,7,9);
       /* System.out.println(re.areaOfRectangle());
        System.out.println(cb.areaofcuboide());  */

        //getter setterr

        re.length=8;
        re.breadth=4;
    }
}
