package com.map;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Studentz{
	Integer id;
	String name;
	Integer phy;
	Integer che;
	public Studentz() {}
	public Studentz(int i,String s,int p,int c) {
		id=i;
		name = s;
		phy = p;
		che=c;
		
	}
	public boolean equals(Studentz o) {
		if(this==o) {
			return true;
		}
		if(o==null) {
			return true;
		}
		if(this.getClass()!=o.getClass()) {
			return false;
		}
		Studentz c = (Studentz)o;
		if(this.id==c.id && this.name.equals(c.name) && this.che.equals(o.che)&& this.phy.equals(o.phy)) {
			return true;
		}
		else
			return false;
	}
	public String toString() {
		return id+" "+name+" "+phy+" "+che;
	}

	public void updated(ArrayList<Studentz> a,ArrayList<Studentz> b) {
		HashSet<Studentz> set = new HashSet<>();
		for(Studentz s:a) {
			for(Studentz s1 :b) {
				if(s.id==s1.id && s.name.equals(s1.name)) {
					Studentz obj = new Studentz(s.id,s.name,s.phy,s1.che);
					set.add(obj);
				}
			}
			
		}
		Iterator<Studentz> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	
				
		System.out.println(set);
}
}

public class written_test_q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Studentz> al1 = new ArrayList<>();
		al1.add(new Studentz(1,"steav",75,0));
		al1.add(new Studentz(2,"rio",65,0));
		al1.add(new Studentz(3,"lalli",75,0));
		al1.add(new Studentz(4,"ram",40,0));


		ArrayList<Studentz> al2 = new ArrayList<>();
		al2.add(new Studentz(1,"steav",0,75));
		al2.add(new Studentz(2,"rio",0,75));
		al2.add(new Studentz(3,"lalli",0,82));
		al2.add(new Studentz(4,"ram",0,73));
		
		
		Studentz obj1 = new Studentz();
		obj1.updated(al1, al2);
		
		
		
	}

}
