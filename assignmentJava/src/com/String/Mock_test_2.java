package com.String;
import java.util.Scanner;
public class Mock_test_2 {
	public void sumOfdiGIT(String s) {
		int digit;
		char ch[]= s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			int product=1;
			if(Character.isDigit(ch[i])) {
				digit = Character.getNumericValue(ch[i]);
				//System.out.println(digit);
				product =digit*digit;
				System.out.println("product of "+product);
			}
		}
	}
	public void SumDigit(String s) {
		int a;;
		for(int i=0;i<s.length();i++) {
			if(Character.isDigit(s.charAt(i))) {
				a = Character.getNumericValue(s.charAt(i));
				int product = a*a;
				System.out.println(product);
			}
		}
	}
	public void sum_of_continue_digit(String s) {
		String temp ="0";
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			
			if(Character.isDigit(s.charAt(i))) {
				temp += s.charAt(i);
				System.out.println(temp);
				if(i==s.length()-1) {
					sum += Integer.parseInt(temp);
				}
				
			}
			else
			{//System.out.println(temp);
				sum += Integer.parseInt(temp);
		
			    temp="0";}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("pls enter a string");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Mock_test_2 obj = new Mock_test_2();
		//obj.sumOfdiGIT(str);
		//obj.SumDigit(str);
		obj.sum_of_continue_digit(str);

	}

}
