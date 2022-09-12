package javatreaningproject;
import java.util.Scanner;
public class shoppingTernory {
	public static void main(String[] args) {
		int amount;
		Scanner sc=new Scanner(System.in);
		System.out.println("pls enter num1");
		amount=sc.nextInt();
		
		
		String maximum =amount>=10000?amount*0.10+"10 percent disscount":"num2 is maximum";
		System.out.println(maximum);
	}
	

}

