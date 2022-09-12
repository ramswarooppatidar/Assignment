package com.String;
import java.util.Scanner;
import java.util.InputMismatchException;
class TryCatch{
	        boolean bool = false;
            int sum=0;
            int sumCatch=0;
          
           
	  Scanner sc = new Scanner(System.in);
		public void trycatchhh(int a) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Entered in trycatch block and chang sum "+sum);
			boolean flag = true;
			int sum=0;
			int sumCatch=0;
			int total;
			//sum +=a;
			//TryCatch tc = new TryCatch();
			 int oldsum=sum(0,0);
			 String s ="y";
			try {
				 
				
					while(s.equals("y")) {
					
					System.out.println("please enter a number");
					int num = sc.nextInt();
					
				
					oldsum= sum(oldsum,num);
					
					System.out.println("plz enter y for continue and n for exit");
					s= sc.next();
					
					}
					  
					
								
		    System.out.println("\n\nnow i am out of while block and sum of total number is "+oldsum);
			}
			catch(InputMismatchException|ArithmeticException e) {
				if(e instanceof InputMismatchException )
					System.out.println("im in catch block pls enter numeric value");
				 sc.nextLine();
				  do
				  {
				   System.out.println("please enter a number");
				   int c = sc.nextInt();
				 //  sum += c;
				  oldsum= sum(oldsum,c);
				 //  System.out.println("catch block sum is"+sum);
				   System.out.println("plz enter y for continue and n for exit");
					s= sc.next();
				  }while(s.equals("y"));
				  
				  System.out.println("final sum is " + oldsum);
				   
			}
			
			
		}
		public int sum(int prevsum,int s) {
			int sumF=0;
			sumF = prevsum+s;
			return sumF;
		
				//System.out.println("\nnow i am in sumMethod and sumF of total number is "+sumF);
		}
				
}
public class UserInputTryCatch {
	public static void main(String[]args) {
		int sumF=0;
		TryCatch tc = new TryCatch();
		tc.trycatchhh(0);
		
	}
	
}
			

		
	
