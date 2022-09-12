package com.assigment;
import java.util.Scanner;
public class Display1to7 {
	public static void main(String[] args) {
		int num;
	
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter a number between 1 to 7");
		num=sc.nextInt();
		switch(num) {
		case 1:System.out.println("you enter"+1);
		break;
		case 2:System.out.println("you enter"+2);
		break;
		case 3:System.out.println("you enter"+3);
		break;
		case 4:System.out.println("you enter"+4);
		break;
		case 5:System.out.println("you enter"+5);
		break;
		case 6:System.out.println("you enter"+6);
		break;
		case 7:System.out.println("you enter"+7);
		break;
		default:System.out.println("error,you wan't print");
	
		}
	}
}

