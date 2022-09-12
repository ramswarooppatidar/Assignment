package com.String;
import java.util.Scanner;
import java.io.InputStream;
import java.io.BufferedReader;
class Series{
	// 1 seies is "1,3,7,15,31,63......so on.."
	public void series1(int a) {
		String empty ="";
		int i=0;
		while(i<a) {
			if(i*2>a) {
				break;
			}
			empty += ((i*2)+1)+" ";
			i=i*2+1;
		}
		System.out.println("series 1 : "+empty);
		
	}
	public void series2(int a) {
		String empty ="";
		empty += 2+" ";
		int i=2;
		while(i<a) {
			empty += ((i*2)-1)+" ";
			i=i*2-1;
		}
		System.out.println("\nseries 2 : "+empty);
	}
	public void palindrome(int num) {
		
		int b=num;
		int rem;
		int sum=0;
	
		while(num>0) {
			 rem = num%10;
			 sum =  ((sum*10)+rem);
			
			num = num/10;
			System.out.println(sum);
		}
	    if(b==sum) {
	    	System.out.println("number is palindrome");
	    }
	    else
	    	System.out.println("not a pllindrome");
			
		}
	public boolean isPrime(int num) {
	    
	    if(num==1 || num==2) {
	    	return true;
	    }
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

	
	
}

public class SeriesPattern {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Series obj = new Series();
//1 prime number
			System.out.println("plz enter a prime number & positive");
			 int nump = sc.nextInt();
			 if(obj.isPrime(nump)) {	
				 while(obj.isPrime(nump)) {
					 if(nump<0) {
						 
						 System.out.println("negative not allowed");
						 break;}
					 System.out.println("continue,enter a prime number");
					 nump = sc.nextInt();
				 }
				 System.out.println(" not a prime , program is over ");
				 
			 }
			 else
				 System.out.println(" not a prime , program is over ");

			
		
		
 // 2 & 3
	/*	System.out.println("plz enter a number");

		int num = sc.nextInt();
		obj.series1(num);
		obj.series2(num); */
		
//4	
	/*	int i=0;
		while(i<5) {
			System.out.println("plz enter a number");
			int numb = sc.nextInt();
			if(numb<0){
			System.out.println("negative not allowed, you miss "+(4-i)+" chance");
			break;
			}
            obj.palindrome(numb);
            i++;
		} */
		
		 
			
		
	}

}
