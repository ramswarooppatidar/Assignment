package com.Try_Catch_Throw_Throws;
enum softy{
	VANILLA,MANGO(10,20),BUTTERSCTOCH(10,30);
	int price;
	int quantity;
	softy(){}
	softy(int c ,int q){
		price = c;
		quantity=q;
	}
	public void getTotalPrice() {
		int totalPrice=price*quantity;
		System.out.println("total price of ice cream"+totalPrice);
	}
}
public class IcreamSwitchEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     softy f= softy.BUTTERSCTOCH;
     
     switch(f) {
     case BUTTERSCTOCH:
    	 
    	 f.getTotalPrice();
    	 break;
     case VANILLA:
    	 f.getTotalPrice();
    	 break;
     case MANGO:
     }
	}

}
