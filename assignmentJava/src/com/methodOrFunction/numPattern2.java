package com.methodOrFunction;
import java.util.Scanner;
public class numPattern2 {
	int value=1,row;
	public void numptrn2(int row) {
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(value+"\t");
				value++;
			}
			System.out.println("\n");
		}
	}
	public static void main(String[] args) {
		int row;
		Scanner sc=new Scanner(System.in);
		System.out.println("pls enter number of row");
		row=sc.nextInt();
		numPattern2 pt=new numPattern2();
		pt.numptrn2(row);
	}

}
