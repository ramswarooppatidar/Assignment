package com.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
class Occurance{
	public void findOcurance(ArrayList<Integer> l) {
		System.out.println(l+"\n");
		HashMap<Integer,Integer> map = new HashMap<>();
		Iterator<Integer> itr = l.iterator();
		while(itr.hasNext()) {
			Integer num = itr.next();
			if(map.containsKey(num)) {
				Integer val =map.get(num);
				map.put(num, val+1);
			}
			else
				map.put(num, 1);
		}
		System.out.println(map);
		System.out.println("\n________________");
		Set<Map.Entry<Integer, Integer>> ent = map.entrySet();
		Iterator<Map.Entry<Integer, Integer>> itr1 = ent.iterator();
		while(itr1.hasNext()) {
			Map.Entry<Integer, Integer> rr = itr1.next();

			System.out.println(rr.getKey()+" Occuarce "+rr.getValue()+" times");

			//System.out.println(rr.getValue());	
			}
	}
}

public class Map_Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l = new ArrayList<>();
		l.add(5);
		l.add(7);
		l.add(6);
		l.add(7);
		l.add(2);
		l.add(2);
		Occurance obj = new Occurance();
		obj.findOcurance(l);
		
		

	}

}
