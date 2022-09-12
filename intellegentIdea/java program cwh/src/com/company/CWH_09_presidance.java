package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class CWH_09_presidance {
    public static void main(String[] args) {
       // int a= 5*6-54/2;
       // System.out.println(a);
        //PRECEDENCE && ASSOCIATIVITY
     //   int b=60/5-34*2;
        // same precedence ----left to right
      //  System.out.println(b);
        //a=b=c=45;  //right yo left
        // qick qize
        int x=6;
        int y=1;
        int k=x*y/2;  //no need to bracket bcz associativity is left to  first evalution is x and y
        System.out.println(k);
        float b=1;
        float a=5;
        float c=4;
//        float m= b*b-4*a*c/2*a ;     wronng way to solve these onr becouse
        float m=b*b-(4*a*c)/(2*a);
 //       1*1-80/10  first solve perenthisis
  //       1-8   tan left two right
   //     -7
         System.out.println(m);



    }
}
