package coid_19_vaccination;
import java.util.Scanner;
public class Available_covid_center {
	Scanner sc = new Scanner(System.in);
	//System.out.println("chack");
	public void nearByCenter(String centre) {
		switch(centre) {
		case "indore":
			System.out.println(" available center near you are  ");
			System.out.println(" select a number(1,2,3,4) for time slot ");
			System.out.println("\n1 9:00am -- Kasturba hospital,MG road ");
			System.out.println("\n2 11:00am -- Sarswati shishu Mandir, 3 imlli choraha ");
			System.out.println("\n3 2:00am -- Old city , Rajwada ");
		    System.out.println("\n4 4:00am -- Apollo hospital,MG road ");
            int num = sc.nextInt();
            Availability_of_VaccineDose vd = new Availability_of_VaccineDose();
            vd.bookingSlot(num);
		case "Bhopal":
		case "Dewas" :
		}
	}

}
