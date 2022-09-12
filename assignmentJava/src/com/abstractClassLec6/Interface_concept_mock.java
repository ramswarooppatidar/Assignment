package com.abstractClassLec6;
interface Movebale{
  	 void move(); 
}
class Car implements Movebale{
	public void move() {
		System.out.println("horizontal moving");
	}
	public void name() {
		System.out.println("TATA");
	}
}


public class Interface_concept_mock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Movebale obj = new Car();
      obj.move();
      Car obj1 = new Car();
      obj1.name();
      
	}

}
