package com.methodOrFunction;
import java.util.Scanner;
public class maxiof7 {
	public int maxOfDigit(int n) {
		int larger=0;
	
		//System.out.println("plz enter number ");
		//Scanner sc =new Scanner(System.in);
		//n=sc.nextInt();
		int samlest=0;
		while(n>0)
		{
			int r=n%10;
			if(larger<r) {
			  larger=r;
			}
			n=n/10;
		}
		System.out.println("largest number is "+larger);
		
		return larger;
	}
	public static void main(String[]args) {
		maxiof7 m=new maxiof7();
		System.out.println("plz enter number ");

		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		m.maxOfDigit(n);
	
	}

}
