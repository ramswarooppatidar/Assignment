package com.String;
import java.util.InputMismatchException;
import java.util.Scanner;
class resolveSumProblem{
	Scanner sc = new Scanner(System.in);
	public void tryCatchSum(int a) {
		int sum=0;
		int sumCatch=0;
		boolean flag = true;
		String s="y";
	
		
		try {
			while(flag) {
				
				System.out.println("please enter a number");
				int num = sc.nextInt();
				sum += num;
			
				System.out.println("enter y for continue and n for exit");
				String str = sc.next();
				if(s.equals(str)) {
					flag = true;
				}
				else {
					System.out.println("i am in else block");
					flag=false;
					break;
				}
			}
			
			System.out.println("out of while block and sum is "+sum);
		
				
		}
		catch(InputMismatchException e) {
			if(e instanceof InputMismatchException) {
				System.out.println("please enter numeric vlaue");
				int cth = sc.nextInt();
				sum += cth;
				resolveSumProblem obj = new resolveSumProblem();
				obj.tryCatchSum(0);
			}
		}
	}
	
}
public class TryCatch3 {
	public static void main(String[]args) {
	 resolveSumProblem obj = new resolveSumProblem();
		obj.tryCatchSum(0);
	}

}
