package com.lct7Arrays;
import java.util.Scanner;
public class Student {
	public void acceptStudentDetails(Student s[]) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<s.length;i++) {
			System.out.println("enter student record");
			System.out.println("enter student marks1");
			int m1=sc.nextInt();
			System.out.println("enter student marks2");
			int m2=sc.nextInt();
			System.out.println("enter student name");
			String name=sc.next().toString();
		}
		
	}
	public void showStudent(Student arr[]) {
		for(int i=0;i<arr.length;i++) {
			//arr[i].showRecord();
		}
	}
	public static void main(String[] args) {
		Student[] s;
		s=new Student[5];
		Student o=new Student();
		o.acceptStudentDetails(s);
	}

}
