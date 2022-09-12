package com.Day3AssignmentClass;
import java.util.Scanner;
public class Studdentt {
	String name;
	int roll;
	float m1,m2,m3,m4,m5;
	/*public void acceptDetail(String name,int roll) {
		this.name=name;
		this.roll=roll;
	
	}*/
	Studdentt(String name,int roll){
		this.name=name;
		this.roll=roll;
	}
	Studdentt(String name,int roll,float a,float b,float c,float d,float e){
		this(name,roll);
	
	}
	public void showDetail( Studdentt obj ) {
		System.out.println("your name is:"+obj.name);
		System.out.println("your roll number is"+obj.roll);
		System.out.println("your name is:"+name);
		System.out.println("your roll number is"+ roll);

	}
	public float percentage(float m1,float m2,float m3,float m4,float m5) {
		float avg=(m1+m2+m3+m4+m5)/5;
		float per=avg;
		return per;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("pls enter your name");
		String name=sc.nextLine();
		
		System.out.println("pls enter your roll number");
		int roll=sc.nextInt();
		
		Studdentt s=new Studdentt("ram",45);
		Studdentt s1=new Studdentt("ram",45,75.0f,80.0f,90.0f,95.0f,100.0f);
       // s1=s;
		//s.acceptDetail(name,roll);
		//s1.showDetail(s);
		
		
		/*System.out.println("pls enter your 5 sublect  marks ");
		float m1=sc.nextFloat();

		float m2=sc.nextFloat();

		float m3=sc.nextFloat();

		float m4=sc.nextFloat();

		float m5=sc.nextFloat();
		s.percentage(m1,m2,m3,m4,m5);
		System.out.println("your percange is "+	s.percentage(m1,m2,m3,m4,m5)+"%");

		*/
		
		
		
	}

}
