package com.lct7Arrays;
import java.util.Scanner;
public class D1AskFromUser 
{
	public static void main(String[] args)
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter size of arrys");
		int size=Sc.nextInt();
		int a[]=new int[size];
		System.out.println("length of arrys is"+a.length);
		System.out.println("enter arrys element");
		for(int i=0;i<a.length;i++) {
			a[i]=Sc.nextInt();
		}
		System.out.println("Arrays elements are");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		//minimum elements
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
	    
			//maximum elements
		int max=a[0];
		for( i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			
			
				
		}
		System.out.println("\nminimum element is "+min);
		System.out.println("\nmaximum element is "+max);
		
	}

	}}
