package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Random;
import java.util.Scanner;

class Game{
    private int num;
    private int i;
    public Game(){
        Random random=new Random();
        int computerInput=random.nextInt(100);
        computerInput=num;
        System.out.println("computer input is" +computerInput);
    }
    public int UserInput(int number){
        System.out.println("enter a number between 1 to 100");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        num=number;
        System.out.println("your choice is :"+ num);
        return num;
    }
    public void IsCorrect(){
        int count=0;
        while(count==0){
            if(num==i){
                System.out.println("your guess number is correct and your number is " +num);
            }else{
                System.out.println("enter new number between 1 to 100");
            }
            count++;
        }
        System.out.println("total number of attempt is " +count);
        System.out.println("your score is "+ 5*count);


    }
}

public class CWH_43_EXERCISE03 {
    /*
    CRETAE A CLASS GAME, WHICH ALLOW A USER TO PLAY "GUESS THE NUMBER" GAME ONCE. GAME SHOULD HAVE
    THE FOLLOWIG METHOD
    1 CONSTRUCTOR GENERATE THE RANDOM NUMBER
    2 TAKEUSERINPUT()
    3 Iscorrect() to dedect wheter the number enterd by the user is true
    4 getter and setter for noofguess
     use this properties such as noofguess(int), etc to get take done
     */
    public static void main(String[] args) {
     Game G=new Game();
     G.IsCorrect();
     G.UserInput(5);

    }
}
