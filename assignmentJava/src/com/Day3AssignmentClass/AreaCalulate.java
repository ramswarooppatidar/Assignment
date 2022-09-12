package com.Day3AssignmentClass;

public class AreaCalulate {
	
	int a,b;
	public float area(int a,int b) {
		float area=a*b;
		 return area;
	}
	public double area(float a,int b) {
		double area=0.5*a*b;
		return area;
	}
	public double area(float r) {
		double area=3.14*r*r;
		return area;
	}
	
		
	public static void main(String[] args) {
		AreaCalulate a = new AreaCalulate();
		a.area(5);
		
		a.area(7,8);
		System.out.println("area of triangle is "+a.area(5.f, 6));
		System.out.println("area of circle is "+a.area(5.f));
		System.out.println("area of reactangle is "+a.area(7,8));
		
	}

}
