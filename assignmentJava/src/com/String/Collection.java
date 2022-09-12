package com.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class ArrayListExample{
	public void reverce(ArrayList<String > s ) {
		 for(int i=s.size()-1;i>=0;i--) {
			System.out.println(s.get(i));
		}
	}
	public void add() {
		 ArrayList <String> s= new ArrayList<>();
		  
		 s.add("have");
		 s.add("a nice");
		 s.add("day");
		 s.add(1,"gsfre");
		 System.out.println(s);
	}
	public void even() {
		 ArrayList <Integer> obj = new ArrayList<>();
		 for(int i=1;i<=20;i++) {
			 if(i%2==0) {
				 
				 obj.add(i);
			 }
			 
		 }
		 System.out.println(obj);
    //user input growable
		 for(int i=0;i<5;i++) {
			 Scanner sc = new Scanner(System.in);
			 System.out.println("enetr a elements");
			     int num = sc.nextInt();
			     if(num%2==0) {
			    	 
			    	 obj.add(num) ;
			     }
			     
			    	 
		 }
		 System.out.println(obj);
		 for(int i=100;i<106;i++) {
			 obj.add(i);
		 }
		 System.out.println(obj);
		 
	}
}
		  
		  
		

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ArrayList <String> s= new ArrayList<>();
   s.add("morning");
   s.add("good");
   s.add("have a nice day");
   ArrayListExample al = new ArrayListExample();
  // al.reverce(s);
   al.add();
   //ArrayList <Integer> obj = new ArrayList<>();
  // al.even();
   
   
   
	}

}
