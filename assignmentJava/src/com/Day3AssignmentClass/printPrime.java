package com.Day3AssignmentClass;
import java.util.Scanner;
public class printPrime {
	int num1, num2;
	public void prime(int num) {
		
		for(int i=2;i<=num2/2;i++)
		{if(num%i==0) {
			System.out.println("number is not a prime number");
			break;
		}
		else {
			System.out.println("number is a prime number");
			break;
		}
		
			
			
		}
	}
	public static void main(String[] args) {
		 primeNumberprint p = new  primeNumberprint();
		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter  NUMBER");
	
		int num=sc.nextInt();
		p.prime(num);
		
	}


}
