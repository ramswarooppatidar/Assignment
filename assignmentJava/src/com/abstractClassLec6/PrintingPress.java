package com.abstractClassLec6;
interface Edit{
	void read();
	void update();
	default void write() {
		System.out.println("this method need a body");
	}
}
class Book{
	int b_id;
	String book_name;
	float b_cost;
	public Book(int a,String s,float f) {
		b_id = a;
		book_name = s;
		b_cost = f;
		}
	void publication() {
		System.out.println("read a magzin");
	}
	public String toString() {
		
	}
	


		
		
	}
	
}
class Magzine extends Book implements Edit{
	public void read() {
		System.out.println("read a magzin");

	}
	public void update() {
		System.out.println("now we update  a magzin");

	}
	/*public void write() {
		System.out.println(" you want to something edit in magzine ");

	}*/


}
public class PrintingPress {
	public static void main(String[]args) {
		
	}

}
