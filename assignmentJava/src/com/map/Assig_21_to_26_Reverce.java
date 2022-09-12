package com.map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Departmnt{
	int dId;
	String name;
	List<Studnt> st;
	public Departmnt(int a,String s,List<Studnt> sl) {
		dId=a;
		name = s;
		st = sl;
	}
	public String toString() {
		return dId+" "+name+" "+st;
	}
	public int hashCode() {
		int val;
		val = dId*2+( name.hashCode()*3);
		return val;
	}
	public boolean equals(Object o) {
		if(this==o) {
			return true;
		}
		if(o==null) {
			return false;
		}
		if(this.getClass()!=o.getClass()) {
			return false;
		}
		Departmnt od = (Departmnt)o;
		if(this.dId==od.dId && this.name.equals(od.name) && this.st.equals(od.st)) {
			return true;
		}
		else
			return false;
	}
}
class Studnt{
	Integer roll;
	String sName;
	public Studnt(int a,String s) {
		roll = a;
		sName = s;
	}
	public String toString() {
		return roll+" "+sName;
	}
	public int hashCode() {
		int val ;
		val = (roll*3)+ sName.hashCode()*2*roll ;
		return val;
		}
	public boolean equals(Object o) {
		if(this==o) {
			return true;
		}
		if(o==null) {
			return false;
		}
		if(this.getClass()!= o.getClass()) {
			return false;
		}
		
		Studnt os = (Studnt )o;
		if(this.roll==os.roll && this.sName.equals(os.sName)) {
			return true;
		}
		else
			return false;
	}
}

public class Assig_21_to_26_Reverce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Studnt> l = new ArrayList<>();
		Studnt stu = new Studnt(51,"rahul");
		Studnt stu2 = new Studnt(53,"param");
		Studnt stu1 = new Studnt(52,"jatin");
		l.add(stu);
		l.add(stu2);
		l.add(stu1);
		
		
		 
		ArrayList<Studnt> l1 = new ArrayList<>();
		Studnt st = new Studnt(61,"ram");
		Studnt st2 = new Studnt(63,"krishn");
		Studnt st1 = new Studnt(62,"sanjiv");
		l1.add(st1);
		l1.add(st);
		l1.add(st2);
		
		 
		
		ArrayList<Studnt> l2 = new ArrayList<>();
		Studnt ss = new Studnt(71,"sneha");
		Studnt ss1 = new Studnt(73,"lalli");
		Studnt ss2 = new Studnt(72,"aditi");
		l2.add(ss1);
		l2.add(ss2);
		l2.add(ss);
		
		 
		ArrayList<Studnt> l3 = new ArrayList<>();
		Studnt s3 = new Studnt(71,"sneha");
		Studnt s31 = new Studnt(73,"lalli");
		Studnt s32 = new Studnt(72,"aditi");
		l3.add(s31);
		l3.add(s32);
		l3.add(s3);
		
		 
		
		Departmnt d = new Departmnt(100,"Physics",l);
		Departmnt d1 = new Departmnt(200,"chemistry",l1);
		Departmnt d2 = new Departmnt(300,"mathematics",l);
		
		HashMap<Departmnt,List<Studnt>> map = new HashMap<>();
		map.put(d2, l);
		map.put(d1,l1);
		map.put(d, l);
		System.out.println(map);
		
		Set<Map.Entry<Departmnt,List<Studnt>>> ent = map.entrySet();
		Iterator<Map.Entry<Departmnt,List<Studnt>>> itr = ent.iterator();
		while(itr.hasNext()) {
			Map.Entry<Departmnt,List<Studnt>> dp = itr.next();
			System.out.println("key is "+dp.getKey());
			System.out.println("value is "+dp.getValue());
		}

        // 22 add same dep in map 
		System.out.println("\n22_________________");
		Departmnt d4 = new Departmnt(100,"Physics",l);
		map.put(d4, l1);
		Set<Map.Entry<Departmnt,List<Studnt>>> ent1 = map.entrySet();
		Iterator<Map.Entry<Departmnt,List<Studnt>>> itr1 = ent1.iterator();
		while(itr1.hasNext()) {
			Map.Entry<Departmnt,List<Studnt>> dp1 = itr1.next();
			System.out.println("key is "+dp1.getKey());
			System.out.println("value is "+dp1.getValue());
		}
		
		//23 overide hash code methods in depart class
		System.out.println("\n23_________________");
		
		Departmnt d5 = new Departmnt(100,"Physics",l);
		map.put(d5, l2);
		Set<Map.Entry<Departmnt,List<Studnt>>> ent12 = map.entrySet();
		Iterator<Map.Entry<Departmnt,List<Studnt>>> itr12 = ent12.iterator();
		while(itr12.hasNext()) {
			Map.Entry<Departmnt,List<Studnt>> dp12 = itr12.next();
			System.out.println("key is "+dp12.getKey());
			System.out.println("value is "+dp12.getValue());
		}
		//24 over ride equal method and comment hash code method
		System.out.println("\n24_________________");
		
		Departmnt d6 = new Departmnt(300,"mathematics",l);
		map.put(d6, l2);
		Set<Map.Entry<Departmnt,List<Studnt>>> ent2 = map.entrySet();
		Iterator<Map.Entry<Departmnt,List<Studnt>>> itr2 = ent2.iterator();
		while(itr2.hasNext()) {
			Map.Entry<Departmnt,List<Studnt>> dp2 = itr2.next();
			System.out.println("key is "+dp2.getKey());
			System.out.println("value is "+dp2.getValue());
		}
		
       //25 override both equal and hashcode method
		System.out.println("\n25_________________");
		
		Departmnt d7 = new Departmnt(300,"mathematics",l);
		map.put(d7, l3);
		map.put(d2, l);
		Set<Map.Entry<Departmnt,List<Studnt>>> ent21 = map.entrySet();
		Iterator<Map.Entry<Departmnt,List<Studnt>>> itr21 = ent21.iterator();
		while(itr21.hasNext()) {
			Map.Entry<Departmnt,List<Studnt>> dp21 = itr21.next();
			System.out.println("key is "+dp21.getKey());
			System.out.println("value is "+dp21.getValue());
		}
		


	}

}
