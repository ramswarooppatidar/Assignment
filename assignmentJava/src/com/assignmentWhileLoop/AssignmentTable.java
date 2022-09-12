//print table using while
package com.assignmentWhileLoop;
import java.util.Scanner;
public class AssignmentTable {
	public static void main(String[] args) {
		System.out.println("please enter number of row you want to table of that number");
		int num;
		Scanner sc= new Scanner(System.in);
		num=sc.nextInt();
		int i=1;
		while(i<=10)
		{
			System.out.println(num*i);
			i++;
		}
	}
}

