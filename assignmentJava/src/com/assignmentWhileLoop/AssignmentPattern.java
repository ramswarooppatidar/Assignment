//print pattern using while
package com.assignmentWhileLoop;
import java.util.Scanner;
public class AssignmentPattern {
	public static void main(String[] args) {
		System.out.println("please enter number of row you want to print");
		int row;
		Scanner sc= new Scanner(System.in);
		row=sc.nextInt();
		int i=1;
		while(i<=row)
		{
			int j=1;
			while(j<=i) 
			{
			 System.out.print("* ");
			 j++;
			}
		    i++;
		    System.out.println("\n");
		}
				
	}

}
