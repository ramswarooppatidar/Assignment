package com.Day3AssignmentClass;
import java.util.Scanner;
public class gcd {
	int gc;
	public int gcdOfnumber(int a,int b)
	{
		for(int i=1;i<=a && i<=b;i++)
		{
			if(a%i==0 && b%i==0) {
				 gc=i;
			}
		}
		return gc;
	}
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		gcd o = new gcd();
		System.out.println("plse enter two number ");
		int num1=sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("gcd of "+num1+" and "+num2+" is:"+o.gcdOfnumber(num1, num2));
	}

}
