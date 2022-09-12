package com.lct7Arrays;
import java.util.Scanner;
public class Exam {
	int roll,marks[];//int marks[];
	String name;
	public Exam() {}
	public Exam(int r,String s,int []m) {
		roll=r;
		name=s;
		marks=m;
	}
	public void display() {
		System.out.println("Student roll number "+roll);
		System.out.println("\nstudent name is "+name);


		System.out.println("\nmarks of different subject");
		for(int i=0;i<marks.length;i++) {
			System.out.print(marks[i]+" ");
			
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//int marks1[] = {78,67,89,98,67,56};
		//int marks2[] = {78,87,89,48,77,86};
		System.out.println("please enter total number of subject");
		int size=sc.nextInt();
		int marks1[]=new int[size];
		System.out.println("enter marks of student 1 ");
		for(int i=0;i<marks1.length;i++) {
			marks1[i]= sc.nextInt();
			
		}
		int marks2[]=new int[size];
		System.out.println("enter marks of student 2 ");
		for(int i=0;i<marks1.length;i++) {
			marks2[i]= sc.nextInt();
			
		}
		Exam obj=new Exam(101,"ram",marks1);
		Exam obj2=new Exam(79,"ramSwaroop",marks2);
		obj.display();
		obj2.display();
	}

}
