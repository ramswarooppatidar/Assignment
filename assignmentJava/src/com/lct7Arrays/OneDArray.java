package com.lct7Arrays;
import java.util.Scanner;
public class OneDArray {
	int a[]=new int[10];
	public void acceptElement(int a[]) {
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	}
	public void showElement() {
		System.out.println("all element of arrys");
		for(int i=1;i<a.length;i++)
	System.out.print("a["+i+ "]"+a[i]);
	}
	public static void main(String[] args) {
		OneDArray a=new OneDArray();
		int b[]= {3,4,5,6,7};
		a.acceptElement(b);
		a.showElement();
	}

}
