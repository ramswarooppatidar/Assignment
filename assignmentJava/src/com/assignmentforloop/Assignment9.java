//prime number
package com.assignmentforloop;
import java.util.Scanner;
public class Assignment9 {
	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("pls enter a number");
		num=sc.nextInt();
		boolean flag=false;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag=true;
				break;
			}			
			
		}
		if(flag)
			System.out.println(" not prime number");
		else {
			System.out.println("prime number");
			
		}
	}

}
