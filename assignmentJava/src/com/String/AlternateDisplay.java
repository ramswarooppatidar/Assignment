package com.String;
import java.util.Scanner;
class displayAlternate{
	public void show(String a) {
		String s2="";
		String s3="";
		for(int i=0;i<a.length();i++) {
			if(i%2==0) {
				
				s2 += a.charAt(i);
			}
		}
		for(int i=a.length()-1;i>=0;i--) {
			//if(i%2==0) {
				
				s3 += a.charAt(i);
			//}
		}
		System.out.println("alternate elements of arrays are\n"+ s2);
		System.out.println("reverce alternate elements of arrays are\n"+ s3);

	}
}
public class AlternateDisplay {
	public static void main(String[] args) {
		String s="goodMorning";
		displayAlternate obj = new displayAlternate();
		System.out.println(s);
		obj.show(s);
		
	}

}
