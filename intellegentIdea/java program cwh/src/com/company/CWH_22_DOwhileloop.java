package com.company;
import java.util.Scanner;
public class CWH_22_DOwhileloop {
    public static void main(String[] args) {
      //  int b=10;
      //  do{
      //      System.out.println(b);
      //      b++;
     //   }while(b<5);
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int a=0;
        int b;
        b=0;
        do{
            System.out.println(b);
            if(b%2==0){
                System.out.println(b);
            }
            b++;
        }while(b<=num);

    }
}
