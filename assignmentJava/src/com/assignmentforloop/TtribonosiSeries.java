package com.assignmentforloop;
import java.util.Scanner;
public class TtribonosiSeries {
	public static void main(String[] args)
	{
	    int n , firstTerm = 0, secondTerm = 1,thirdTerm=1;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("please enter a number you want to print fabiano series:");

	    n=sc.nextInt();
	    System.out.println("Fibonacci Series till " + n + " terms:");

	    for (int i = 1; i <= n; ++i) {
	    	if(firstTerm<1000) {
	      System.out.print(firstTerm + ", ");
	    	}

	      // compute the next term
	      int nextTerm = firstTerm + secondTerm +thirdTerm;
	      firstTerm=secondTerm;
	      secondTerm = thirdTerm;
	      thirdTerm = nextTerm;
	    }

	}

}

