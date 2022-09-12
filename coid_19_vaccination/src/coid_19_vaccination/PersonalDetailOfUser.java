package coid_19_vaccination;
import java.util.Scanner;
public class PersonalDetailOfUser //extends VaccinationSite
{
	String houseNo;
	String street;
	String lendMarks;
	String state;
	Scanner sc = new Scanner(System.in);
	
	public void PersonalDetailOfUser(String a,String s,String s1) {
		houseNo = a;
	    street = s;
	   lendMarks = s1;
	   
		//selectState(state);
		
	}
	public void addInformation() {
		System.out.println("enter your house number");
		String hoNo = sc.next();
		System.out.println("enter your street/colony name");
		String street = sc.next();
		System.out.println("enter your leandMark area ");
		String lndMark = sc.next();
		//System.out.println("enter your state name");
		PersonalDetailOfUser(hoNo,street,lndMark);
		System.out.println("select state");
		System.out.println("madhypradesh ,maharashtra ,rajasthan, gujrat, uttarpradesh");
		System.out.println("enter a state");
		String state1 = sc.next();
		//sc.next();
		String state = state1.toLowerCase();
		selectDistric(state);
		//showDetail();
		
		
		
	}
	public void showDetail() {
		System.out.println("your house number is "+houseNo);
		System.out.println("your street name is "+street);
		System.out.println("your leandMark area  is "+lendMarks);
		System.out.println("yourstate is is "+ state);
		//selectState(state);
	}
	public void selectDistric(String choice) {
        //String choce =state;
				switch(choice) {
		case "madhypradesh" :
			System.out.println("\nselect the district");
			System.out.println("Shajapur, Dewas, Indore, Bhopal, Gawalior, Ujjain, Balaghat, shioni");
			System.out.println("\nenter a district");
			String dist1 = sc.next();
			String dist = dist1.toLowerCase();
			//selectState(dist);
			Available_covid_center acc = new Available_covid_center();
			acc.nearByCenter(dist);
			break;
		case "maharashtra" :
			System.out.println("Pune, Solapur, Thane, Nagpur, Amravati, Raigad, Ratangiri, Nashik");
			System.out.println("select the district");
			String distric = sc.nextLine();
			selectDistric(distric);
		}
	}
	
		
	

}
