package com.company;
import java.util.Scanner;
public class cwh_25_chp504ps {
    public static void main(String[] args){
        System.out.println("enter a number ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int factorial=1;
        while(i<=n) {
            factorial =factorial*i;

            i++;
        }

        System.out.println(factorial);
        }

    }

