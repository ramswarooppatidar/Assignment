package com.map;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Xobin_test_21 {
	public void removeDublicate(ArrayList<Integer> al) {
		ArrayList<Integer> arl = new ArrayList<>();
		Iterator<Integer> itr = al.iterator();
		for(int i=0;i<al.size()-1;i++) {
			for(int j=i+1;j<al.size();j++) {
				if(al.get(i).equals(al.get(j))) {
					al.remove(j);
					//arl.add(al.get(i));
				}
				
			
			}
			arl.add(al.get(i));
		}
		System.out.println(arl);
		System.out.println(al);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<Integer> l = new ArrayList<>();
       Scanner sc = new Scanner(System.in);
       System.out.println("enter a number");
       for(int i=0;i<5;i++) {
    	   l.add(sc.nextInt());
       }
       Xobin_test_21 obj = new Xobin_test_21();
       obj.removeDublicate(l);
       
	}

}
