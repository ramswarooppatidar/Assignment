package com.lct7Arrays;
import java.util.Arrays;
import java.util.Scanner;
class supplier1{
	int supid;
	String supName, MobileNo;
	items1 itemsupplier[];

public String toString() {
	return "supplier id id "+supid+"\nsupplier name is "+supName+"\nmobile number"
			+MobileNo+"\nsuplier items are"+Arrays.toString(itemsupplier);
}
public supplier1() {}
public supplier1(int supid,String supName,String MoNo,items1 []item) {
	this.supid=supid;
	this.itemsupplier=item;
	this.MobileNo=MoNo;
	this.supName=supName;
}
}
class items1{
	int id;
	String name;
	
	public String toString() {
		return id+ name;
	}

	
	public items1() {}
	public items1(int id,String name) {
		this.id=id;
		this.name=name;
	}
}
public class SupplierArrayWithContainment {
	public static void main(String[] args) {
		items1 item[];
		Scanner sc=new Scanner(System.in);
		
	/*	 HOW WE TAKE INPUT TO ITEMS TYPE ARRYS
		  
		System.out.println("pls enter size of items ");
		
		int size=sc.nextInt();
		items1 itm1[]=new items1[size];
		for(int i=0;i<itm1.length;i++) {
			System.out.println("enter is id name of item ");
			int id=sc.nextInt();
			System.out.println("enter name os item ");
			String name=sc.nextLine();
			sc.nextLine();
		}
		supplier1 s1=new supplier1(12,"ramkatariya","9753273847",itm1);
		System.out.println("supplier record are,..");
		System.out.println(s1);
	
		//supplier1 s=new supplier1();*/
		items1 item1[]=new items1[2];
		item1[0]=new items1(1," soap");
		item1[1]=new items1(2," FaceWash");
		supplier1 s1=new supplier1(12,"ramkatariya","9753273847",item1);
		System.out.println("supplier record are,..");
		System.out.println(s1);
		
		items1 item2[]=new items1[4];
		item2[0]=new items1(3," vegitable");
		item2[1]=new items1(4," groceary");
		item2[2]=new items1(5," book");
		item2[3]=new items1(6," mobile");
		supplier1 s2=new supplier1(13,"ramswaroop patidar","7000081568",item2);
		
		System.out.println("\n___________________");
		System.out.println(s2);
		
		
		//ONLY SHOW EXECT DATA ,ID<2,3,,6,...,COST<,><
		supplier1 s[];
		s=new supplier1[2];
		s[1]=new supplier1(101,"abcd","97654",item1);
		s[0]=new supplier1(230,"nvmm","700008",item2);
		
		for(supplier1 sup:s) {
			if(sup.supid>112)
				System.out.println("\n"+sup);
		}
		
		//FOR NESTED FOR EACH LOOP
		System.out.println("\n____________________________________");
		for(supplier1 sup:s)
		{
			for(items1 i:sup.itemsupplier) {
				if(i.name.equals(" book")) {
					System.out.println("supplier name is "+sup.supName);
					System.out.println(Arrays.toString(sup.itemsupplier));
				}
			}
		}
		System.out.println("\n____________________________________");
		for(supplier1 sup:s)
		{
			for(items1 i:sup.itemsupplier) {
				if(i.id==2) {
					System.out.println("supplier name is "+sup.supName);
					System.out.println(Arrays.toString(sup.itemsupplier));
				}
			}
		}



	}

}
