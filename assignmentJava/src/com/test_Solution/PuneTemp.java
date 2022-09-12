package com.test_Solution;

import java.util.Scanner;

public class PuneTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("pls enter element you want.");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]!=a[j-i+1]) {
					a[i]=sc.nextInt();
				}
			}
		}
		AvoidDublication obj = new AvoidDublication();
		obj.showElement(a);

	}

}
