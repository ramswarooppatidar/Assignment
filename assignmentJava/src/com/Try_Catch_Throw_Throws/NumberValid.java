package com.Try_Catch_Throw_Throws;
import java.util.Scanner;
class InvalidNumberException extends Exception{
	public String getMessage() {
		return "enter only number not start with zero";
	}
}
class CharacterException extends Exception{
	public String getMessage1() {
		return "not allowed character ";
	}
}


public class NumberValid {
	public void validNum(String n)throws InvalidNumberException{
		if(n.matches("[1-9][0-9]{9}")) {
			System.out.println("number is valid");
			
		}
		else {
			throw new InvalidNumberException();
		}
	}
	public void validNum2(String s)throws CharacterException{
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a 10 digit number ");
		String s = sc.next();
		NumberValid obj = new NumberValid();
		try {
			
			obj.validNum(s);
		}catch(InvalidNumberException e) {
			System.out.println(e.getMessage());
		}
	
		

	}

}
