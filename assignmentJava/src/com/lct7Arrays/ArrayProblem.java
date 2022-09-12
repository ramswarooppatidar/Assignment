package com.lct7Arrays;
import java.util.Scanner;
public class ArrayProblem {
	
	public int getSum(int a[]) {
		int total=0;
		for(int ele:a)
		{
			total+=ele;
			
		}
		return total;
	}
	public static void main(String[] args) {
		
		ArrayProblem a=new ArrayProblem();
		Scanner sc=new Scanner(System.in);
		System.out.println("pls enter size of arrys ");
		int size=sc.nextInt();
		int b[]=new int[size];
		System.out.println("pls enter element of arrys");
		for(int i=0;i<b.length;i++) {
			b[i]=sc.nextInt();
		}
		
		a.getSum(b);
		System.out.println("total sum of arrys is "+a.getSum(b));
	}
	

}
