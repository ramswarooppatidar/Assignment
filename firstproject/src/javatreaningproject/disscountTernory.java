package javatreaningproject;
import java.util.Scanner;
public class disscountTernory {
	public static void main(String[] args) {
		int amount;
		Scanner sc=new Scanner(System.in);
		System.out.println("pls enter amount");
		
		amount=sc.nextInt();
		

	
		String msg =amount>=5000?amount*0.05+" you have got 5% disscount"
				:amount+" you not get any disscount";
		System.out.println(msg);
	}
	

}


