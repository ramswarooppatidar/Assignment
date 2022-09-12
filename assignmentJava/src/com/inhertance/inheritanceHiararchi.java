package com.inhertance;
class School{
	int id;
	String name;
   School(){}
   
   School(int a){
	  id=a; 
   }
   School(int b,String s){
	   id=b;
	   name=s;
   }
	

}
class Student extends School{
	int roll;
	String name1;
	
	Student(){
		
		name1="katariya";
		id=25;
		
	}
		
	Student(int a,String s){
		super(23,"xyz");
		roll=a;
		name1=s;
	}
	public void Display() {
		System.out.println("parent class constructor ,school id is "+id);
		System.out.println("parent class constructor ,name of school is is "+name);
		System.out.println("child class constructor ,roll number is "+roll);
		System.out.println("child class constructor ,student name is "+name1);
		
	}
	
}
public class inheritanceHiararchi {
		
		
	public static void main(String[] args) {
		Student s = new Student();
		Student s1 = new Student(200,"rammm");
		School sc = new School();
		//s.Display();
		System.out.println("\n______________________");
		s1.Display();
		
	}
	

}
