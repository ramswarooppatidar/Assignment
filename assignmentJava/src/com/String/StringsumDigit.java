package com.String;
import java.lang.String;
class pr{
	public void main(String s) {
		String temp="0";
		int sum=0;
		for(int i=0;i<s.length();i++) {
			//char ch = s.charAt(i);
			if(Character.isDigit(s.charAt(i))) {
				temp += s.charAt(i);
				if(i==s.length()-1) {
					sum += Integer.parseInt(temp);
				}
			}
			else{
				sum = sum+ Integer.parseInt(temp);
				System.out.println("sum of string digit after adding "+temp +"is :"+sum);
				temp="0";
			}
		}
		System.out.println("sum of string digit is "+sum);
	}
}
public class StringsumDigit {
	public static void main(String[]args) {
		String str="am123pati4g7f3hh7kk9v4vb5dar1katriya4";
		pr obj = new pr();
		obj.main(str);
	}

}
