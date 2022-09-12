//Electricity bill
package com.assigment;
import java.util.Scanner;
public class Electricitybill {
	public static void main(String[] args) {
		
		int unit;
		double sucharge,totalpay;
		double pay;
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter your electicity units");
		unit=sc.nextInt();
		if(unit<=50) {
			pay=unit*0.50;
			System.out.println("your total electicity bill is"+pay);
		}
		else if(unit>50 && unit<=150) {
			pay=unit*0.50;
			System.out.println("your total electicity bill is"+pay);
		}
		else if(unit>150 && unit<=250) {
			pay=unit*0.50;
			System.out.println("your total electicity bill is "+pay);
 		}
		else {
			pay=unit*1.50;
			sucharge=pay*0.20;
			totalpay=sucharge+pay;
			System.out.println("your electricity bill with extra 20% charge"+totalpay);
			sc.close();
		}
	}
}

