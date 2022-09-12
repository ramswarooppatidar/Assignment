package javatreaningproject;
import java.util.Scanner;
public class grossSalery {
	public static void main(String[] args) {
		int basicSalery, grossSalery,da,hra,emi,grossDeduction,netBalance;
		Scanner Sc= new Scanner(System.in);
		System.out.println("pls enter your basicSalery ");
		basicSalery=Sc.nextInt();
		
		System.out.println("da is 25 % of basic salery ");
		da=basicSalery*25/100;
		System.out.println("total da is: "+da);
		
		hra=basicSalery*35/100;
		System.out.println("total hra is: "+hra);
		grossSalery= basicSalery+da+hra;
		System.out.println("toal grossSalry is:"+grossSalery);
		
		System.out.println("deduction of professsional tax is:"+200);
		

		
		System.out.println("please enter your EMI to pay ");
		emi=Sc.nextInt();
		System.out.println("your EMI is "+emi);
		netBalance=grossSalery-200-emi;
		System.out.println("your netbalance after deduction of emi and professional"
				+ " tax is "+netBalance);
		
		
		
	}

}
