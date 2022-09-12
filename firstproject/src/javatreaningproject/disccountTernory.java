package javatreaningproject;

import java.util.Scanner;

public class disccountTernory {
	public static void main(String[] args) {
		int amount;
		Scanner sc=new Scanner(System.in);
		System.out.println("pls enter purchase amount");
		amount=sc.nextInt();
		
		String msg= amount>=10000 ? "discount is 10% = "+amount*0.10 :
			  
			     amount>=5000 && amount<10000 ? "discount is 5% = "+amount*0.05 :
			    	 
			    	 amount>=2000 && amount<5000 ? "disscount is 2%  = "+amount*0.02 : "no discount";
		
	    System.out.println(msg);
	   
	    
		
		
			    	 
	}

}
