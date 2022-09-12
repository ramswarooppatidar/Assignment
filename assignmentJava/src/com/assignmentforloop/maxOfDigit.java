package com.assignmentforloop;
import java.util.Scanner;
public class maxOfDigit {
	public static void main(String[] args) {
		int larger=0;
		int n;
		System.out.println("plz enter number ");
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
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
			
		}
	}
		
