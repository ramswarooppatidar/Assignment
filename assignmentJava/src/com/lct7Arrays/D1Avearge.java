package com.lct7Arrays;
import java.util.Scanner;
public class D1Avearge {
	public static void main(String[]args)
	{
		
		Scanner sc=new Scanner(System.in);
		//int sub=sc.nextInt();
		System.out.println("please enter the total number of subject");
		int sub=sc.nextInt();
		float a[]=new float[sub];
		for(int i=0;i<a.length;i++) {
			System.out.print("plese enter number of marks a["+i+"]");
			a[i]=sc.nextFloat();
		}
		float sum=0,avg=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
			avg=sum/sub;
			
		}
		System.out.println("avg of number is "+avg);
		System.out.println("sum of all sublect is "+sum);
		
		
		
	}

}
