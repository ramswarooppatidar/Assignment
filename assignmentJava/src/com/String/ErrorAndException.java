package com.String;
import java.util.InputMismatchException;
import java.util.Scanner;
class demoException{
	public void chack(String s) {
		char ch[] = s.toCharArray();
		/*for (int i=0;i<ch.length+1;i++) {
			System.out.println(ch[ch.length+1]);
			
		}*/
		for(int i=0;i<s.length()+1;i++) {
			System.out.println(s.charAt(s.length()+1));
		}
		
	}
	public void avarage(int a[]) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum += a[i];
		}
		System.out.println(sum/a.length);
		
	}
}

public class ErrorAndException {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		demoException o=new demoException();
	//	System.out.println("eneter a String ");
		//String str = sc.nextLine();
		//o.chack(str);
	//	System.out.println("eneter a number ");
		//int num = sc.nextInt();
		int a[] = new int[5];
		System.out.println("eneter a array elements ");
	
		try {
			for(int i=0;i<a.length;i++) {
				a[i]=sc.nextInt();
			}
			
			o.avarage(a);
		}
		catch(InputMismatchException|ArithmeticException e) {
			if(e instanceof InputMismatchException )
			System.out.println("pls enetr numeric value");
	
			
		}

		
		
	}

}
