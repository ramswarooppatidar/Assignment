package com.map;

import java.util.HashMap;

class Custom{
	String name;
	Integer num;
	public Custom(int a,String s) {
		num = a;
		name = s;
	}
	public String toString() {
		return name+" "+num;
	}
/*	public int hashCode() {
		
		return (name.hashCode()*2)+num;
		
	}*/
	/*public boolean equals(Custom o) {
		if(this==o) {
			return true;
		}
		if(o==null) {
			return true;
		}
		if(this.getClass()!=o.getClass()) {
			return false;
		}
		Custom c = (Custom)o;
		if(this.num==c.num && this.name.equals(c.name)) {
			return true;
		}
		else
			return false;
	}*/
}

public class HashCode_equals_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashMap<Integer,String> map = new HashMap<>();
       String str ="aa";
       String str1 = "AA";
       String str2 ="aa";
       System.out.println(str.hashCode());
       System.out.println(str1.hashCode());
       System.out.println(str2.hashCode());



       map.put(100, str1);
       map.put(101, str);
       map.put(100, str1);
       System.out.println(map);
       Custom cs = new Custom(111,"geeta");
       Custom cs4 = new Custom(111,"geeta");
       
       Custom cs1 = new Custom(122,"seeta");
       Custom cs2 = new Custom(111,"nena");
       
       
       HashMap<Integer,Custom> map1 = new HashMap<>();
       map1.put(991, cs);
       map1.put(882, cs1);
       map1.put(991, cs2);
       map1.put(991, cs4);
       System.out.println("HashMap<Integer,Custom> map1 "+map1);

       System.out.println(cs.hashCode());
       System.out.println(cs4.hashCode());     //jvm genrate different different hash code
       
       HashMap<Custom,Integer> map2 = new HashMap<>();
       map2.put(cs2, 3333);
       map2.put(cs1, 4444);
       map2.put(cs, 5555);
       map2.put(cs2, 3333);
       System.out.println("HashMap<Custom> map2 "+map2);
       HashMap<Integer,String> mp2 = new HashMap<>();
       mp2.put(1, "one");
       mp2.put(2, "two");
       mp2.put(3, "three");
       mp2.put(4, "four");
       mp2.put(11, "five");
       mp2.put(21, "sux");
       mp2.put(31, "seven");
       mp2.put(41, "eight");
       mp2.put(51, "nine");
       mp2.put(61, "ten");
       mp2.put(71, "eleven");
       
       mp2.put(81, "TWEL");
       mp2.put(91, "DFGS");
       mp2.put(111, "LASTT");
       mp2.put(01, "AAA");
       mp2.put(001, "BB");
       mp2.put(011, "CCC");
      



	}

}
