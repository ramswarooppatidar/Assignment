package javatreaningproject;
import java.util.Scanner;
public class maximum2ternory {
	public static void main(String[] args) {
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("pls enter num1");
		num1=sc.nextInt();
		
		System.out.println("pls enter num2");
		num2=sc.nextInt();
		String maximum =num1>num2?"num1 s maximum":"num2 is maximum";
		System.out.println(maximum);
	}
	

}
