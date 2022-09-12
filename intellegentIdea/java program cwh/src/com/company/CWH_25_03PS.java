package com.company;
import java.util.Scanner;

public class CWH_25_03PS {
    public static void main(String[] args) {
        System.out.println("enter NUMBER");
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
   //     for(int i=1;i<=10;i++){
          //  System.out.print(n*i);
    //        System.out.printf("%dX%d=%d", n,i,n*i);
    //        System.out.println("\n");
        for(int i=10;i>=0;i--){
           // System.out.printf("n*i");
                    System.out.printf("%dX%d=%d", n,i,n*i);
                   System.out.println("\n");
        }
    }
}
