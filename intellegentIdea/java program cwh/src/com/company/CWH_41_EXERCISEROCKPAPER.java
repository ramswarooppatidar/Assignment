package com.company;

import java.util.Random;
import java.util.Scanner;

public class CWH_41_EXERCISEROCKPAPER {
    public static void main(String[] args) {
        //0 for rock
        //1 for paper
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 0 for rock, 1for paper,3for scissor");
        int userInput=sc.nextInt();

        Random random=new Random();
        int computerInput=random.nextInt(3);  //most important concept for random genrate


        if(computerInput==0) {
            System.out.println("computer choice is : rock " );
        }else if(computerInput==1){
            System.out.println("computer choice is : paper ");
        }else{
            System.out.println("computer choice is : scissor");
        }
        System.out.println("***************************************");
        if(userInput==computerInput){
            System.out.println("match draw");
        }else if(userInput==0 && computerInput==2 ||userInput==1 && computerInput==0||
                userInput==3 &&computerInput==1){
            System.out.println("you win");
        }else{
            System.out.println("computer is win");
        }
    }
}
