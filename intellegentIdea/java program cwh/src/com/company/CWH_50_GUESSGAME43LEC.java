package com.company;
import java.util.Random;
import java.util.Scanner;
class game{
    public int number;
    public int inputnumber;
    public int noOfguess=0;

    public int getNoOfguess() {
        return noOfguess;
    }

    public void setNoOfguess(int noOfguess) {
        this.noOfguess = noOfguess;
    }

     game(int n){
        Random rand=new Random();
        number=rand.nextInt(100);
    }
    void TakeUserInput(){
        System.out.println("guess the number");
        Scanner sc=new Scanner(System.in);
        inputnumber=sc.nextInt();

    }
    boolean IsCorrectNumber(){
        noOfguess++;
        if(inputnumber==number){
            System.out.format("yes your guess is right it was %d\n your guessnumber is %d attempt",number,noOfguess);
            return true;
        }
        else if(inputnumber<number){
            System.out.println("too low...");
        }
        else if(inputnumber>number){
            System.out.println("too high");
        }
        return false;

    }
}

public class CWH_50_GUESSGAME43LEC {
    public static void main(String[] args) {
        game g=new game(23);
        boolean b=false;
        while(!b){
            g.TakeUserInput();
            b=g.IsCorrectNumber();
        }
    }
}
