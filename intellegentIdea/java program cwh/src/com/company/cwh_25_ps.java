package com.company;
import java.util.Scanner;

public class cwh_25_ps {
    public static void main(String[] args) {
 //       int i,j;
 //       for(i=0;i<=5;i++){
 //           for(j=0;j<=5-i;j++)
 //           {
 //               System.out.print("*");
 //           }
 //           System.out.print("\n");
 //       }
       // **** practice problem 2(while)
        System.out.println("enter NUMBER");
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();

//        int sum=0;
 //       int n=4;
 //       for(int i=0;i<n;i++){
  //              sum=sum+(2*i)/;}

    //            System.out.print("sum of even number is");
    //    System.out.println(sum);



        int sum=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                sum=sum+i;
            }
        }
        System.out.println("sum of even number is :");
        System.out.println(sum);
                }
        }




