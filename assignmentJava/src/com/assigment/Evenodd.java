//chack whether number is even or odd
package com.assigment;
import java.util.Scanner;
public class Evenodd {
	public static void main(String[] args) {
		int num;
	
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter a number");
		num=sc.nextInt();
		switch(num%2) 
		{
	    case 0:System.out.println(num+" is an even number");
	    break;

		case 1:System.out.println(num+" is an Odd number");
		break;

		}

	}
}
