package com.methodOrFunction;
import java.util.Scanner;
public class maxOrMinOfDigit 
{
	int r,larger=0,smaller=9;
	public int max(int num) 
	{
		
		while(num>0)
		{
			r=num%10;
			if(r>larger)
			{
				larger=r;
			}
			num=num/10;
			
		}
		return larger;
	}
		
	public int min(int num)
	{
		while(num>0)
		{
			r=num%10;
			if(r<smaller) {
				smaller=r;
			}
			num=num/10;
				
		}
		return smaller;
	}
	
	public static void main(String[] args) {
		int num;
		maxOrMinOfDigit mm=new 	maxOrMinOfDigit();
		Scanner sc = new Scanner(System.in);
		System.out.println("plz enter a digit");
		num=sc.nextInt();
		mm.max(num);
		mm.min(num);
		System.out.println("maximun number in digit is "+mm.max(num));
		System.out.println("\nminimum number in digit is "+mm.min(num));

	}

}
