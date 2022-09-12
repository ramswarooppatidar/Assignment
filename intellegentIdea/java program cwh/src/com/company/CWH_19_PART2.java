package com.company;
import java.util.Scanner;
public class CWH_19_PART2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number between 0 to7");
        int num=sc.nextInt();
        //int a=num;
        switch (num){
            case 1: System.out.println("monday");
              //  break;
                case 2:
                System.out.println("tuesday");
             //   break;
            case 3:
                System.out.println("wednasdey");
              //  break;
            case 4:
                System.out.println("thusdey");
             //   break;
            case 5:
                System.out.println("fridey");
               // break;
            case 6:
                System.out.println("saturdey");
              //  break;
                case 7:
                System.out.println("sunday");
               // break;
            default:
                System.out.println("please wright correct number");
        }
    }
}
