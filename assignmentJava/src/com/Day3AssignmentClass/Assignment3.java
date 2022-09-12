package com.Day3AssignmentClass;
class Boys{
	 int roll;
	 String name;
	 
	 public int getRoll() {
		 return roll;
	 }
	 public void setRoll(int roll) {
		 this.roll=roll;
	 }
	 public String getName() {
		 return name;
	 }
	 public void setName(String s) {
		 name=s;
	 }
	 public void DisplayData() {
		 setRoll(45);
		 setName("ramkatariya");
		 System.out.println("your roll number is :"+roll);
		 System.out.println("your name is :"+name);
		 
	 }

}
public class Assignment3 {
	public static void main(String[] args) {
		
		Boys s=new Boys();
		s.setRoll(12345);
		s.name="ram";
		System.out.println(s.getRoll());
		s.DisplayData();
	}

}
