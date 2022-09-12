package com.Day3AssignmentClass;
import java.util.Scanner;
class Account1{
	int accNo;
	float currentBal,deposite,withdraw,amt;
	String name;
	
	public void displayAcountInformation() {
		System.out.println("your account number is "+accNo);
		System.out.println(" account holder number is "+name);
		
	}
	public float withDraw(float amt)
	{
		while(currentBal>=withdraw)
		{
			System.out.println("you want to withdraw amount is "+amt);
			currentBal=currentBal-withdraw;
		}
		if(currentBal<=withdraw)
			System.out.println("insufficent balance");
		return currentBal;
	}
	public float desposite(float amt)
	{
		System.out.println("you want to deposite amout"+amt);
		currentBal=currentBal+deposite;
		return deposite;
	}
	
}	
	
public class Assignment6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account1 a=new Account1();
		int choice;
		System.out.println("pls enter your choice, 0 for deposite and 1 for withdraw");
		choice=sc.nextInt();
		if(choice==0) {
			System.out.println("pls enter amout you want to deposite");
			float amt=sc.nextFloat();
			System.out.println("your current balance is"+a.desposite(amt));
		}
		
	}
}



