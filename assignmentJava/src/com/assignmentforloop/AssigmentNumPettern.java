package com.assignmentforloop;
import java.util.Scanner;

public class AssigmentNumPettern {
	public static void main(String[] args) 
	{
		int i,j,row;
		System.out.println("plese enter number og row yoy want to print");
		Scanner sc= new Scanner(System.in);
		row=sc.nextInt();
		for(i=1;i<=row;i++) 
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println("\n");
		}
		
	}

}
