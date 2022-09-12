package com.array_list_practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class car{
	Integer id,price;
	String name,brand ,colour;
	public car() {}
	public car(Integer i,Integer p,String n,String b,String c) {
		id =i;
		price=p;
		name = n;
		brand = b;
		colour = c;
	}
	public String toString() {
		return id+" "+name+" "+brand+" "+price+" "+colour;
	}
	public void createMap(ArrayList<car> l) {
		HashMap<String ,Integer> map = new HashMap<>();
		HashMap<String ,String> map1 = new HashMap<>();
		Iterator<car> itr = l.iterator();
		while(itr.hasNext()) {
			car rr = itr.next();
			Integer val = map.getOrDefault(rr.brand, 0);
			map.put(rr.brand, val+1);
			map1.put(rr.name, rr.brand);
		}
		Set<Map.Entry<String,String>> ent1 = map1.entrySet();
		Iterator<Map.Entry<String,String>> itr2 = ent1.iterator();
		while(itr2.hasNext()) {
			Map.Entry<String,String> rr2 = itr2.next();
			System.out.println(rr2.getKey()+" = "+rr2.getValue());
		}
		System.out.println("\nBrand "+" totalNoOfCar");
		System.out.println("_________________________________________");
		
		Set<Map.Entry<String,Integer>> ent = map.entrySet();
		Iterator<Map.Entry<String,Integer>> itr1 = ent.iterator();
		while(itr1.hasNext()) {
			Map.Entry<String,Integer> rr1 = itr1.next();
			System.out.println(rr1.getKey()+" = "+rr1.getValue());
		}
	}
	
}
class sortByName1 implements Comparator<car>{
	public int compare(car c1,car c2) {
		return c1.name.compareTo(c2.name);
	}
}
class SortbyNmprice implements Comparator<car>{
	public int compare(car c1,car c2) {
		int nameCom = c1.name.compareTo(c2.name);
		int priCom = c1.price-c2.price;
		//int priCom = c2.price-c1.price;
		
		
		//sort price if equal than name
		
	/*	if(nameCom==0) {
			if(priCom==0) {
				return priCom;
			}
			else
				return nameCom;
		}
		else
			return priCom; */
		
		//first name than price
		if(priCom==0) {
			if(nameCom==0) {
				return priCom;
			}
			else
				return priCom;
		}
		else
			return nameCom;  

	}
}

public class Practice_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        car c = new car(1,45000,"swift","suzuki","white");
        car c1 = new car(1,35000,"bolero","mahendra","white");
        car c2 = new car(1,55000,"kio","suzuki","white");
        car c3 = new car(1,75000,"swift-dzr","suzuki","black");
        car c4 = new car(1,45000,"nexon","TATA","white");
        car c5 = new car(1,55000,"altroz","TATA","black");
        car c6 = new car(1,65000,"sadon","TATA","greay");
        
        car c7 = new car(1,135000,"alto","suzuki","white");
        car c8 = new car(1,54000,"kio","suzuki","white");
        
        ArrayList<car> l = new ArrayList<>();
        l.add(c6);
        l.add(c1);
        l.add(c2);
        l.add(c);
        l.add(c3);
        l.add(c4);
        l.add(c5);
        l.add(c8);
        l.add(c7);
        System.out.println(l);
       Collections.sort(l,new sortByName1());
	    Iterator <car> itr1 = l.iterator();
	    System.out.println("\nsort by name....");
	    while(itr1.hasNext()) {
	    	System.out.println(itr1.next());
	    }
	    
	    
	    Collections.sort(l,new SortbyNmprice());
	    Iterator <car> itr2 = l.iterator();
	    System.out.println("\nsort by name or price....");
	    while(itr2.hasNext()) {
	    	System.out.println(itr2.next());
	    }


       /* for(car s : l) {
        	System.out.println(s);
        }*/
       // car obj = new car();
       // obj.createMap(l);
	}

}
