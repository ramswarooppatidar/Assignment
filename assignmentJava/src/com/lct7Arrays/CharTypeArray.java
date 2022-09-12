package com.lct7Arrays;
import java.util.Scanner;
public class CharTypeArray {
	public void convertCase(char a[]){
		
		System.out.print("element of array are..");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\nconert arry element are...");
		for(int i=0;i<a.length;i++) {
			if(a[i]>='A'&& a[i]<='Z') {
				System.out.print((char)(a[i]+32)+" ");
			}
			else if(a[i]>='a'&& a[i]<='z') {
				System.out.print((char)(a[i]-32)+" ");
			}
			else {
				System.out.println("not alphabate");
			}
		}
		
	}
	
	public static void main(String[] args) {
		//char a[]= {'a','B','5','8','w','f','G','H'};
		Scanner sc=new Scanner(System.in);
		System.out.print("enetr size of char arry ");
		int size=sc.nextInt();
		//char b[]=new char[size];
		char b[]=sc.next().toCharArray();
		System.out.println("Elements = ");
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		//ananomously created object
		new CharTypeArray().convertCase(b);
		
	}

}
