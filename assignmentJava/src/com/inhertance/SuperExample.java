package com.inhertance;
class Account{
	int accId;
	float balance;
	String name;
	Account(){}
	Account(int a,float b,String s){
	    accId=a;
		balance=b;
		name=s;
		System.out.println("i am constructor of parennt class");
	}
	public void openAccount(int id) {
		accId=id;
		System.out.println("im in open acount method ");
	}
	public void showDetail() {
		System.out.println("account number is "+accId);
		System.out.println("account balance is is "+balance);
		System.out.println("account holdrer name is "+name);
	}
	
	
}
class SavingAccount extends Account{
	float iRate,amt;
	SavingAccount(){}
	SavingAccount(float f){
		super();
		iRate=f;
	}
	SavingAccount(float f,int a,float b,String s){
		super(a,b,s);
		iRate=f;
		//this.amt=amt;
	}
	public void showSavingAccDetail() {
		showDetail();
	}
	
	
	public void openAccount(int id) {
		accId=id;
		System.out.println("im a method of saving account");
	}
	
	
	public void depositeAmount(float amt) {
		this.amt=amt;
		balance+=amt;
		System.out.println("updated balance "+balance);
	}
	public void withdrawAmount(float amt) {
		balance-=amt;
		System.out.println("updated balance "+balance);
	}
	
	
}
public class SuperExample {
	public static void main(String[]args) {
		
		Account a= new Account();
		
		/*SavingAccount sa = new SavingAccount();
		SavingAccount sa1 = new SavingAccount(2300.6f,34,56.7f ,"abcd");
		sa1.depositeAmount(2300.8f);
		sa1.withdrawAmount(56757.7f);
		sa1.showSavingAccDetail();*/
		Account obj = new SavingAccount();
		obj. openAccount(98);
		
		
	}
	}
