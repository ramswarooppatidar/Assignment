package com.lct7Arrays;
import java.util.Scanner;
public class ForEach {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[2][2];
		System.out.println("pls enter element");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for(int arr[]:a) {
			{for(int x:arr) {
				System.out.println(x + " ");
			}
			
		}
			}
		}
	}
		
	


