package com.Day3AssignmentClass;

public class Account {
	float bal,deposite,withdraw,newBalnce,currentBal;
	int acNo;
	String name;
	public void openAccount(String s,int acNo,float bal,
			float wBal,float dBal) {
	    name=s;
		this.acNo=acNo;
		this.bal=bal;
		currentBal=bal;
		withdraw=wBal;
		deposite=dBal;
		
	}
	public void showAccountDetail() {
		 System.out.println("your account number  is"+acNo);
		 System.out.println("account holder  name is "+name);
		 System.out.println("current balance is "+bal);
		
	}
	public float depositeAmount(float deposite) {
		float newBalance=bal+deposite;
		
		return newBalance;
	}
	public float withdrawAmount(float deposite) {
		float newBalance=bal-withdraw;
	
		return newBalance;
		
	}
	
	
	public static void main(String[] args) {
		
		Account a=new Account();
		a.openAccount("ram",123435,4500.0f,1200,1000);
		a.showAccountDetail();
		float newBalance;
		a.depositeAmount(1200);
		System.out.println("your new balnce after deposite is :"+a.depositeAmount(1200));
		a.withdrawAmount(1000);
		System.out.println("your new balnce after withdraw is :"+a.withdrawAmount(1200));
	}

}
