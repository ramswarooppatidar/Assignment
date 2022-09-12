package com.company;


 class circle1 {
     private int radius;
     private float area;
     private float perimeter;

     public void radius(int r) {
         radius = r;
     }

     public float setarea(float a) {
         area = 3.314f * radius * radius;
         if (a == area) {
             area = a;
         } else {
             System.out.println("wrong value of area");
         }
         return area;
     }
     public void setperimeter(float a) {
         perimeter = 2 * 3.314f * radius;
         if (a == perimeter) {
             perimeter = a;
         } else {
             System.out.println("perimeter is wrong");}

         }
     }

public class CWH_40_EXERCISE {
    public static void main(String[] args) {
        circle1 cr=new circle1();
        cr.radius(5);
        cr.setarea(82.85f);
        cr.setperimeter(33.14f);
        System.out.println(cr.setarea(82.85f));

    }
}

