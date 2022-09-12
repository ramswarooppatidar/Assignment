package com.abstractClassLec6;
interface Vichales{
	void  start();
	int a=12;
	void speed(int a);
}
class Bike implements Vichales{
	public void start() {
		System.out.println("bike start");
	}
	public void speed(int s) {
		System.out.println("bike start running with speed of "+s+" km/hr");
	}
	public static void change() {
		int a=15;
		System.out.println("vaule of a in static method"+a);
	}
}
interface Car  implements Bike extends Vichales{
	
}
	
		
	
	 
	

public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
      int b=Vichales.a;
      System.out.println(b);
      System.out.println(Vichales.a);
      Bike.change();
      System.out.println(Bike.a);
      
	}

}
