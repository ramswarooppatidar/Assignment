package com.String;
import java.util.InputMismatchException;
import java.util.Scanner;
public class UserInputSum {
	public static void main(String[]args) {
		boolean flag =true;
		String s="y";
 Scanner sc = new Scanner(System.in);
		int sum=0;
	
		while(flag) {
			
				
				System.out.println("please Enter a number");
			      int num = sc.nextInt();
				sum +=num;
				System.out.println(" enter y for continue and n for exit ");
				String str = sc.next();
				                                                //String str1=str.toLowerCase();
				sc.nextLine();                                  //System.out.println(s.compareTo(str));
                                                            //System.out.println(s.equals(str));
				if(s.equals(str))
				{
					System.out.println("if block");
					flag=true;
				}
				else {
					System.out.println("else block flag=FALSE");
					flag=false;
					break;
				}
					
		}
		System.out.println("\n\nnow i am out of while block and sum of total number is "+sum);
	}
	
}
					
				
				
				                                            

			
