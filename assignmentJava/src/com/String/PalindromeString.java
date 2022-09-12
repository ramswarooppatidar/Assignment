package com.String;
import java.util.Scanner;
import java.io.InputStream;
import java.io.BufferedReader;
class Palindrome{

	public void chack_palindrome(String s) {
		String revrce="";
		for(int i=s.length()-1;i>=0;i--) {
			revrce+=s.charAt(i);
		}
		if(revrce.equals(s)) {
			System.out.println("string "+s+" is a palindrome ");
		}
		else
			System.out.println("not a palindrome");
	}
	public void chackPalindrome(String s) {
		String chack ="";
		String chack2 = "";
		//String chack3 = "";
		
		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)!=' ' &&s.charAt(i)!='.' && s.charAt(i)!=',')
			chack +=s.charAt(i);
		
		}
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ' &&s.charAt(i)!='.' && s.charAt(i)!=',')
			chack2 +=s.charAt(i);
			//chack3 += s.charAt(chack.length()-1-i);
		
		}
		if(chack.equals(chack2)) {
			System.out.println("is a palindrome");
		}
		else
			System.out.println("not a palindrome");
	}
	public void chackNumberIsPalindrome(int num) {
		String s = Integer.toString(num);
		String empty = "";
		int r;
		int cnt=0;
		while(num>0) {
			r= num%10;
			empty += r;
			num = num/10;
			
		}
		if(s.equals(empty)) {
			System.out.println("palindrome");
			
		}
		else {
			System.out.println("not palindrome");
		}
	}
		/*int i=0;int r;
		int cnt=0;
		boolean flag = true ;
		while(num>0) {
			r = num/10;
			cnt++;
			
		}
		int a[]= new int[cnt];
		int b[]= new int[cnt];
		while(i>0) {
			r = num%10;
			a[i]=r;
			b[cnt-1-i] = r;
			num = num/10;
		}
		for( i=0;i<a.length;i++) {
			
			if(a[i]!=b[i]) {
				flag = false;
				break;
			}
		}
		if(flag==false) {
			System.out.println("not a palindrome");
		}
		else
			System.out.println(" palindrome");
		
	}*/
	}

public class PalindromeString {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int j=0;
		while(j<3) {
		System.out.println("plese enter a string"); 
		String str=sc.nextLine();
		Palindrome p = new Palindrome();
		//p.chack_palindrome(str);
		p.chackPalindrome(str);
		j++;
		}
		/*Palindrome p1 = new Palindrome();
		System.out.println("....why??///");
		
		p1.chackNumberIsPalindrome(1234321);
		p1.chackNumberIsPalindrome(1234567);*/
		
		

		
	}
	
}
		
			
