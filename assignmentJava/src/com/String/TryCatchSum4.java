package com.String;
import java.util.Scanner;
import java.util.InputMismatchException;
class TryCatchSol{
	        boolean bool = false;
            int sum=0;
            int sumCatch=0;
            Scanner sc = new Scanner(System.in);
            
           
		public void trycatchM( ) {
			System.out.println(" Entered in trycatch block and chang sum "+sum);
			boolean flag = true;
			int sum=0;
			int sumCatch=0;
			int total;
			//sum +=a;
			try {
				while(flag) {
					String s ="y";
					Scanner sc = new Scanner(System.in);
					System.out.println("please enter a number");
					int num = sc.nextInt();
					sum += num;
					 TryCatch tc = new TryCatch();
					// tc.sum(sum);
					
					System.out.println("plz enter y for continue and n for exit");
					String str = sc.next();
					if(s.equals(str)) {
						flag = true;
					}
					else {
						flag = false;
					   System.out.println("in else block , flage=false");
						
						break;
					}
				}
		
		    System.out.println("\n\nnow i am out of while block and sum of total number is "+sum);
			}
			catch(InputMismatchException|ArithmeticException e) {
				if(e instanceof InputMismatchException )
				   System.out.println("im in catch block pls enter numeric value");
				   TryCatchSol tc = new TryCatchSol();
				   int c = sc.nextInt();
				   sum += c;
				  
				   System.out.println("catch block sum is"+sum);
				   tc.trycatchM();
			}
			
			
		}
		
}
public class TryCatchSum4 {
	public static void main(String[]args) {
		TryCatchSol tc = new TryCatchSol();
		tc.trycatchM();
		
	}
	
}
			

		
	


