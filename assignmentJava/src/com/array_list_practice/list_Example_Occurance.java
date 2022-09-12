package com.array_list_practice;

import java.util.ArrayList;
import java.util.List;

class Students {
	Integer roll;
	String name;
	public Students() {};
	
	
	public Students(Integer a , String b){
		roll= a;
		name = b;
	}
	public String toString() {
		return "name is "+name+" roll number is "+roll;
	}
/*	public int compareTo(Student s1) {
		if(this.roll<s1.roll)
			return 1;
		else if(this.roll>s1.roll) {
			return -1;
		}
		else 
			return 0;
	}*/
	public void setName(String s) {
		name=s;
	}
	public void setRoll(Integer a) {
		roll=a;
	}
	public String getName() {
		return name;
	}
	public Integer getRoll() {
		return roll;
	}
	
	
	public boolean equals(Students obj) {
		if(this==obj) {
			return true;
		}
		if(obj==null || this.getClass() != obj.getClass()) {
			return false;
			
		}
		Students s = (Students)obj;
		return this.name.equals(s.name)&& this.roll==s.roll;
	}
	public void occurance() {
		List<Students> l = new ArrayList<>();
		l.add(new Students(100,"ram"));
		l.add(new Students(101,"ram1"));
		l.add(new Students(102,"rahukl"));
		l.add(new Students(100,"ram"));
		l.add(new Students(101,"ram1"));
		l.add(new Students(102,"rahukl"));
		l.add(new Students(100,"ram"));
		System.out.println("get class methos"+ l.getClass());
		
		for(int i=0;i<l.size();i++) {
			int cnt=1;
			if(l.get(i)==null) {
				continue;
			}
			for(int j=i+1;j<l.size();j++) {
				if(l.get(i).equals(l.get(j))) {
					cnt++;
					l.set(j, null);
				}
			}
			System.out.println("occurance of word "+l.get(i)+" is :"+ cnt+ " times");
			cnt=1;
		}
		System.out.println(l);
	}
}

public class list_Example_Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Students> l = new ArrayList<>();
		l.add(new Students(101,"ram1"));
		l.add(new Students(100,"ram"));
		l.add(new Students(102,"rahukl"));
		System.out.println(l);
		System.out.println("get value of"+l.get(2));
		Students st = new Students();
		st.occurance();
		

	}

}
