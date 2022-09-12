package com.company;

public class CWH_33_varargs {
 /*   static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }    */

    static int sum(int ...arr) {
        int result=0;

        for(int a: arr){
            result +=a;
        }
        return result;
    }
    public static void main(String[] args) {
     /*   System.out.println("wel come to the varargs");
        System.out.println("the sum of 4 and 5 is:" + sum(4,5));
        System.out.println("the sum of 4,3 and 5 is:" + sum(4,3,5));
        System.out.println("the sum of 4,3,2 and 5 is:" + sum(4,3,2,5));  */


        System.out.println("wel come to the varargs");
        System.out.println("the sum of 4 and 5 is:" + sum( 4,5));
        System.out.println("the sum of 4,3 and 5 is:" + sum(4,3,5));
        System.out.println("the sum of 4,3,2 and 5 is:" + sum(186,4,3,2,5));
        System.out.println("the sum of nothing is:" + sum());



    }
}
