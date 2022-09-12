package com.company;

public class cwh_10_resultindatatype {
    public static void main(String[] args) {
    //     byte x=5;
    //     int y=6;
    //     short z=8;
   //      int a=y+z;
   //      float b=6.54f+x;
   //     System.out.println(b);
  // increment and decrement
        int y=7;
        int z=++y*9;
        int w=y--*5; //y=8 and these expression is post decrement
        //  now  y  after it is 7
        int r=--y*5;  //y first decremented by 1 so y become 6 than perform 6*5
        System.out.println(r);
        System.out.println(w);
        System.out.println(z);
         int i=56;
         // int b =i++   first b is assigned i than  i  is incremented
        int j=67;
        int c=++j;   //first j is incremented than c is assigned
    //    System.out.println(c);
     //   System.out.println(i++);
     //   System.out.println(i);
    //    System.out.println(++i);
    //    System.out.println(i);
        char ch='a';
        System.out.println(++ch);
    }
}
