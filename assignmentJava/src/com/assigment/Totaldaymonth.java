package com.assigment;
import java.util.Scanner;
public class Totaldaymonth {
	public static void main(String[] args) {
		String month="";
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter month");
		month=sc.nextLine();
		switch(month)
		{
		case "january":System.out.println("total no of day in january is 31");
	 	break;
		case "faburary":System.out.println("total no of day in february is28 or 29 ");
		break;
		case "march":System.out.println("total no of day in march is 31");
		break;
		case "april":System.out.println("total no of day in april is 30");
		break;
		case "may":System.out.println("total no of day in may is 31");
		break;
		case "june":System.out.println("total no of day in june is 30");
		break;
		case "july":System.out.println("total no of day in july is 31");
		break;
		case "august":System.out.println("total no of day in august is 30");
		break;
		case "september":System.out.println("total no of day in septemberis 31");
		break;
		case "octobar":System.out.println("total no of day in october is 30");
		break;
		case "novembar":System.out.println("total no of day in novmber is 30");
		break;
		case "decembar":System.out.println("total no of day in december is 31");
		break;
		default :System.out.println("please enter correct month");
		
		}
	}
}

