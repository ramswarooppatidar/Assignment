package com.Day3AssignmentClass;
class Studant{
	int id=15;
	String name="ramkatariya";
}
public class Assignment2 {
	public static void main(String[] args)
	{
		Studant s1=new Studant();
		Studant s2=new Studant();
		System.out.println(s1.id);
		System.out.println(s1.name);
		//System.out.println(s2.id);
		//System.out.println(s2.name);
		
//		now change the value of instance variable");
		s1.id=20;
		s1.name="ThinkQuotient";
		System.out.println("\n\nyour id is "+s1.id+"\nand your name is "+s1.name);
		
//		now change the value of instance variable by second object
		s2.id=45;
		s2.name="javaprogramming";
		System.out.println("\n\nyour id is "+s2.id+"\nand your skill is "+s2.name);
	
		System.out.println("\n\nfirst way of copy data--------");
		s2.id=s1.id;
		s2.name=s1.name;
		System.out.println("your id is "+s2.id+"\nand your skill is "+s2.name);
		
		System.out.println("\n\nsecondway of copy data--------");

        s2=s1;
        System.out.println("your id is "+s2.id+"\nand your skill is "+s2.name);
        System.out.println("\nhashcode is:"+s2.hashCode());
        System.out.println("hashcode is:"+s1.hashCode());
	}

}
