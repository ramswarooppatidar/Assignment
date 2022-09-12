package javatreaningproject;
import java.util.Scanner;
public class evenodd {
	public static void main(String[] arg) {
		// chack whether no. is positive or negative
		int num;
		Scanner Sc= new Scanner(System.in);
		System.out.println("please enter the number");
		num = Sc.nextInt();
		if(num % 2==0) {
			System.out.println(num+"is even number");
		}
		else {
				System.out.println(num+" is odd number");
			}
		}
	}


