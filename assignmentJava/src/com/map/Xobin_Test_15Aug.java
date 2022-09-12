package com.map;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
class Frequencey_Count{
	public HashMap Frequency(ArrayList<String> l) {
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
				//System.out.println(map.entrySet() );
				
			}
			
		}
		return map;
		
	}
	public String frequency2(ArrayList<String> s) {
		HashMap<String, Integer> map1 = new HashMap<>();
		Iterator<String> itr1 = s.iterator();
		while(itr1.hasNext()) {
			String str = itr1.next();
			if(map1.containsKey(str)) {
				int val = map1.get(str);
				map1.put(str, val+1);
			}
			else {
				map1.put(str, 1);
			}
		}
		Set<String> s1 = map1.keySet();
		Iterator<String> itr2 = s1.iterator();
		String emp2 ="";
		while(itr2.hasNext()) {
			String str2 = itr2.next();
			emp2 += str2+"\n";
			//System.out.println(str2);
			//System.out.println(map1.get(str2));
			emp2 += map1.get(str2)+"\n";
		}
		return emp2;
	}
	public String StringToHashMap(String s) {
		ArrayList<String> als= new ArrayList<>();
		String []newStr = s.split("");
		//System.out.println(Arrays.toString(newStr));
		for(int i=0;i<newStr.length;i++) {
			
			als.add(i, newStr[i]);
		}
		System.out.println(als);
		HashMap<String , Integer> map3 = new HashMap<>();
		Iterator<String> itr3 = als.iterator();
		while(itr3.hasNext()) {
			String s2 = itr3.next();
			if(map3.containsKey(s2))
			{
			int val = map3.get(s2);
			map3.put(s2, val+1);
			}
			else {
				map3.put(s2, 1);
			}
		}
		Set<String> set = map3.keySet();
		Iterator<String> itr4 = set.iterator();
		String emp = "";
		while(itr4.hasNext()) {
			String key = itr4.next();
			emp += key+"\n"+map3.get(key)+"\n";
			
		}
		return emp;
	}
	public String frequaency3(String s) {
		ArrayList<Character> als= new ArrayList<>();

		for(int i=0;i<s.length();i++) {
			char ch =s.charAt(i);
			als.add(ch);
			
		}
		HashMap<Character, Integer> map3 = new HashMap<>();
		Iterator<Character> itr3 = als.iterator();
		while(itr3.hasNext()) {
			Character s2 = itr3.next();
			if(map3.containsKey(s2))
			{
			int val = map3.get(s2);
			map3.put(s2, val+1);
			}
			else {
				map3.put(s2, 1);
			}
		}
		Set<Character> set = map3.keySet();
		Iterator<Character> itr4 = set.iterator();
		String emp = "";
		while(itr4.hasNext()) {
			Character key = itr4.next();
			emp += key+"\n"+map3.get(key)+"\n";
			
		}
		return emp;

		
	}
	public void frequency4(String s) {
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(map.containsKey(ch)){
				Integer val = map.get(ch);
				map.put(ch, val+1);
				
			}
			else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
	}
	public void frequency5(String s) {
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i=0;i<s.length();i++) {
			Integer val = map.getOrDefault(s.charAt(i), 0);
			map.put(s.charAt(i),val+1);
		}
		System.out.println(map);
	}
	
}

public class Xobin_Test_15Aug {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> al = new ArrayList<>();
		String input_from_question="";
		System.out.println("enetr the string with space");
        input_from_question = br.readLine();
		int i=0;
		/*while(i<4) {
		System.out.println("enetr the string with space");
        input_from_question = br.readLine();
		al.add(input_from_question);
		i++;
		}*/
		Frequencey_Count obj = new Frequencey_Count();
		//obj.frequency2(al);
		System.out.println("_________________________________");
		System.out.println("\nMethod 2_");
		String empty ="";
	
		//empty += obj.Frequency(al);
		//empty += obj.frequency2(al);
		//empty += obj.StringToHashMap(input_from_question);
		obj.frequency5(input_from_question);
		//empty += obj.frequaency3(input_from_question);
		
		input_from_question = empty;
		System.out.println(input_from_question);
		

	}

}
