package com.Day3AssignmentClass;

public class Sttudent {
	int roll,age,marks;
	float per;
	String name,grade;
	
	
	Sttudent(int roll,String name){
		this.roll=roll;
		this.name=name;
		System.out.println("\nroll number is "+roll);
		System.out.println("your name is "+name);
	}
	Sttudent(int age,int roll,String name){
		this(roll,name);
		this.age=age;
		//this.roll=roll;
		//this.name=name;
		System.out.println("\n\nyour age is is "+age);
		System.out.println("roll number is "+roll);
		System.out.println("your name is "+name);
	}
	Sttudent(int roll,int marks,String name,String g){
		
		this.roll=roll;
		this.marks=marks;
		this.name=name;
		grade=g;
		
		System.out.println("\n\nroll number is "+roll);
		System.out.println("your marks number is "+marks);
		System.out.println("your name is "+name);
		System.out.println("your gread is "+g);
	}
	//Constructor calling
	Sttudent(int roll,String name,int marks,String g,float per){
		this( roll, name);
		
		this.marks=marks;
		grade=g;
		this.per=per;
		
		System.out.println("your marks number is "+marks);
		System.out.println("your gread is "+g);
		System.out.println("your percentage is "+per+" %");
	}
	public static void main(String[] args) {
		Sttudent s1=new Sttudent(1234,"ram");
		Sttudent s2=new Sttudent(24,45,"A");
		Sttudent s3=new Sttudent(45,75,"ram","B");
		Sttudent S4=new Sttudent(23,"ram",80,"A",75.02f);
	}
	
		
		
		
		
	
		
		
		
		
		
		
		
	
		


}
