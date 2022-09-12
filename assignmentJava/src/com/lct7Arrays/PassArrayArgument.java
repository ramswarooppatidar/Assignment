package com.lct7Arrays;
import java.util.Scanner;
public class PassArrayArgument {
	//SHOW ELEMENT
	public void showArray(int a[]) {
		System.out.println("array elemets are..");
		for(int i=0;i<a.length;i++) {
			System.out.print("a["+i+"]=>"+a[i]+" ");
			System.out.println("\n");
		}
	}
	
	//FIND MINIMUM
	public void findMinimum(int a[]) {
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("minimum element of arry is "+min);
	}
	
	//REVERSE ARRYAY
	public void reverseArray(int a[]) {
		System.out.println("\nreverse element of arry are...");

		for(int i=0;i<a.length/2;i++) {
			int temp[]= {0};
			temp[0]=a[i];
			a[i]=a[a.length-i-1];
			a[a.length-i-1]=temp[0];
		}
		for(int i=0;i<a.length;i++) {
			System.out.print("a["+i+"]=>"+a[i]+" ");
			System.out.println("\n");
		}
		
		
	}
				
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int temp[]= {0};
		System.out.println("pls enter size of arrys");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter arry elements ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			}
		PassArrayArgument obj=new PassArrayArgument();
		obj.findMinimum(a);
		obj.showArray(a);
		obj.reverseArray(a);
	}

}
