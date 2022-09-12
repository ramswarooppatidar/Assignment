package com.test_Solution;
import java.util.Scanner;
class arrayMethods{
	Scanner sc = new Scanner(System.in);

	public void showElement(int a[][]) {
		System.out.println("element of arrys are");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
		
	}
	public void showEven(int a[][]) {
		System.out.println("element of arrys are");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]%2==0)
				System.out.print(a[i][j]+" ");
				else
					System.out.print("odd ");	
			}
			System.out.println("");
		}
			
	}
	public void transpose(int a[][]) {
		int b[][]=new int[3][3];
		System.out.println("transpose of matirixx");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				//b[j][i]=a[i][j];
				b[i][j]=a[j][i];

				System.out.print(b[i][j]+" ");
					
			}
			System.out.println("");
		}
		
	}
}
	
public class Array2dAndManipulation {
	public static void main(String[]args) {
		arrayMethods obj = new arrayMethods();
		int a[][]=new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr element of arrys");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
				//System.out.print(" ");

				//System.out.print(a[i][j]);
			}
			System.out.println("");
		}
		obj.showElement(a);
		obj.showEven(a);
		obj.transpose(a);
		
	}

}
