package com.test_Solution;
import java.util.Arrays;
import java.util.Scanner;
 class manager{
	int manId,experience;
	String name;
	department depDetail[];
	
	public manager() {}
	public manager(int mid,int exp,String name,department []a) {
		this.manId=mid;
		this.experience=exp;
		this.name=name;
		this.depDetail=a;
	}
	public String toString() {
		return "manager name is "+name+"\nmanager id is "+manId+"\nyear of expereince is "+experience
				+"\ndepartment detail is "+Arrays.toString(depDetail);
	}
	
	
}
 class department{
	 int depId;
	 String depName,manager;
	 public department() {}
	 public department(int depId,String depName,String manager) {
		 this.depId=depId;
		 this.depName=depName;
		 this.manager=manager;
	 }
	 public String toString() {
		 return "\ndepartment name is "+depName+"\ndepartment id is "+depId+
				 "\ndepartment manager name"+manager;
	 }
 }
public class ManagerDepartmentArray {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		department dep[];
		department dep1[]=new department[1];
		dep1[0]=new department(100,"electronic","Mr. chandresh");
		
		department dep2[]=new department[1];
		dep2[0]=new department(200,"agriculture","Mr. rocky");
         
		department dep3[]=new department[1];
		dep1[0]=new department(300,"railway","Mr. chidar");
		
		department dep4[]=new department[1];
		dep1[0]=new department(400,"bank","Mr.shubham thakur");
		
		department dep5[]=new department[1];
		dep1[0]=new department(500,"comunication","Mr.vicky bisen");
		manager m=new manager();
		manager m1=new manager(10,5,"rahul",dep1);
		manager m2=new manager(20,10,"ram",dep2);
		manager m3=new manager(30,15,"aman",dep3);
		manager m4=new manager(40,20,"nilesh",dep4);
		manager m5=new manager(50,25,"karma",dep5);
		System.out.println("department records are");
		System.out.println(m1);
		System.out.println("__________________");
		System.out.println(m2);
		System.out.println("__________________");

		System.out.println(m3);
		System.out.println("__________________");

		System.out.println(m4);
		System.out.println("__________________");

		System.out.println(m5);
		System.out.println("__________________");

		



		
	}

}
