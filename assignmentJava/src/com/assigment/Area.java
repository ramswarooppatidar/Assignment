package com.assigment;
import java.util.Scanner;
public class Area {
	public static void main(String[] args) {
		
		float radius,length,bredth,base,height;
		double area,perimeter,hyptenious;
		int choice;
	
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter your choice");
		System.out.println("1 for circle");
		System.out.println("2 for rectengle");
		System.out.println("3 for sqaure");
		System.out.println("4 for triangle");
		System.out.println("\n------------------");
		System.out.println("pls enter your choice");
		 		//height=sc.nextFloat();
		//base=sc.nextFloat();
		choice=sc.nextInt();
		switch(choice) {
		case 1:System.out.println("you select circle");
		       System.out.println("pls enter radius");
		       radius=sc.nextFloat();

		       area=3.141*radius*radius;
		       perimeter=2*3.141*radius;
		       System.out.println("area of circle is "+area);
		       System.out.println("perimeter of circle is "+perimeter);
		break;
		case 2:System.out.println("you select rectangle");
		       System.out.println("pls enter length ");
		       length=sc.nextFloat();
		       System.out.println("pls enter bredth");
		       bredth=sc.nextFloat();
	           area=length*bredth;
	           perimeter=2*(length+bredth);
	           System.out.println("area of rectangle is "+area);
	           System.out.println("perimeter of rectangle is "+perimeter);
	    break;
		case 3:System.out.println("you select square");
		       System.out.println("pls enter length ");
	           length=sc.nextFloat();
	           area=length*length;
	           perimeter=2*(length);
	           System.out.println("area of rectangle is "+area);
	           System.out.println("perimeter of perimeter is "+perimeter);
	    break;
		case 4:System.out.println("you select triangle");
	           System.out.println("pls enter height ");
	           height=sc.nextFloat();
	           System.out.println("pls enter base ");
	   		   base=sc.nextFloat();
	   		   area=0.5*base*height;
               
               
               System.out.println("area of rectangle is "+area);
               
        break;
        default:
        	   System.out.println("pls enter correct choice");
	
		       
		}
	}
}

