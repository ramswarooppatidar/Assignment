package com.Day3AssignmentClass;
import java.util.Scanner;
public class Reactangle {
	public double  Area(float leng,float bredth) {
		double area;
		area=leng*bredth;
		return area;
		
	}
	public double Peremeter(float leng,float bredth) {
		double peri;
		peri=2*(leng+bredth);
		return peri;
	}

	public double circle(float radius) {
		double area=3.14*radius*radius;
		return area;
	}
	public double circleP(float radius) {
		double peremeter=2*3.14*radius;
		return peremeter;
	}
			
		
	public static void main(String[] args) {
		float leng,bredth,radius;
		Scanner sc=new Scanner(System.in);
		System.out.println("pls enter length of rectangle");
		leng=sc.nextFloat();
		System.out.println("pls enter bredth of rectangle");
		
		bredth=sc.nextFloat();
		Reactangle r=new Reactangle();
		r.Area(leng, bredth);
		r.Peremeter(leng, bredth);
		System.out.println("area of rectangle is:"+r.Area(leng, bredth));
        System.out.println("peremeter of rectangle is:"+r.Peremeter(leng, bredth));
        
        
        
        System.out.println("\n\npls enter radius of circle");
		radius=sc.nextFloat();
		r.circle(radius);
		r.circleP(radius);
		System.out.println("area of circle is:"+r.circle(radius));
        System.out.println("\nperemeter of rectangle is:"+r.circleP(radius));
    
	
	}
}


