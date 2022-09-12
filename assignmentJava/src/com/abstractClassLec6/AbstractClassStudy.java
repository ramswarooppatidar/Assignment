package com.abstractClassLec6;
abstract class Shape{
	public void fillColour(String c) {
		System.out.println("fill colour is"+c);
	}
	abstract public void describeShape();
}
class Geometric extends Shape{
	public void describeShape() {
		System.out.println("this is geometric shape");
	}
	public void fillColour(String c) {
		System.out.println("fill colour in geometric is"+c);

	}
}
class freeHandShape extends Shape{
	public void describeShape() {
		System.out.println("this is freehand shape");
	}


		
}
public class AbstractClassStudy {
	public static void main(String[]args) {
		//Shape s = new Shape();   errorr
		Shape s = new Geometric();
		s.describeShape();
		s.fillColour(" black");
		s = new freeHandShape();
		s.describeShape();
	}

}
