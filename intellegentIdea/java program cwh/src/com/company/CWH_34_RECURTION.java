package com.company;
import java.util.Scanner;

public class CWH_34_RECURTION {
    // factorial(n)=n*n-1)*......*1
    //factorial(n)=n*factorial(n-1)

    static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }static int factorial_iterative(int n){
        if(n==0||n==1){
            return 1;
        }else{
            int product=1;
            for(int i=1;i<=n;i++){
                product *=i;
            }
            return product;
        }
    }

    public static void main(String[] args) {
     //   System.out.println("plz enter a numbers that you want factorial");
     //   Scanner sc=new Scanner(System.in);
     //   int b= sc.nextInt();
        int x=4;
        System.out.println("the value of factorial n is:" + factorial(x));
        System.out.println("the value of factorial n is:" + factorial_iterative(x));  //b

    }
}
