package com.methodOrFunction;
import java.util.Scanner;

import assignmentJava.patternReverceL;
public class patternL {
	public void pattarnL(int row)
	{
		for(int i=1;i<=row;i++) 
		{
			for(int spc=1;spc<=row-i;spc++) {
				System.out.print(" ");
				}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("\n");
			}
			
	}
	public void patternStar(int row) {
		for(int i=0;i<row;i++) {
			for(int spc =0;spc<i;spc++) {
				System.out.print(" ");
			}
			for(int j=0;j<row-i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println("\n");
		}
	}
	public void pyiramidPattern(int row) {
		for(int i=0;i<row-1;i++) {
			for(int spc=0;spc<i;spc++) {
				System.out.print(" ");
			}
			for(int j=0;j<row-i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println("\n");
		}
		for(int i=0;i<row;i++) {
			for(int spc=row-i-1;spc>0;spc--) {
				System.out.print(" ");
				
			}
			for(int j=0;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println("\n");
		}
		
	}
	public void pyiramidPatter1(int row) {
		for(int i=0;i<row;i++) {
			for(int spc= row-1-i;spc>0;spc--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println("");
		}
		for(int i=0;i<row-1;i++) {
			for(int spc =0;spc<=i;spc++) {
				System.out.print(" ");
			}
			for(int j=0;j<row-1-i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println("");
			
		}
		
	}
		
			
		public static void main(String[] args) {
			int row;
			System.out.println("plz enter number of row you want to print");
			Scanner sc =new Scanner(System.in);
			row=sc.nextInt();
			patternL p=new patternL();
			//p.pattarnL(row);
			//p.patternStar(row);
			//p.pyiramidPattern(row);
			p.pyiramidPatter1(row);
			sc.close();
		}
	

}
