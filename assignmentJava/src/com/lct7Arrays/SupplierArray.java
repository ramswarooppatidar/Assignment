package com.lct7Arrays;
import java.util.Scanner;
class supplier{
	int supid;
	String supName,MobileNo;
	public String toString() {
		return "Supplier Id:"+supid+"\nSupplierName "+supName+"\nMobileNo "+MobileNo;
	}
	public supplier() {}
	public supplier(int supid,String subName,String MobiNo) {
		this.supid=supid;
		supName=subName;
		MobileNo=MobiNo;
	}
	public void showDeatil(supplier s[]) {
		System.out.println("supplier record");
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
			System.out.println("_______________________________");
		}
		
	}
}
public class SupplierArray {
	public static void main(String[] args) {
		supplier s[];
		s=new supplier[2];
		supplier obj=new supplier();
		Scanner sc;
		sc=new Scanner(System.in);
	    for(int i=0;i<s.length;i++) {
			System.out.println("enter suplier record"+(i+1));
			System.out.println("enter name ");
			String subName=sc.nextLine();
			System.out.println("supplier mobile number ");
			String MobileNo = sc.nextLine();
			System.out.println("Enter supplier id ");
			int supid=sc.nextInt();
			s[i] = new supplier(supid,subName,MobileNo);
		}
	    obj.showDeatil(s);
	   
		
		s[0]=new supplier(100,"Ram","87652");
		s[1]=new supplier(200,"rohit","67896");
		
		System.out.println("supplier record");
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
			System.out.println("_______________________________");
		}
	}
	
}
			
			
