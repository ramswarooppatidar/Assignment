package com.assigment;
import java.util.Scanner;
public class ShowDayInMonthh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("please enter a month number");
		Scanner sc= new Scanner(System.in);
		num=sc.nextInt();
		switch(num)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31 days");
		break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30 days");
		break;
		case 2:
			System.out.println("either 28 or 29 days");
		break;
		default:
			System.out.println("invalid number");
		}

	}

}
