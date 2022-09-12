package com.assignmentforloop;
import java.util.Scanner;
public class Assignment10 {
  public static void main(String[] args) {
	  int i,j,row;
	  System.out.println("how much row you want to print:");
	  Scanner sc=new Scanner(System.in);
	  row=sc.nextInt();
	  System.out.println("please enter 1 for righttriangle patter and 0 for reverce ");
	  int value=sc.nextInt();
	  
	  
	  if(value==1) {
	  for(i=1;i<=row;i++) {
		  for(j=1;j<=i;j++) {
			  System.out.print("* ");
			  
		  }
		 System.out.println("\n");
	  }
	  }
	  else if(value==0) {  
	  for(i=0;i<row;i++) {
		  for(j=1;j<=row-i;j++) {
			  System.out.print("* ");
			  
		  }
		 System.out.println("\n");
	  }
	  }
	  else {
		  System.out.println("please enter valid input");
	  }
       	  
  }
}

