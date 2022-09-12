package com.test_Solution;
import java.util.Scanner;
public class EvenArray {
	public void show(int a[]) {
		System.out.println("first five even numbers are..");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
	}
	public static void main(String[]args) {
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		
		
			for(int i=0;i<a.length;i++) {
				a[i]=(i+1)*2;
			}
		EvenArray obj=new EvenArray();
		obj.show(a);
		
	}

}
