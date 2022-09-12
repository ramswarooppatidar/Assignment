package com.assignmentWhileLoop;
import java.util.Scanner;
public class AssignmentPrimenumber {
	public static void main(String[] args) {
	   int num;
	   System.out.println("please enter a number");
	   Scanner sc= new Scanner(System.in);
	   num=sc.nextInt();
	   boolean flag=false;
	   int i=2;
	   while(i<=num/2)
	   {
		   if(num%i==0) {
			   flag= true;
			   break;
		   }
		   i++;
	   }
	   if(flag)
			System.out.println(" not prime number");
		else {
			System.out.println("prime number");
		}
	}

}
