package com.methodOrFunction;
import java.util.Scanner;
public class sumOfdigit {
	public int digitSum(int num) {
		int sum=0;
		int min = 9;
		while(num>0) {
			int rem=num%10;
			    if(rem<min) {
			    	min = rem;
			    }
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("minimum digit in a given number is "+min);
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("plz enter a number");
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		sumOfdigit s=new sumOfdigit();
		//s.digitSum(num);
		System.out.println("sum of digit is:"+s.digitSum(num));
	}

}
