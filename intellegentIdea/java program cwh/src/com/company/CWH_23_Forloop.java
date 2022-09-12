package com.company;
import java.util.Scanner;
public class CWH_23_Forloop {
    public static void main(String[] args) {
       // for (int i=1;i<=10;i++)
        System.out.println("enter anumber");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       // for(int i=0;i<n/2;i++ )

       // int n=5;
     //   for(int i=0;i<=5;i++) {
       //    System.out.println(2*i+1);
          //  System.out.println(i);



     //   for(int i=5;i>0;i--){          //  i!=0  also usedf
       //     System.out.println(i);
        for(int i=n;i>0;i--){
            System.out.println(i);
        }
    }
}

