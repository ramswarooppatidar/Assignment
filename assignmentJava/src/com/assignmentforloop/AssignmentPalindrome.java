package com.assignmentforloop;
class NumberPallindrome{
	public void pallindrome(int num) {
		int sum=0;
		int a=num;
		while(num>0) {
			int rem = num%10;
			sum = sum*10 + rem;
			num = num/10;
		}
		//System.out.print(sum);
		if(a==sum) {
			System.out.println("yes");
		}
		else
			System.out.println("n0");
	}
	
	
}

public class AssignmentPalindrome {
	public static void main(String[] args)
	{
		int a=1;
		int b = a/10;
		//System.out.print("value of 1/10 is"+b);
		NumberPallindrome obj = new  NumberPallindrome();
		obj.pallindrome(1234321);
		int num=121,sum=0;
		int rev=0,i;
		for(i=num;i>0;i=i/10);
		{
			rev=(i%10);
			sum=(sum*10)+rev;
		}
		if(num==sum)
		{
			System.out.println("no is palindrome");
		}
		else {
			System.out.println("no is not palindrome");
			
		}
	}

}
