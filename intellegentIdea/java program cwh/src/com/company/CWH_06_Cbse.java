package com.company;

import java.util.Scanner;

public class CWH_06_Cbse {
    public static void main(String[] arg){
        System.out.println("write marks of subject one by one :");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks of first subject");
        float marks1=sc.nextFloat();
        System.out.println("enter marks of second subject");
        float marks2=sc.nextFloat();
        System.out.println("enter marks of third subject");
        float marks3=sc.nextFloat();
        System.out.println("enter marks of four subject");
        float marks4=sc.nextFloat();
        float sum= marks1+marks2+marks3+marks4;
        System.out.println("the sum of marks is ");
        System.out.println(sum);
        float percentage=sum/4;
        System.out.println("percentage is");
        System.out.println(percentage);

    }
}
