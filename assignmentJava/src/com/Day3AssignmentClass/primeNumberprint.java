package com.Day3AssignmentClass;
import java.util.Scanner;
public class primeNumberprint {
	
	public boolean prime(int num) {
		if(num==1) {
			return false;
		}
		for(int i=2;i<num/2;i++)
		{if(num%i==0) {
			//System.out.println("number is not a prime number");
			return false;
			
		}
			
			
		}
		return true;
	}
	public static void main(String[] args) {
		 primeNumberprint p = new  primeNumberprint();
		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter  NUMBER");
	
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			if(p.prime(i)) {
				System.out.print(i+" ");
				
			}
			//else
				//System.out.println("\n"+i+" is not prime nuber ");
		}
		
	}

}
