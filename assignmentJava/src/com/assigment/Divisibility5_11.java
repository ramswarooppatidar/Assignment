package com.assigment;
import java.util.Scanner;
public class Divisibility5_11 {
	public static void main(String[] args) {
		//divisibility of 5 and 11
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter a number");
		num=sc.nextInt();
		if(num%5==0|| num%11==0) {
			System.out.println(num+"numebr is divisible ");
		}
		else {
			System.out.println(num+"numebr is not divisible by 5");
			
		}
	}

}
