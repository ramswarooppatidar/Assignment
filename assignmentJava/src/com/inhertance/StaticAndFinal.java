package com.inhertance;
class Car{
	static String model = " tata";
	//String model = " tata";
	static int totalCarSold=15;
	public static void carSpeed() {
		//model="maruti";
		System.out.println("car present in parent class is "+model);
	}
	public  void carSold() {
		//model="maruti";
		System.out.println("total number of car sold in parent class is "+totalCarSold);
	}
}
class Tatanexon extends Car{
	//super.model="maruti";
	public static void carSpeed() {
		System.out.println("car present in child class is "+model);	
		
	}
	public  void carSold() {
		//model="maruti";
		System.out.println("total number of car sold in child class "+totalCarSold);
	}
	
}

public class StaticAndFinal {
	public static void main(String[]args) {
		Car c = new Tatanexon();
		c.carSpeed();
		c.carSold();
		c.model="suzuki";
		//c.totalCarSold=250;
		//c.totalCarSold=550;
		
		c.carSpeed();
		c.carSold();
		
		
	}

}
