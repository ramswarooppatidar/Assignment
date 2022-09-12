package com.methodOrFunction;
import java.util.Scanner;
public class pattern3 {
	public void ptr3(int row) {
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=(row+1-i);j++) {
				System.out.print((j+i-1)+"\t");
				//System.out.print(j+"\t");
				
			}
			for(int k=1;k<i;k++) {
				System.out.print(k+"\t");
			}
			System.out.println("\n");
		}
		
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("pls enter number of row you want to print");
		int row=sc.nextInt();
		pattern3 ptr=new pattern3();
		ptr.ptr3(row);
		
		
	}

}
