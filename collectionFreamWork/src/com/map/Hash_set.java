package com.map;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
class Leptop{
	String opSys;
	Integer cost;
	public Leptop(String s,int a) {
		opSys =s;
		cost = a;
	}
	public String toString() {
		return opSys+" "+cost;
	}
	public int hashCode() {
		int a ;
		a = cost*2+(opSys.hashCode()*3)+ (cost*2)%(opSys.hashCode()*3);
		return a;
	}
	public boolean equals(Leptop o) {
		if(this==o) {
			return true;
		}
		if(o==null) {
			return false;
		}
		if(this.getClass()!=o.getClass()) {
			return false;
		}
		if(this.cost==o.cost && this.opSys.equals(o.opSys)) {
			return true;
		}
		else
			return false;
	}
}

public class Hash_set {
	public void wordUse(String s) {
		String str[]=s.split(" ");
	       HashSet<String> set = new HashSet<>();
	       for(int i=0;i<str.length;i++) {
	    	   set.add(str[i]);
	       }
	       Iterator<String> itr1 = set.iterator();
	       while(itr1.hasNext()) {
	    	   System.out.println(itr1.next());
	       }
		
	       
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashSet<Integer> s = new HashSet<>();
       s.add(1);
       s.add(2);
       s.add(3);
       s.add(4);
       Iterator<Integer> itr = s.iterator();
       while(itr.hasNext()) {
    	   System.out.println(itr.next());
       }
       HashSet<Leptop> lep = new HashSet<>();
       Leptop obj = new Leptop("window-7 ",12000);
       Leptop obj3 = new Leptop("window-7 ",12000);
       
       Leptop obj1 = new Leptop("window-8 ",22000);
       Leptop obj2 = new Leptop("window-9 ",32000);
       lep.add(obj2);
       lep.add(obj);
       lep.add(obj1);
       lep.add(obj3);
       Iterator<Leptop> itr1 = lep.iterator();
       while(itr1.hasNext()) {
    	   System.out.println(itr1.next());
       }
       Hash_set www = new  Hash_set();
       www.wordUse("today is rainy day day is rainy ");
	}

}
