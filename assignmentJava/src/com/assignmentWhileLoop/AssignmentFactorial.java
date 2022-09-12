//Factorial problem
package com.assignmentWhileLoop;
import java.util.Scanner;
public class AssignmentFactorial {
	public static void main(String[] args)
	{
		int num;
		int factorial=1;
		System.out.println("please enter a number you want to factorial");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int i=1;
		while(i<=num)
		{
			factorial=factorial*i;
			i++;
			
		}
		System.out.println("factorial of number is:"+factorial);
		
	}

}
