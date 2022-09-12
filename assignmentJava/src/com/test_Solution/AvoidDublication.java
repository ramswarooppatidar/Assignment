package com.test_Solution;
import java.util.Scanner;
public class AvoidDublication {
	public void showElement(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
	}
	//public void 
	public void main(String[]args) {
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

