package com.abstractClassLec6;
abstract class PaymentMode{
	int accNo;
	String aName;
	public PaymentMode(int a, String s) {
		accNo = a;
		aName = s;
	}
	abstract public void pay();
}
class CreditCard extends PaymentMode{
	public CreditCard(){};
	public void pay() {
		System.out.println("payment is done through creditaCard");
	}
}


public class ShoppingAbstraction {
	public static void main(String[]args) {
		
	}

}
