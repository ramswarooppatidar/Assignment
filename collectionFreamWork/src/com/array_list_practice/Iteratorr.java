package com.array_list_practice;

import java.util.ArrayList;
import java.util.Iterator;

class iterator{
	public void iteration() {
		ArrayList<String> name = new ArrayList<>();
		//Iterator<String> itr = name.iterator();
		name.add("ajay");
		name.add("jatin");
		name.add("shrishti");
		name.add("vijay");
		name.add("shyam");
		name.addAll(name);
		System.out.println(name);
		for(Iterator<String> itr = name.iterator();itr.hasNext();) {
			String o = itr.next();
			if(o.equals("shrishti")) {
				itr.remove();
			}
		}
		System.out.println(name);
	}
	
}
public class Iteratorr {
	public static void main(String[]args) {
		iterator obj = new iterator();
		obj.iteration();
	}


}
