package com.test_Solution;
import java.util.Scanner;
public class PuneTemprature {
	int t[] = new int[30];


	public void showMinimumTemprature(int[] a) {
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("minimum temprture of pune city is "+min);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t[] = new int[30];
		System.out.println("pls enter 30 day temprature ");
		for(int i=0;i<t.length;i++)
		{
			t[i]=sc.nextInt();
			}
		PuneTemprature obj=new PuneTemprature();
		obj.showMinimumTemprature(t);
	}

}
