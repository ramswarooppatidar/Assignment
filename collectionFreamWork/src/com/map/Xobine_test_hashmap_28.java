package com.map;
import java.io.BufferedReader;
import java.lang.String;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.io.InputStreamReader;





public class Xobine_test_hashmap_28 {
	public String count(String s) {
		String str[]=s.split(" ");
		String emp ="";
		HashMap<String ,Integer> map = new HashMap<>();
		for(int i=0;i<str.length;i++) {
			Integer val = map.getOrDefault(str[i], 0);
			map.put(str[i], 1+val);
		}
		Set<Map.Entry<String,Integer>> ant1 =  map.entrySet();
		Iterator<Map.Entry<String,Integer>> itr1 = ant1.iterator();
		while(itr1.hasNext()) {
			Map.Entry<String,Integer> rr = itr1.next();
			emp += rr.getKey()+"\n"+rr.getValue()+"\n";
		}
		return emp;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter a string input");
        String input_from_question = br.readLine();
               //write your code here
        HashMap<String ,Integer> map = new HashMap<>();
        String str[] = input_from_question.split(" ");
      /*  input_from_question ="";
        for(int i=0;i<str.length;i++) {
        	if(map.containsKey(str[i])) {
        		Integer val= map.get(str[i]);
        		map.put(str[i], val+1);
        	}
        	else
        		map.put(str[i], 1);
        }
        Set<String> ent = map.keySet();
        Iterator<String> itr = ent.iterator();
        while(itr.hasNext()) {
        	String key = itr.next();
        	input_from_question += key+"\n"+map.get(key)+"\n";
        	//System.out.println(key);
        	//System.out.println(map.get(key));
        }*/
        Xobine_test_hashmap_28 obj = new Xobine_test_hashmap_28();
        String s=obj.count(input_from_question);
        input_from_question ="";
        input_from_question=s;
      
        
        //print the output
        System.out.println(input_from_question);
	}

}
