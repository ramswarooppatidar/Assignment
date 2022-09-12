package com.Day3AssignmentClass;
import java.util.Scanner;
public class powerSum {
	int cnt=0, power;
    int num;
	public int digitCount(int num) {
		powerSum p=new powerSum();
		while(num>0)
		{
			cnt++;
		 num=num/10;
		 }
		//System.out.println(cnt);
		 return cnt;
		
	}
	public int powerCal(int base,int cnt) {
		//powerSum p=new powerSum();
		
		int multi=1;
		for(int i=1;i<=cnt;i++) {
			 multi=multi*base;
			 
			 System.out.println(multi);
		}
		return multi;
	}
	public int calPowerSum(int num) {
		int sum=0;
		int digit=this.digitCount(num);
		System.out.println("digit count  "+digit);
		while(num>0) {
			int rem=num%10;
			sum=sum+ this.powerCal(rem,digit);
			System.out.println("sum of power each digit "+sum);
			    digit--;
			    num=num/10;
		}
			return sum;
			

		}
	
					
			
	public static void main(String[] args) {
		powerSum p=new powerSum();
		Scanner sc=new Scanner(System.in);
		System.out.println("pls enter a disgit");
		int num=sc.nextInt();
		int cnt;
		
		System.out.println("power sum of digit place is :"+p.calPowerSum(num));
		
	}

}
