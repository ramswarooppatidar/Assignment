package com.String;

import java.rmi.AccessException;
class NegativeRadiusException extends Exception{
	public String toString() {
		return "radiuse cannot be nagative";
	}
	public String getMeassage() {
		return "radius cannot be negative";
	}
}

public class ThrowThrows {
	public static double area(int r) throws NegativeRadiusException {
		if(r<0) {
			throw new NegativeRadiusException();
		}
		double result = Math.PI*r*r;
		return result;
	}
	
	public static int divide(int a,int b) throws ArithmeticException {
		int result = a/b;
		return result;
	}
	public static void main(String[]args) {
		try {
		int c = divide(6,4);
		System.out.println(c);
		}
		catch(Exception e){
			System.out.println("Exception");
			
		}
		try {
			//without try_catch compiler not allowed;
			double ar = area(6);
			System.out.println(ar);
		}
		catch(Exception e) {
			System.out.println("exception");
		}
	}

}
