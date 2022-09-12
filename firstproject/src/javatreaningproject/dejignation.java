package javatreaningproject;
import java.util.Scanner;
public class dejignation {

public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int basicSalery;
	System.out.println("PLEASE ENTER YOUR BASIC SALERY ");
	basicSalery =sc.nextInt();
	if(basicSalery>=80000) {
		System.out.println("yor post in your bank is vice preidance ");
	}
	else if(basicSalery>=60000 && basicSalery<80000) {
		System.out.println("yor post in your bank is assistant vice presidance ");
	}
	else if(basicSalery>=50000 && basicSalery<60000) {
		System.out.println("yor post in your bank is maneger ");
	}
	else if(basicSalery>=40000 && basicSalery<50000) {
		System.out.println("yor post in your bank is assistance maneger ");
	}
	else if(basicSalery>=30000 && basicSalery<40000) {
		System.out.println("yor post in your bank is OFFICER ");
	}
	else {
		System.out.println("yor post in your bank is CLEARCK ");
		
	}
	}
}