package com.String;
import java.util.Scanner;
class StringMethod{
public void compare(String s,String s1) {
	if(s.compareTo(s1)>0) {
		System.out.println("string s is grater than string s1");
	}
	else if(s.compareTo(s1)<0) {
		System.out.println("string s1 is grater than string s");
	}
	else {
		System.out.println("string s  is equal to  string s1");
	}
	
}
public boolean acceptNum(String num) {
	boolean result = num.matches("[1-9][0-9]{9}");
	return result;
	
}
public boolean chackMail(String s) {
	//([a-zA-Z0-9_.-]+)@([a-zA-Z]+)([\.])([a-zA-Z]+)

	boolean result = s.matches(" ([a-z0-9_.-]+)@([a-z]+)([.])([a-z]+)");

	return result;
}
}

public class compareto {
	public static void main(String[]args) {
		String s="ram";
		String s1="Ram";
		System.out.println(s.compareTo(s1));
		/*if(s.compareTo(s1)>0) {
			System.out.println("string s is grater than string s1");
		}
		else if(s.compareTo(s1)<0) {
			System.out.println("string s1 is grater than string s");
		}
		else {
			System.out.println("string s  is equal to  string s1");
		}*/
		StringMethod m = new StringMethod();
		//m.compare(s,s1);
		Scanner sc = new Scanner(System.in);
		int i=0;
		while(i<2){
			
			//System.out.println("enter a numbe rString");
			//String num = sc.next();
			System.out.println("plz enter a valid mail id");
			String str = sc.next();
			/*if(m.acceptNum(num)) {
				System.out.println("valid");
				}
				else
					System.out.println("invalis");*/
			if(m.chackMail(str)) {
				System.out.println("valid mail id");
			}
			else
				System.out.println("invalid mail id");
			
			i++;
		}
		
		
	}

}
