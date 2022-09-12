package javatreaningproject;


import java.util.Scanner;
public class failpass {
	public static void main(String[] args) {
		Scanner Sc= new Scanner(System.in);
		int math;
		int mathOut;
		int phy;
		int phyOut;
		int che;
		float cheOut;
		float total;
		float totalOut;
		float percentage;

		System.out.println("please enter the marks out of in matheatics");
		mathOut = Sc.nextInt();
		
		System.out.println("please enter the marks of mathemetics");
		math = Sc.nextInt();
		
		System.out.println("please enter the marks out of in physcis");
		phyOut = Sc.nextInt();
		System.out.println("please enter marks of physcics");
		phy = Sc.nextInt();
		
		System.out.println("please enter the marks out of in chemistry");
		cheOut = Sc.nextInt();
		System.out.println("please enter marks of chemistry");
		che = Sc.nextInt();
		total = (math+phy+che);
		totalOut=(mathOut+phyOut+cheOut);
		percentage=(total/totalOut)*100;
		System.out.println("your percentage is :"+percentage);
		
		
		if(percentage>=90) {
			System.out.println("your percentage is :"+percentage+" AND your grade is A++ ");
		}
		else if(75 <= percentage && percentage < 90) {
			System.out.println("your percentage is :"+percentage+" AND your grade is A ");
		}
		else if(60 <= percentage && percentage < 75){
	
			System.out.println("your percentage is :"+percentage+" AND your grade is B ");
		}
	    else if(40 <= percentage && percentage < 60) {
			System.out.println("your percentage is :"+percentage+" AND your grade is C ");
		}
	    else {
	    	System.out.println("your percentage is :"+percentage+" AND your FAILED is C ");
	    }
	}
}
	    	
	

			
		
		
		
	
	

