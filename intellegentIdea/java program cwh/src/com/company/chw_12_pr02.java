package com.company;
import java.util.Scanner;

public class chw_12_pr02 {
    public static void main(String[] args) {

        //write a java program to encrypted a grade by adding 8 on it .decrypte it and get the correct grade
        char grade='B';
        grade=(char)(grade+8);
        System.out.println(grade);

        //decrypting the grade
        grade= (char)(grade-8);
        System.out.println(grade);
    }
}
