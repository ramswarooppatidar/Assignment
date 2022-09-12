package com.assignmentforloop;
import java.util.Scanner;
public class pattern
{
	public static void main(String[] args)
	{
		int row,spc;
		System.out.print("PLZ ENTER NUMBER OF ROW TO WANT DISPLAY");
		Scanner sc=new Scanner(System.in);
		row=sc.nextInt();
		spc=sc.nextInt();
		for(int i=1;i<=row;i++) {
			for(spc=5;spc<=row-spc;spc--)
			{
				System.out.print("");
			}
				for(int j=row;j<=row-i;j--)
				{
					System.out.print("*");
				}
				System.out.print("\n");
			}
			
			
	}
}


