package com.assignmentforloop;
import java.util.Scanner;
public class Amestron {
	public static void main(String[] args) {
		System.out.println("please enter digit you want to calculate sum and sum of digit cube");
		int num,remendar,ams=0;
		int sum=0;
		Scanner sc= new Scanner(System.in);
		num=sc.nextInt();
		while(num>0) {
			remendar=num%10;
			int pro=remendar*remendar*remendar;
		    ams=pro+ams;
			sum=sum+remendar;
			num=num/10;
		}
		System.out.println("sum of digit is="+sum);
		System.out.println("cube sum of digit is="+ams);
		
	}

}

