package com.Day3AssignmentClass;
import java.util.Scanner;
public class lcm {
	int lc;
	public int lcmOfNumber(int a, int b) {
		lc= (a>b)?a:b;
	     while(lc>0)
	     {
			if(lc%a==0&& lc%b==0)
			{
			
				break;
			}
	     lc++;
		}
		return lc;
	}
	public static void main(String[] args) {
		lcm o = new lcm();
		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter two number");
		int num1= sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("lcm of two number is "+o.lcmOfNumber(num1, num2));
	}

}
