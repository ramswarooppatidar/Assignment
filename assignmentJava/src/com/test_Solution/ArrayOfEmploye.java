package com.test_Solution;
import java.util.Scanner;
class employee{
	int salery[];
	public employee() {}
	public employee(int []a) {
		salery=a;
	}
	public void displaySalery() {
		System.out.println("salary of employee are..");
		for(int i=0;i<10;i++) {
			System.out.println(salery[i]+" ");
		}
		
	}
	public void minimumSalery(int a[]) {
		int min=salery[0];
		for(int i=0;i<salery.length;i++) {
			if(salery[i]<min) {
				min=salery[i];
			}
		}
		System.out.println("minimum salery of employee is "+min);
		
	}
}
public class ArrayOfEmploye {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		int salery[]= {100,34,567,34,965,2134,678,43,67,567};
		employee emp=new employee(salery);
		emp.displaySalery();
		emp.minimumSalery(salery);
		
		
		//employee emp[]=new employee[1];
		//emp[1]= {23,45}
		/*System.out.println("pls enetr salary of employe");
		for(int i=0;i<emp.length;i++) {
			System.out.println("enter salary of employ"+(i+1));
			emp[i]=sc.nextInt();
		}*/
	}

}
