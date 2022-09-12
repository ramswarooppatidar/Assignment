//1 to 50 who is divisible by 5 and sum of it
package com.assignmentforloop;

public class Divisibility {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=50;i++) {
			if(i%5==0) {
				System.out.println(i);
				sum=sum+i;
				System.out.println("sum of divisibal number is"+sum);
			}
		
		}
		System.out.println("total sum of divisibal number is"+sum);
	}

}
