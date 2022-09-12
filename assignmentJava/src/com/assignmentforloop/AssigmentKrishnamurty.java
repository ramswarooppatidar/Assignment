package com.assignmentforloop;
import java.util.Scanner;
public class AssigmentKrishnamurty {
	public void factorial(int n) {
		int pro=1;
		for(int i=1;i<n;i++) {
			int fact = pro*i;
		}
	}
	public static void main(String[] args) {
		System.out.println("please enter digit you");
		int num,remendar;
		int factorial=1;
		int sum=0;
		Scanner sc= new Scanner(System.in);
		num=sc.nextInt();
		int multi=1;
		while(num>0)
		{
			    remendar=num%10;
		         for(int i=1;i<=remendar;i++) {
		        	 multi =multi*i;
		         }
			    System.out.println("factorial of "+remendar+" is :"+multi);
			    multi=1;
			    
                sum=sum+factorial;
			    num=num/10;
		}
		System.out.println(sum);
		
		if(sum==num) {
			System.out.println("given number is Krishnamurthy");
		}
		else {
			System.out.println("given number is not Krishnamurthy");
			
			
		}
	}
}

