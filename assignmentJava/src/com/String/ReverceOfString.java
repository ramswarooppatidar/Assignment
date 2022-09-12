package com.String;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.String;

class StringReverce{
	public void reverceString(String str) {
		int j=0;
		String splitArray[] = str.split(" ");
		System.out.println(splitArray.length);
		for ( int i=splitArray.length-1;i>=0;i--) {
			System.out.print(splitArray[i]+" ");
			j++;
			
		}
		System.out.print("\n"+j);
	}
}

public class ReverceOfString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=0;
		
			System.out.println("plese enter a string"); 
			String str=sc.nextLine();
			
			StringReverce s = new StringReverce();
			s.reverceString(str);
			i++;
		
	}

}
