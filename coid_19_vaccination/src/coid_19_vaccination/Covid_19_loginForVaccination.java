package coid_19_vaccination;
import java.util.Scanner;
class VaccinationSite{
     String adhar;
     String mobileNum;
	//public void VaccinationSite() {};
	public void VaccinationSite1(String s,String m) {
		adhar = s;
		mobileNum = m;
	}
	public void setAdhar(String s) {
		adhar = s;
	}
	public void setMobileNum(String s) {
		mobileNum = s;
	}
	public String getAdhar() {
		return adhar;
	}
	public String getMobileNum() {
		return mobileNum;
	}
	public void adharMobileDetail() {
		System.out.println("your adhar card number is "+adhar);
		System.out.println("your mobile number is "+mobileNum);
	}
	public boolean checkNum(String num) {
		boolean result = num.matches("[1-9][0-9]{9}");
		return result;
		
		
	}
	public boolean checkAdhr(String adhr) {
		boolean result = adhr.matches("[1-9][0-9]{11}");
		return result;
	}
	public void chackAdarNumberForRegistration(String alAdh[],String mob,String adhr) {
		int i=0;
		boolean flag = false;
		for(i=0;i<alAdh.length;i++) {
			if(adhr.equals(alAdh[i])) {
				flag = true;
			}
		}
		if(flag==true) {
			System.out.println("your Adhar number is already registered");
		}
		else {
			System.out.println("you are eligible for vaccin first dose");
			Registration r = new Registration();
			r.enterYourAllDetail();
			
		}
	}
	
}
public class Covid_19_loginForVaccination {
	
	public static void main(String[]args) {
		VaccinationSite obj = new VaccinationSite();
		
		
		Scanner sc = new Scanner(System.in);
		String name[]={"shrishti","jatin","prachi","shyam","ayushi"};
		String alrAvAdhr[] = {"100200300400","100200300401","10020030040","100200300403"};
		String mobileNumber[] = {"1234567890","0987654321","2345678901","3456789012"};
		 Availability_of_VaccineDose vd = new Availability_of_VaccineDose();
         vd.setDose_available(65);
        
         System.out.println("please enter your mobile number name");
         String mobileNum = sc.next();
         if(obj.checkNum(mobileNum)) {
        	 System.out.println("valid");
        	 System.out.println("enter your adhar number");
        	 String adhar = sc.next();
        	 if(obj.checkAdhr(adhar)) {
        		 System.out.println("valid");
        		 //obj1.adharMobileDetail();
        		 obj.setAdhar(adhar);
        		 obj.setMobileNum(mobileNum);
        		 obj.adharMobileDetail();;
        		 obj.chackAdarNumberForRegistration(alrAvAdhr, mobileNum, adhar);
        		 
        		 //Registration r = new Registration();
        		 //r.informationDetail("ram","160394",24f);
        	 }
        	 else
        		 System.out.println("your adhar number is invalid");
         }
         else
        	 System.out.println("your mobile number is invalid");
         
	}
	
}
         
        		 
        		 
	
			
		
		
		
