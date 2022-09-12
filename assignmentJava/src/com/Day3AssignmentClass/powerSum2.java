package com.Day3AssignmentClass;
import java.util.Scanner;
public class powerSum2 {
	int num,rem;
	public int digitCount(int cnt) {
		while(num>0) {
			int rem=num/10;
			cnt++;
		}
		System.out.println("digir count is "+cnt);
		return cnt;
	}
	public int digitPower(int rem,int cnt) {
		int multi=1;
		for(int i=1;i<=cnt;i++) {
			multi *=rem;
			System.out.println(multi);
		}
		System.out.println("each place power some is"+multi);
		return multi;
	}
	public int powerSum(int num) {
		int digit=this.digitCount(num);
		int sum=0;
		while(num>0) {
			rem=num%10;
			sum=sum+this.digitPower(rem,digit);
			digit--;
			num=num/10;
			System.out.println("sum of power is each digir"+sum);
		}
		return sum;
	}
		
	public static void main() {
		int num,sum;
		powerSum2 p=new powerSum2();
		System.out.println("plz enter a digit you want to power of digit place");
		Scanner sc = new Scanner(System.in);
		 num=sc.nextInt();
		System.out.println("digit place power sum os digir "+p.powerSum(num));
	
	}
}
	

