package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.String.Collection;

public class Assignment_copy_8 {
	public void copyMap(Map m) {
		HashMap<String,Integer> map1 = new HashMap<>();
		map1.putAll(m);
		Set<String> ent = map1.keySet();
		Iterator<String> itr = ent.iterator();
		System.out.println("itarate using keySet_______");
		while(itr.hasNext()) {
		 String key = itr.next();
		 System.out.println("key is "+key+" value "+map1.get(key));
		}
		Boolean flag = map1.isEmpty();
		System.out.println(" map is empty : "+flag);
		map1.remove("four");
		System.out.println(map1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap<String,Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three",3);
        map.put("four",4);
        map.put("five", 5);
        Assignment_copy_8 obj = new Assignment_copy_8();
        obj.copyMap(map);
	}

}
