package com.company;
import java.util.Scanner;
public class CWH_19PRT3 {
    public static void main(String[] args) {
        System.out.println("enter year");
        Scanner sc=new Scanner(System.in);
        int yr =sc.nextInt();
        if(yr%4==0){
            System.out.println(yr +" year is leap year");
        }
        else{
            System.out.println( yr+"is not a leap year");
        }
    }
}
