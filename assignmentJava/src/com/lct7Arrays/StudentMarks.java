package com.lct7Arrays;
import java.util.Scanner;
class student22{
	int m1,m2,m3;
	String name,rollNo;
	 public String toString() {
		 return "student name "+name+"\nstudent rollnumber "+rollNo+"\nmarks1 "+m1+
				 "\nmarks2 "+m2+"\nmarks3 "+m3;
	 }
	 public student22(int m1,int m2,int m3,String name,String roll) {
		 this.m1=m1;
		 this.m2=m2;
		 this.m3 = m3;
		 this.name = name;
		 this.rollNo = roll;
	 }
}
public class StudentMarks {
	public static void main(String[] args) {
		student22 s[];
		s=new student22[2];
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<s.length;i++) {
			System.out.println("plz enter student record "+(i+1));
			System.out.println("enter marks of subject one");
			int m1=sc.nextInt();
			System.out.println("enter marks of subject two");
			int m2=sc.nextInt();
			System.out.println("enter marks of subject three");
			int m3=sc.nextInt();
			System.out.println("enter student  name");
			String name=sc.nextLine();
			sc.nextLine();
			System.out.println("enter student roll number");
			String roll=sc.nextLine();
			s[i]=new student22(m1,m2,m3,name,roll);
			sc.nextLine();			
		}
		System.out.println("student record ");
			for(int i=0;i<s.length;i++) {
				System.out.println(s[i]);
				System.out.println("____________________");
			}
		
		
	}

}
