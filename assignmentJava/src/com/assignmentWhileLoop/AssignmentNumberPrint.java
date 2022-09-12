//print number pattern using while
package com.assignmentWhileLoop;
import java.util.Scanner;
public class AssignmentNumberPrint {
	public static void main(String[] args) {
		System.out.println("please enter number of row you want to print");
		int row;
		Scanner sc= new Scanner(System.in);
		row=sc.nextInt();
		int i=0;
		while(i<=row)
		{
			int j=1;
			while(j<=i)
			{
				//System.out.print(i);
				System.out.print(j);

				j++;
			}
		    i++;
		    System.out.println("\n");
		
		}
	}
}

