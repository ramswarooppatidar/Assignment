package javatreaningproject;
import java.util.Scanner;
public class factor {
	public static void main(String[] arg) {
	// chack whether first no is complete factor of second number or not is positive or negative
		int num1;
		int num2;
		Scanner Sc= new Scanner(System.in);
		System.out.println("please enter the first number");
		num1 = Sc.nextInt();
		System.out.println("please enter the second number");
		
		num2 = Sc.nextInt();
		if(num1%num2==0) {
			System.out.println(num2+" is complete factore of num1");
			
		}
		else {
		System.out.println("num2 is not a factor of num1");
		}
	}
}

