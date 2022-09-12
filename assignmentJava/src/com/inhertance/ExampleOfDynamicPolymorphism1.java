package com.inhertance;
import java.util.Scanner;
class Employee{
	int empId;
	String name;
	float exp;
	double amt;
	
	
  public Employee(){}
  public Employee(int a,String s,float f){
	  empId = a;
	  name = s;
	  exp = f;
	  //amt = b;
	  System.out.println("employe id is "+empId);
	  System.out.println("employe name is "+name);
	  System.out.println("employe experiance is "+exp);
	 // System.out.println("employe saleary2 is "+amt);
  }
  public double calculateSal(double d) {
	  amt=d;
	  System.out.println("\ncalculate salery in employee class "+amt);
	  return amt;
  }
  public String toString() {
	  return "name of employee is "+name+"\nemployee id is"+empId+"\nsalrey is "+amt;
  }

}
class HR extends Employee{
	public HR() {};
	public HR(int a,String s,float f) {
		super(a,s,f);
	}
	public double calculateSal(double d) {
		  super.calculateSal(d);
		  d +=d*.25;
		  amt=d;
		  System.out.println("\ncalculate salery in Hr class "+amt);
		  return d;
	  }
	 public String toString() {
		  return "salery of HR IS "+amt; }

}
class Developer extends Employee{
	public double calculateSal(double d) {
		  super.calculateSal(d);
		  d +=d*.75;
		  amt=d;
		  
		  System.out.println("calculate salery in developer class "+amt+"\n");
		  return amt;
	  }
	 public String toString() {
		  return "salery of developer class IS "+amt; 
		  }
}
class Manager extends HR{
	public Manager() {};
	public Manager(int a,String s,float f) {
		super(a,s,f);
	}
	public double calculateSal(double amt) {
		  super.calculateSal(amt);
		  amt +=amt*.25;
		  System.out.println("calculate salery in manager class "+amt);
		  return amt;
	  }
	 public String toString() {
		  return "salery of manager IS "+amt; 
		  }

	
}
public class ExampleOfDynamicPolymorphism1 {
	public static void main(String[]args) {
		Employee e = new Employee();
		Employee e1 = new Manager(100,"XYZ...",5.5f);
		e1.calculateSal(1200.75);
		System.out.println(e1);
		
	    e = new Developer();
	    e.calculateSal(100000.100);
	    System.out.println(e);
	//	e1.calculateSal(50000.100);
		
		/*e1=new Manager();
		e1.calculateSal(100000.100);
*/		
		
		
	}
	
}


	


	
