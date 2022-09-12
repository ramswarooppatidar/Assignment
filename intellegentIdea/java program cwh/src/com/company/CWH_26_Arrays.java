package com.company;

public class CWH_26_Arrays {
    public static void main(String[] args) {
   //      classroom of 500 students-you have store marks of 500 student
   //     youhave two option
   //     1. create 500variable
    //    2. use arreys (recommended)

       int[] marks=new int[5];
        marks[0]=100;
        marks[1]=56;
        marks[2]= 78;
        marks[3]=47;
        marks[4]=89;
        System.out.println(marks[4]);

        // 3ways to create an arreys
        int [] mark;        // declaration
        marks=new int[5];   // memory allocation

      //  int[] marks=new int[5];   // declaration + memory allocation


        int[] number={100,70,80,71,98};  //declaration +initialization
        System.out.println(number[4]);
    }
}
