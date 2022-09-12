package com.assignmentforloop;
import java.util.Scanner;
public class AssignmentFabiano {
	public static void main(String[] args)
	{
	    int n , firstTerm = 0, secondTerm = 1;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("please enter a number you want to print fabiano series:");

	    n=sc.nextInt();
	    System.out.println("Fibonacci Series till " + n + " terms:");

	    for (int i = 1; i <= n; ++i) {
	      System.out.print(firstTerm + ", ");

	      // compute the next term
	      int nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;
	    }

	}

}
