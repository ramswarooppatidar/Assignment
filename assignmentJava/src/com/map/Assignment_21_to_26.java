package com.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Departmentt{
	Integer id;
	String depName;
	List<Students1> s;
	public Departmentt() {}
	public Departmentt(Integer id , String name,List<Students1> ls) {
		this.id=id;
		depName=name;
		s = ls;
	}
	public String toString() {
		return "dep id "+id+" dep name "+depName+s;
	}
	public int hashCode() {
		return (depName.hashCode()*2)+id*3;
	}
	public boolean equals(Departmentt o) {
		if(this==o) {
			return true;
		}
		if(o==null) {
			return false;
		}
		if(this.getClass()!=o.getClass()) {
			return false;
		}
		if(this.id==o.id&&this.depName.equals(o.depName)) {
			return true;
		}
		else
			return false;
	}
}
class 	Students1{
	Integer roll;
	String name;
	public Students1() {}
	public Students1(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}
	public String toString() {
		return "roll "+roll+" name "+name;
	}
}

public class Assignment_21_to_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Students1 s1 = new Students1(100,"ram");
		Students1 s2 = new Students1(200,"rohan");
		Students1 s3 = new Students1(300,"jatin");
		List<Students1> sl = new ArrayList<>();
		sl.add(s1);
		sl.add(s2);
		sl.add(s3);
		Students1 s11 = new Students1(101,"pragya");
		Students1 s12 = new Students1(202,"anu");
		Students1 s13 = new Students1(303,"sneha");
		List<Students1> sl1 = new ArrayList<>();
		sl1.add(s11);
		sl1.add(s12);
		sl1.add(s13);
		
		Students1 s111 = new Students1(101,"jyosna");
		Students1 s112 = new Students1(202,"nanadani");
		Students1 s113 = new Students1(303,"saloni");
		List<Students1> sl11 = new ArrayList<>();
		sl11.add(s111);
		sl11.add(s112);
		sl11.add(s113);

		
		Departmentt d1 = new Departmentt(10,"electronics",sl);
		Departmentt d2 = new Departmentt(20,"digital",sl1);
		Departmentt d3 = new Departmentt(30,"analog",sl);
		
		HashMap<Integer,Departmentt> map = new HashMap<>();
		map.put(d1.id, d1);
		map.put(d2.id, d2);
		map.put(d3.id, d3);
	
		//System.out.println("mapp is "+map);
		Set<Map.Entry<Integer,Departmentt>> ent = map.entrySet();
		Iterator<Map.Entry<Integer,Departmentt>> itr = ent.iterator();
		while(itr.hasNext()) {
			//System.out.println(itr.next());
			Map.Entry<Integer,Departmentt> d =itr.next();
			//d.getKey();
			Departmentt dep = d.getValue();
			//System.out.println("depart id"+d.getKey()+"\n"+d.getValue());
			System.out.println("depart id"+d.getKey()+"\n"+dep.s);
		}
		
		//22
		System.out.println("\nsolution 22_________________");
		Departmentt d4 = new Departmentt(20,"java",sl);
		map.put(d4.id, d4);
		
		Set<Map.Entry<Integer,Departmentt>> ent1 = map.entrySet();
		Iterator<Map.Entry<Integer,Departmentt>> itr1 = ent1.iterator();
		while(itr1.hasNext()) {
			//System.out.println(itr.next());
			Map.Entry<Integer,Departmentt> d =itr1.next();
			//d.getKey();
			Departmentt dep = d.getValue();
			//System.out.println("depart id"+d.getKey()+"\n"+d.getValue());
			System.out.println("depart id"+d.getKey()+"\n"+dep.s);
		}
		
        //23 Override hash code method from object class in the department
		System.out.println("\nsolution 23_________________");
		
		Departmentt d5 = new Departmentt(30,"python",sl11);
		map.put(d5.id, d5);
		Set<Map.Entry<Integer,Departmentt>> nt1 = map.entrySet();
		Iterator<Map.Entry<Integer,Departmentt>> it1 = nt1.iterator();
		while(it1.hasNext()) {
			//System.out.println(itr.next());
			Map.Entry<Integer,Departmentt> d =it1.next();
			//d.getKey();
			Departmentt dep = d.getValue();
			//System.out.println("depart id"+d.getKey()+"\n"+d.getValue());
			System.out.println("depart id"+d.getKey()+"\n"+dep.s);
		}
		
		//24 Override equal methods in department class and comment hashcode();
		System.out.println("\nsolution 24_________________");
		
		Departmentt d6 = new Departmentt(30,"SQL",sl1);
		map.put(d6.id, d6);
		Set<Map.Entry<Integer,Departmentt>> nt = map.entrySet();
		Iterator<Map.Entry<Integer,Departmentt>> it = nt1.iterator();
		while(it.hasNext()) {
			//System.out.println(itr.next());
			Map.Entry<Integer,Departmentt> d =it.next();
			//d.getKey();
			Departmentt dep = d.getValue();
			//System.out.println("depart id"+d.getKey()+"\n"+d.getValue());
			System.out.println("depart id"+d.getKey()+"\n"+dep.s);
		}
		//25 override both hashcode and equal methods of depart
		System.out.println("\nsolution 24_________________");
		
		Departmentt d7 = new Departmentt(10,"SQL",sl1);
		map.put(d7.id, d7);
		Set<Map.Entry<Integer,Departmentt>> rnt = map.entrySet();
		Iterator<Map.Entry<Integer,Departmentt>> rit = nt1.iterator();
		while(rit.hasNext()) {
			//System.out.println(itr.next());
			Map.Entry<Integer,Departmentt> d =rit.next();
			//d.getKey();
			Departmentt dep = d.getValue();
			//System.out.println("depart id"+d.getKey()+"\n"+d.getValue());
			System.out.println("depart id"+d.getKey()+"\n"+dep.s);
		}
		
		
	}

}
