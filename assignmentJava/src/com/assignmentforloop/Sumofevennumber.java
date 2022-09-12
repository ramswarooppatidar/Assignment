// sum of first 10 natural number
package com.assignmentforloop;
import java.util.Scanner;
public class Sumofevennumber {
	public static void main(String[] args) {
		int i;
		int sum=0;
		System.out.println("");
		Scanner sc =new Scanner(System.in);
		for( i=1;i<=10;i++) {
			if(i%2==0) {
				sum=sum+i;
			}
		}
	

		System.out.println("sum="+sum);
		
	}

}

