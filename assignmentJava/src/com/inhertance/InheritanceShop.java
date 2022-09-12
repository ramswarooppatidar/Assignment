package com.inhertance;
class Fruit{
	String colour,taste;
	float price;
	int a;
	public Fruit(int a) {
		this.a=a;
	}
	
	public void eatIt() {
		System.out.println("im inside eatIt method ");
	}
	public void purchceIt() {
		System.out.println("im inside purchaseIt method ");
	}
}
class DryFruit extends Fruit{
	String grade;
	float hollsaleRate;
	int c;
	public DryFruit() {
		c=100;
		super(12);
	}
	public void export() {
		System.out.println("im inside export method ");
	}
	public void import1() {
		System.out.println("im inside import1 method ");
	}
	
}
	

public class InheritanceShop {
	public static void main(String[] args) {
		DryFruit df = new DryFruit(12);
		Fruit f = new Fruit();
		//f.colour="pink";
		System.out.println(df.colour);
		System.out.println(df.taste);
		System.out.println(df.grade);
		System.out.println(df.hollsaleRate);
		df.export();
		//df.import1();
		df.eatIt();
		df.purchceIt();
		
	}

}
