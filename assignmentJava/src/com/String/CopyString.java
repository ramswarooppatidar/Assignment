package com.String;
import java.util.Scanner;
class copy{
	public void stringCopy(String a) {
		String s2="";
		for(int i=0;i<a.length();i++) {
			s2 += a.charAt(i);
		}
		System.out.println(s2);
	}
	public void occurance(String s) {
		
		for(int i=0;i<s.length();i++) {
			int cnt=1;
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					cnt++;
				}
			}
			System.out.println(s.charAt(i)+" occour "+cnt);
		}
	}
}

public class CopyString {
	public static void main(String[]args) {
		String s1="goodMorning";
		copy obj = new copy();
		obj.stringCopy(s1);
		obj.occurance(s1);
	}

}
