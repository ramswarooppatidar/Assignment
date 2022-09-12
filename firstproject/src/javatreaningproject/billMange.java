package javatreaningproject;


import java.util.Scanner;
public class billMange {
	public static void main(String[] args) {
		Scanner Sc= new Scanner(System.in);
		int qty;
		int price;
		int amount;
		float discount;
		float totalPay;
		System.out.println("please enter quntity you want to purchase");
		qty = Sc.nextInt();
		System.out.println("please enter prise of your itemst");
		price = Sc.nextInt();
		amount = qty*price ;
		System.out.println("your total amount is : "+amount);
		
		if(amount>5000) {
			System.out.println("we are provide of 5% extra disccount");
			discount = (amount*5)/100;
			System.out.println("your discount is : "+ discount);
			totalPay=amount - discount;
			
			System.out.println("finally you pay : "+totalPay);
			System.out.println("thankyou for shappoing");
			
		}
		else {
			System.out.println("your amount is less than 5000 so not"
					+ " provided you any discount");
			
			System.out.println("finally you pay"+amount);
		}
		
		
	}

}
