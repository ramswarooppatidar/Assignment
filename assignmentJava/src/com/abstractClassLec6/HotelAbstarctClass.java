package com.abstractClassLec6;
abstract class Food{
	abstract public void prepareFood();
	abstract public void ingradiants();
	public void ParselFood() {
		System.out.println("food is deliverd");
	}
}
class noodles extends Food{
	public void prepareFood() {
		System.out.println("prepared ");
	}
	public void ingradiants() {
		System.out.println("nodles and many more");
		
	}
	public void ParselFood() {
		System.out.println("food is deliverd");
	}
	
}
abstract class Maggi extends Food {
	public void prepareFood() {
		System.out.println("prepared ");
	}
	public void ingradiants() {
		System.out.println("MAGGI and many more");
		
	}
	public void ParselFood() {
		System.out.println("food is deliverd");
	}
	public void test() {
		System.out.println("test is good");
	}
    	 
}
class MasalaMaggi extends Maggi{
	public void Maggi222() {
		System.out.println("more crispe ");
	}
	
}
public class HotelAbstarctClass {
	public static void main(String[]args) {
		Food f = new MasalaMaggi();
		f.prepareFood();
		f.ingradiants();
		f.ParselFood();
		//f.Maggi222();
		
		Maggi m = new MasalaMaggi();
		//m.Maggi222();
		
		
	}
	
}
     

	
