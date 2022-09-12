package com.lct7Arrays;
import java.util.Scanner;
public class ShortingOfArray {
	public void bubbleShsort(int a[] ){
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j+1]<a[j]) {
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("\nshorting of arry is..");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("how many element you want to print in arry");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter element of arrays");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			System.out.print(a[i]+" ");}
		
		ShortingOfArray obj=new ShortingOfArray();
		obj.bubbleShsort(a);
		
		/*for(int i=0;i<size;i++) {
			for(int j=0;j<size-1-i;j++) {
				if(a[j+1]<a[j]) {
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("\nshorting of arry is..");
		for(int i=0;i<size;i++) {
			System.out.print(a[i]+" ");
		}*/
	}
}

	
	
		

			
	

