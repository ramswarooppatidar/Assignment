package com.String;
import java.util.Scanner;
class DigitSumString {

	public void sum(String s) {
		float sum=0;
		for (int i =0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(Character.isDigit(ch)) {
				sum += Character.getNumericValue(ch);
			}
		}
		float avg= sum/s.length();
		System.out.println("avg of string digit is "+avg);
	}
	
}
public class Mock_question {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String s = sc.next();
		DigitSumString obj = new DigitSumString();
		obj.sum(s);
		
	}

}
