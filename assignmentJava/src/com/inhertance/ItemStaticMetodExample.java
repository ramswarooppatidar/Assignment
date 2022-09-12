package com.inhertance;
class Item3{
	static int prise=100;
	String name;
	public static void Quality() {
		System.out.println("quality is good");
	}
}
class goods extends Item3{
	//super.prise=150;
	public static void Quality() {
		System.out.println("quality is good and in child class");
	}
}
public class ItemStaticMetodExample {
	public static void main(String[]args) {
		Item3 i = new goods();
		i.Quality();
		
	}

}
