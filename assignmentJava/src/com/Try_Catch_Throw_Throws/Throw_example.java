package com.Try_Catch_Throw_Throws;
import java.util.Scanner;
public class Throw_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("plz enter a age");
		int age = sc. nextInt();
		try {
			if(age<5) {
				throw new ArithmeticException("not allowed! your age less than 5");
			}
			else if(age>20) {
				throw new ArithmeticException("not allowed! your age greter than 20");
				
			}
			else {
				System.out.println("welcome");
			}
		}catch(ArithmeticException e) {
			System.out.println("anexception is thrown");
			System.out.println("first come here "+e.getMessage());
		}
		
		
		//2 example
		System.out.println("enter roll number");
		int roll = sc.nextInt();
		try {
			if(roll<0) {
				throw new Exception("number enter is not possitve");
			}
			else
				System.out.println("valid roll number");
		}
		catch(Exception e) {
			System.out.println("an exception is thrown");
			System.out.println(e.getMessage());
		}
		

	}

}
