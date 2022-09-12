// sum of first 10 natural number
package com.assignmentforloop;
import java.util.Scanner;
public class Sumofnumber {
	public static void main(String[] args) {
		int num;
		int sum=0;
		System.out.println("");
		Scanner sc =new Scanner(System.in);
	
		for(int i=1;i<=10;i++) {
			sum=sum+i;
			System.out.println(i);
			
		
		}
		System.out.println("___");
		System.out.println("sum="+sum);
		
	}

}

