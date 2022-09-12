package com.Day3AssignmentClass;
class Studen {
	int id=45;
	String  name="ram";
	public void displyDetail() {
		System.out.println("your id is "+id);
		System.out.println("your id name is "+name);
			}
	
}

public class Assignment4 {
	public static void main(String[] args) {
		Studen s1= new Studen();
		Studen s2= new Studen();
		s1.displyDetail();
		System.out.println("\n\nafter change vlaue");
		s1.id=55;
		s1.name="ramswaroop";
		s1.displyDetail();
		
		//Assignment5
		s2=s1;
		s2.displyDetail();
		
		
	}
	

}
