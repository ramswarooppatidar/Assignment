package com.lct7Arrays;
import java.util.Scanner;
public class Access {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int a[]= {3,4,6,9};
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("\n"); */
		
		int b[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("plse enter number of roew you want to print");
		int num=sc.nextInt();
		for(int i=0;i<num;i++) {
			b[i]=sc.nextInt();
		}
		System.out.println("all element of arrys is ");
		for(int i=0;i<num;i++) {
			System.out.print("b["+i+"] =>"+b[i]);
			System.out.println("\n");
		}

	}

}
