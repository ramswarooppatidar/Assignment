package com.company;

import java.util.Scanner;
import java.util.Scanner;

public class cwh_10_calculator {
    public static void main(String[] args) {
        System.out.println("enter two numbers");
        Scanner sc=new Scanner(System.in);
        System.out.println("write a two number");
        int num1= sc.nextInt();  // these is used for user inpur
        int num2= sc.nextInt();
        int divide=sc.nextInt();  // dision we want to calculate so why you want from user is totally
        // wronr no need to do like these
        int sum= num1+num2;
        System.out.println("sum of two number is : ");
        System.out.println(sum);
        int sub=num1-num2;
        System.out.println("substraction of two no. is :");
        System.out.println(sub);
        int mul=num1*num2 ;
        System.out.println("multiplication of two no. is : ");
        System.out.println(mul);
        System.out.println("division of two number is :");
        divide=num1/num2;
        System.out.println(divide);
        int result=sum+sub+mul+divide;
        System.out.println("result of two no is : ");
        System.out.println(result);








    }
}
