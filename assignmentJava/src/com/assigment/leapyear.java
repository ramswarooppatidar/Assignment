package com.assigment;
import java.util.Scanner;
public class leapyear {
	public static void main(String[] args) {
		//program to find out given year is leap year or not
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter year");
		year=sc.nextInt();
		if(year%4==0 || year%100==0 || year%400==0) {
			System.out.println(year+" is a leapyear");
		}
		else {
			System.out.println(year+"not a leapyear");
		}
		
	}

}
