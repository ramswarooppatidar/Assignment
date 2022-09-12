package com.assignmentforloop;
import java.util.Scanner;
public class Assignment10b {
	public static void main(String[] args) {
		int i,j,space,value,row;
		System.out.println("plese enter number of row you want to print");
		Scanner sc=new Scanner(System.in);
		row = sc.nextInt();
		System.out.printf("plese enter 1 fro right pramid and 0 for reverce");
		value=sc.nextInt();
		if(value==1) {
		for(i=1;i<=row;i++)
		{
		 for(space=5;space>=row-i;space--) {
			 System.out.print(" ");
		  } 
		 for(j=row;j>=i;j--) {
			  System.out.print("* ");
		  }
		 System.out.print("\n");
		}}
		
		else if(value==0) {
		for(i=1;i<=row;i++)
		{
		 for(space=1;space<=row-i;space++) {
			 System.out.print(" ");
		  } 
		 for(j=1;j<=i;j--) {
			  System.out.print("* ");
		  }
		 System.out.print("\n");
		}
		}

	}

}

