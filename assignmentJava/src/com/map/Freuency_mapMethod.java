package com.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;



class frequency_arraylist{
	public void frequency(ArrayList<Integer> l) {
		HashMap<Integer,Integer> map = new HashMap<>();
		Iterator<Integer> itr = l.iterator();
		while(itr.hasNext()) {
			Integer a = itr.next();
			if(map.containsKey(a)) {
				int val = map.get(a);
				map.put(a, val+1);
			}
			else {
				map.put(a, 1);
			}
		}
		System.out.println(map);
	}
	
	public void ferquencyWord() {
		ArrayList<String> l = new ArrayList<>();
		l.add("ram");
		l.add("shyam");
		l.add("shrishti");
		l.add("prachi");
		l.add("prachi");
		l.add("shrishti");
		l.add("shrishti");
		HashMap<String,Integer> map = new HashMap<>();
		Iterator<String> itr = l.iterator();
		while(itr.hasNext()) {
			String s = itr.next();
			if(map.containsKey(s)) {
				int val = map.get(s);
				map.put(s, val+1);
			}
			else {
				map.put(s, 1);
			}
		}
		System.out.println(map);
		while(itr.hasNext()) {
			String s = itr.next();
			Integer val = map.getOrDefault(s, 0);
			map.put(s, val+1);
		}
		System.out.println(map);
	}
}
public class Freuency_mapMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l = new ArrayList<>();
		l.add(2);l.add(4);
		l.add(6);l.add(7);l.add(5);l.add(9);
		
		l.add(5);
		l.add(5);
		l.add(7);
		l.add(3);
		l.add(6);
		frequency_arraylist obj = new frequency_arraylist();
		obj.frequency(l);
		obj.ferquencyWord();
		

	}

}
