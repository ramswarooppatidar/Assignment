package com.lct7Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Inventory {
	public void accept(item a[]) {
		a[0]=new item(100,250,"ram");
		a[1]=new item(100,250,"ram");
		a[2]=new item(100,250,"ram");
	}
	public void show(item[] a) {
		System.out.println(Arrays.toString(i));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Inventory s=new Inventory();
		item a[]=new item[3];
		for(int i=0;i<a.length;i++){
				a[i]=sc.nextInt();}
		s.accept(a);
	}

}
