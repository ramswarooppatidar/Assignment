package com.methodOrFunction;
import java.util.Scanner;
public class pattern4 {
	public void ptr4(int row) {
		for(int i=1;i<row;i++) {
			for(int spc=1;spc<i;spc++) {
				System.out.print(" ");
			}
			for(int j=1;j<=row-i+1;j++) {
				System.out.print((i+j-1)+" ");
			}
			System.out.println("\n");
		}
		for(int i=1;i<=row;i++) {
			for(int spc=1;spc<=row-i;spc++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				//System.out.print((row-j+1)+" ");
				//System.out.print((row+j-1)+" ");
				//System.out.print((row-j+i)+" ");
				System.out.print((row-i+j)+" ");
			}
			System.out.println("\n");
		}
	}
	public static void main(String[] args) {
		int row;
		System.out.println("pls enter no. of row you want to print");
		Scanner sc =new Scanner(System.in);
		row=sc.nextInt();
		pattern4 p=new pattern4();
		p.ptr4(row);
		
	}

}
