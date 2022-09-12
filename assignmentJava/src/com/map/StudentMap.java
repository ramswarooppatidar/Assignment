package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class Students{
	Integer roll;
    String name;
    
	float weight;
	public Students() {};
	public Students(int r,String s,Float f) {
		roll = r;
		name=s;
		weight = f;
	}
	public int hashCode() {
		int value=0;
		value=roll+(2*name.hashCode())+3;
		return value;
	}
	public boolean equals(Students o) {
		if(this==o) {
			return true;
		}
		if(o==null) {
			return true;
		}
		if(this.getClass()!= o.getClass()) {
			return false;
		}
		Students stu = (Students)o;
		if(this.roll==o.roll&&this.weight==o.weight&&this.name.equals(o.name))
		  return true;
		
		else
		   return false;
			
	}
	public String toString() {
		return "roll number"+roll+"name"+name+" weight"+weight;
	}
	public void usingKeySet() {
		 HashMap <Integer , Float> m = new HashMap<>();
		   
		    m.put(23,45.7f);
	        m.put(24,55.6f);
	        m.put(25,65.6f);
	        m.put(26,34.6f);
	        m.put(27,90.78f);
	        m.put(28,100.5f);
	        

	        Set<Integer> s = m.keySet();
	        Iterator<Integer> itr = s.iterator();
	        while(itr.hasNext()) {
	        	Integer key = itr.next();
	        	m.put(key, m.get(key)+5);
	        	/*if(key==23) {
	        		m.put(23, m.get(key)+5);
	        	}*/
	        	System.out.println("key : "+key);
	        	System.out.println("value of key "+m.get(key));
	        }
	}
	/*public boolean equals(Students stu) {
		 if(this==stu) {
			 return true;
		 }
		 if(stu==null||this.getClass()!=stu.getClass()) {
			 return false;
		 }
		 Students s = (Students)stu;
          return this.roll==stu.roll&&
        		          this.weight==stu.weight;
	}*/
	public void occurance( ) {
		HashMap<Integer , Float> m =new HashMap<>();
		
		m.put(100, 54.5f);
		m.put(101, 55.5f);
		m.put(100, 54.5f);
		m.put(101, 55.5f);
		m.put(102, 66.5f);
		m.put(103, 79.5f);
		int cnt=1;
		Set<Integer> s= m.keySet();
		Iterator<Integer> itr=s.iterator();
		Iterator<Integer> itr1= s.iterator();
		while(itr.hasNext()) {
			Integer key = itr.next();
			while(itr1.hasNext()) {
				if(key==itr1.next()) {
					cnt++;
				}
			}
		}
	/*	for(int i=0;i<m.size();i++) {
			System.out.println("enter into for loop"+);
			if(m.get(i)==null) {
				continue;
			}
			 cnt=1;
			for(int j=i+1;j<m.size();j++) {
				System.out.println("enter into j loop");
				
				if(m.get(i).equals(m.get(j))) {
					cnt++;
					m.put(j, null);
				}
			}
			System.out.println("occurance "+m.get(i)+" is "+cnt+"times");
		}
		cnt=1;*/
	}

	}

public class StudentMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			HashMap<Integer , Float> m =new HashMap<>();
			Students s =new Students();
			//s.usingKeySet();
			m.put(100, 54.5f);
			m.put(101, 55.5f);
			m.put(100, 54.5f);
			m.put(101, 55.5f);
			m.put(102, 66.5f);
			m.put(103, 79.5f);
			s.occurance();
			//System.out.println("key value "+m.put(100, 45.56f));
			//System.out.println(m);
			//Float f = m.remove(100);
			
		//	System.out.println(f);
			//boolean b = m.conatinKey(101);
			
			HashMap<Students,String> map = new HashMap<>();
			Students s1 = new Students(100,"shyam",34.5f);
			Students s2 = new Students(100,"shyam",34.5f);
			Students s3 = new Students(101,"ram",35.5f);
			map.put(s1, "rahul");
			map.put(s2, "jatin");
			map.put(s1, "pradip");
			System.out.println(map);
	}

}
