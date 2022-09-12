package com.company;
import java.util.Scanner;
import javax.management.modelmbean.ModelMBeanAttributeInfo;

public class CWH_16_CONDITIONAL {
    public static void main(String[] args) {
        int age=6;
        Scanner sc=new Scanner(System.in);
 //       System.out.println("enter your age");
 //       int a=sc.nextInt();

    //    boolean cond=(age==18);
    //    if(cond){          //yes you can alos do like this


        if(age>18){                        //NT USE ASSIGNED OPEROT  USE RELATIONAL OPERATOR
            System.out.println("yes you can drive");      // ELSE NOT MENDITERY
        }
        else{
            System.out.println("you cant drive yet");
        }
  // RELATIONAL OPERATOR == ,>=,<=,!=,<,>

    }
}
