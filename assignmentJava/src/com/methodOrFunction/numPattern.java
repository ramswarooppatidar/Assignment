package com.methodOrFunction;

import java.util.Scanner;

public class numPattern {
	public void pattarnL(int row) {
		for(int i=1;i<=row;i++) 
		{
			for(int spc=1;spc<=row-i;spc++) {
				System.out.print(" ");
				}
			for(int j=1;j<=i;j++) {
				System.out.print(j);
				//System.out.print(i);
			}
			System.out.println("\n");
			}
			
		
			
		}
		public static void main(String[] args) {
			int row;
			System.out.println("plz enter number of row you want to print");
			Scanner sc =new Scanner(System.in);
			row=sc.nextInt();
			numPattern p=new numPattern();
			p.pattarnL(row);
			sc.close();
		}
	

}



