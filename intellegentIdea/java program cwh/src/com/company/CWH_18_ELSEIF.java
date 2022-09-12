package com.company;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
import javax.management.modelmbean.ModelMBeanAttributeInfo;

public class CWH_18_ELSEIF {
    public static void main(String[] args) {
  //      Scanner sc=new Scanner(System.in);
  //      System.out.println("enter your age");
  //      int age=sc.nextInt();                 // else if leader run any one of them
 //       if(age>56){
 //           System.out.println("you are experienced");
 //       }
 //       else if(age>46){
 //           System.out.println("you are semi experience");
   //     }
  //      else if(age>36){
  //          System.out.println("you are semi semi exp.");
    //    }
   //     else{
   //         System.out.println("you are berozzgarr");
     //   switch(age){
       //     case 18:
       //     System.out.println("you are adult");
       //     break;
       //     case 23:
       //         System.out.println("you are able to getting a job");
       //         break;
      //      case 60:
     //           System.out.println("you are going to retired");
     //           break;
      //      default:
        //        System.out.println("enjoy your life");
        char var= 'r';   //also s  tring    string var="harry"; & use string in case
        //  var can be integer charecter string in a java
        switch(var){
            case 'r':
                System.out.println("you are adult");
                break;
            case 'c':
                System.out.println("you are able to getting a job");
                break;
            case 'd':
                System.out.println("you are going to retired");
                break;
            default:
                System.out.println("enjoy your life");



        }
    }
}

