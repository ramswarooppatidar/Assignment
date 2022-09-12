package assignmentJava;

import java.util.Scanner;

public class fullPyiramid {
	public static void main(String[]args)
	{
	int i,j,space,value,row;
	System.out.println("plese enter number of row you want to print");
	Scanner sc=new Scanner(System.in);
	row = sc.nextInt();
	
	for(i=1;i<=row-1;i++)
	{
		for(space=1;space<=row-i;space++)
		{
			System.out.print(" ");
		} 
		for(j=1;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.print("\n");
	}
	
	for(i=1;i<=row;i++)
	{
	 for(space=(row-1);space>row-i;space--) {
		 System.out.print(" ");
	  } 
	 for(j=row;j>=i;j--) {
		  System.out.print("* ");
	  }
	 System.out.print("\n");
	}
	
	
	 
	}
}




