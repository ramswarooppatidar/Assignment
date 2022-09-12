package com.lct7Arrays;
import java.util.Scanner;
class Banglo{
	int banArea;
	private String banPlace;
	private String ownerName;
	private OutHouse o;
	Banglo(){}
	Banglo(int a, String s,String name,OutHouse oobj){
		banArea=a;
		banPlace=s;
		ownerName=name;
		o = oobj;
	}
	 public String toString() {
		 return "\nbanglo area is "+banArea+" squarefeet "+"\nbanglo owner name is "+ownerName+"\nbanglo is at in "+banPlace+" !"+o;
	 }
	 public void setBanArea(int a) {
		 banArea=a;
	 }
	 public void setBanPlace(String a) {
		 banPlace=a;
	 }
	 public void setOwnerName(String str) {
		 ownerName=str;
	 }
	 public void setO(OutHouse o) {
		 this.o=o;
	 }
	 
}
class OutHouse{
	private int outHno;
	private String colour;
	
	
	OutHouse(){}
	OutHouse(int no,String s1){
		outHno=no;
		colour=s1;
		
	}
	 public void setOutHno(int b) {
		 outHno=b;
	 }
	 public void setColour(String c) {
		 colour=c;
	 }
	
	public String toString() {
		return  "\noutHouse key number "+outHno +"\ncolour of outhouse : "+colour+",";
	}
}

public class Contnment {
	public static void main(String[] args) {
		  OutHouse o = new OutHouse(456,"black");
		//Banglo bobj= new Banglo(1234,"bhopal","Mr. katariya ",o);
		/*
		System.out.println(bobj);
		//System.out.println(o);
		*/
		Banglo bobj= new Banglo();
		o.setOutHno(23);
		o.setColour("pink");
		
		bobj.setBanArea(1234);
		bobj.setOwnerName("katariya");
		bobj.setBanPlace("pune");
		bobj.setO(o);
		System.out.println(bobj);
		
	}
	
}
		
	
