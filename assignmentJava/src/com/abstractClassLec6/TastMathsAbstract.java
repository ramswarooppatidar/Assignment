package com.abstractClassLec6;
abstract class Geometry{
	int length;
	int breadth;
	int height;
	int radius;
	Geometry(int l,int b){
		this.length=l;
		this.breadth=b;
		System.out.println("i am set length and beadth");
	}
	Geometry(int r){
		radius = r;
		System.out.println("i am set radius");
	}
	public static void ram() {
		System.out.println("my name is ram swaroop");
	}
	abstract void area();
}
class Circle extends Geometry{
	Circle(int c){
		super(c);
		System.out.println("i am in Circle class radius = "+radius);
	}
	public void area() {
		System.out.println("area of circle is "+2*3.141*radius);
		
	}
}
class Rectangle extends Geometry{
	Rectangle(int len,int bre){
		super(len,bre);
		System.out.println("i am in Rec classlength and breadth is "+length+" "+breadth);
	}
	public void area() {
		System.out.println("area is "+length*breadth);
		
	}
}
class Cuboid extends Geometry{
	Cuboid(int l,int b,int c){
		super(l,b);
		height = c;
		System.out.println("i am cuboid constructor set height");
	}
	public void area() {
		System.out.println("volume of cuboid is "+length*breadth*height);
		
	}
}
abstract class Shap2 extends Geometry{
	Shap2(int a,int b){
		super(a,b);
	}
}
class demo extends Shap2{
	demo(int a,int b){
		super(a,b);
	}
	public void area() {
		System.out.println("area is "+length*breadth);
	}
}

public class TastMathsAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Geometry obj = new Cuboid(3,7,11);
		Geometry obj1 = new Rectangle(3,11);
		Geometry obj2 = new Circle(3);
		obj2.area();

		Geometry.ram();*/
		
		Shap2 obj4 = new demo(4,6);
		obj4.area();
		
		


	}

}
