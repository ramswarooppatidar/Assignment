package com.map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Xobine_test_21 {
	public void avoidDublication(String s) {
		LinkedHashMap<String , Integer> map = new LinkedHashMap<>();
		
		String []str=s.split(" ");
		for(int i=0;i<str.length;i++) {
			String st = str[i];
			if(map.containsKey(st)) {
				Integer val = map.get(st);
				map.put(st, val+1);
			}
			else {
				map.put(st, 1);
			}
		}
		Set<Map.Entry<String,Integer>> ent = map.entrySet();
		Iterator<Map.Entry<String,Integer>> itr = ent.iterator();
		while(itr.hasNext()) {
			Map.Entry<String,Integer> rr = itr.next();
			if(rr.getValue()>1) {
				
				System.out.print(rr.getKey()+" ");
			}
			
		}
	}
	public void avoidDublicate2(String s) {
		String str[]= s.split(" ");
		System.out.println("\nmethod 2______________________");
		for(int i=0;i<str.length;i++) {
			for(int j=i+1;j<str.length;j++) {
				if(str[i].equals(str[j])) {
					System.out.print(str[i]+" ");
					str[j]="";
				}
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("plse eneter a string");
		
		String str = sc.nextLine();
		Xobine_test_21 obj = new Xobine_test_21();
		obj.avoidDublication(str);
		obj.avoidDublicate2(str);
		
		
     
	}

}
