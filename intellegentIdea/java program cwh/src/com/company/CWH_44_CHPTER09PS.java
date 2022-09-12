package com.company;
class cylinder {
    private int radius;
    private int height;

    public cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfacearea() {
        return 2 * 3.142 * radius * height + 2 * 3.142 * radius * radius;
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

    class ractangle{
        private int length;
        private int breadth;

        public int getLength() {
            return length;
        }

        public int getBreadth() {
            return breadth;
        }

        public ractangle(int length, int breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        public ractangle() {
            this.length = 4;
            this.breadth=5;
        }

    }

public class CWH_44_CHPTER09PS {
    public static void main(String[] args) {

   /*    //1 create  class of cylinder and use getter and setter to set its height and radius

        cylinder MyCylinder=new cylinder();
        MyCylinder.setHeight(12);
        int h=MyCylinder.getHeight();
        System.out.println(h);
        MyCylinder.setRadius(6);
        MyCylinder.setRadius(9);
        System.out.println(MyCylinder.getRadius());
        System.out.println(MyCylinder.surfacearea());   */

        //problem 2   ((calculate surface area and volume}}}}
      /* cylinder MyCylinder=new cylinder();

        MyCylinder.setHeight(15);
        MyCylinder.setRadius(10);
        System.out.println(MyCylinder.surfacearea());
        System.out.println(MyCylinder.volume());  */


        //PROBLEM 3 SOLVE ABOVE PROBLEM USING CONSTRUCTOR


     /*   cylinder MyCylinder=new cylinder(12,25);
        System.out.println(MyCylinder.surfacearea());
        System.out.println(MyCylinder.volume());  */

        //PROBLEM  4 -- OVERLOAD A CONSTRUCTOR USE TO INITIALIZED A RECTANGLE OF
        // LENGTH 4 AND BREATH 5 FOR USING CUSTOM PARAM
      /*  ractangle rect=new ractangle();
        System.out.println(rect.getBreadth());
        System.out.println(rect.getLength());*/

        ractangle rect=new ractangle(12,56);
        System.out.println(rect.getBreadth());
        System.out.println(rect.getLength());



    }
}
