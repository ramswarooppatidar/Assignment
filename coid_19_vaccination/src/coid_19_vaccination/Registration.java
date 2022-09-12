package coid_19_vaccination;
import java.util.Scanner;
public class Registration //extends VaccinationSite
{
	String name;
	String DOB;
	float age;
	Scanner sc = new Scanner(System.in);
	
	public void informationDetail(String name,String dob,float f) {
		this.name = name;
		DOB =dob;
		age = f;
		System.out.println("Name "+name);
		}
	public void enterYourAllDetail() {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your name for registration");
		String name = sc.nextLine();
		System.out.println("enetr date of birthday in formate dd/mm/yyyy");
		String dob = sc.nextLine();
		System.out.println("enter your age");
		float age = sc.nextFloat();
	//	informationDetail(name,dob,age);
		ageCheck(age);
		
		
		
	}
	public void showInformation() {
		System.out.println(" Name  "+name);
		System.out.println(" date of birthday :  "+DOB);
		System.out.println(" age   "+age);
		

		
		
	}
	public void genrateOtp() {
		int min = 10000;
		int max = 99999;
		int b = (int)(Math.random()*(max-min+1)+min);  
		System.out.println("your verification code is "+b);
		System.out.println("enter your verification code");
		int verificationCode = sc.nextInt();
		verification(b,verificationCode);
		
	}
	public void verification(int b,int user) {
	
		if(b==user) {
			System.out.println("your mobile number verification is successfully done");
			PersonalDetailOfUser p = new PersonalDetailOfUser();
			p.addInformation();
			
		}
		else
		{   
			System.out.println("invalid verification code");
			System.out.println("try again");
			genrateOtp();
			
		}
		    
	}
	public void ageCheck(float age) {
		if(age>18) {
			System.out.println("your age>18 ,you are applicable for first dose");
			System.out.println("please chack OTP on your number");
			genrateOtp();
		}
	}
	public String toString() {
		return "your name is "+name+"\ndate of birthday is "+DOB+"\nyour age is "+age;
	}

}
