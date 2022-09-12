package com.assignmentforloop;
import java.util.Scanner;
public class maxoF7 {
	public static void main(String[] args) {
		int num1,num2,num3,num4,num5,num6,num7;
		System.out.println("plz enter 7 number");
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		num7=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		num4=sc.nextInt();
		num5=sc.nextInt();
		num6=sc.nextInt();
		
		if(num1>num2&& num1>num3&& num1>num4&& num1>num5&&num1>num6&&
				num1>num7) {
			System.out.println("num1 is maximum");
		}
		else if(num2>num3&& num2>num4&& num2>num5&& num2>num6&&num2>num7) {
			System.out.println("num2 is maximum");
		}
		else if(num3>num4&& num3>num5&& num3>num6&& num3>num7) {
			System.out.println("num3 is maximum");
		}
		else if(num4>num5&& num4>num6&& num4>num7) {
			System.out.println("num4 is maximum");
		}
		else if(num5>num6&& num5>num7) {
			System.out.println("num5 is maximum");
		}
		else if(num6>num7) {
			System.out.println("num6 is maximum");
		}
		else {
			System.out.println("num6 is maximum");
				
			}
		
	}

}
