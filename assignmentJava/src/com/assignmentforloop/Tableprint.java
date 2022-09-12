//table print
package com.assignmentforloop;
import java.util.Scanner;
public class Tableprint {
	public static void main(String[] args) {
		int num;
		System.out.println("pls enter num you want to print");
		Scanner sc =new Scanner(System.in);
		num=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(num*i);
		}
		
	}

}
