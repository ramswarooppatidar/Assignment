package com.test_Solution;
import java.util.Scanner;
class decode{
	public void decodingMsg(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print((char)a[i]+"_");
		}
		
	}
}
public class EncodedMessage {
	public static void main(String[]args) {
		System.out.println("please select 5 number between "
				+ "\nrangr 65 to 90 and 99 to 122");
		Scanner sc= new Scanner(System.in);
		int a[]=new int[5];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		decode obj = new decode();
		obj.decodingMsg(a);
	}

}
