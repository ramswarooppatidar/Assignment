package com.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;


class Employee implements Comparable<Employee>{
	Integer empId;
	String eName;
	Integer salary;
	public Employee() {}
	public Employee(int a,String s,int sal) {
		empId=a;
		eName=s;
		salary = sal;
	}
	public String toString() {
		return "id"+empId+"name"+eName+" Salary"+salary;
	}
	public int compareTo(Employee o) {
		if(this.eName.compareTo(o.eName)>0) {
			return 1;
		}
		else if(this.eName.compareTo(o.eName)<0) {
			return -1;
		}
		else 
			return 0;
	}
}

public class Employe_assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> l = new ArrayList<>();
		Employee emp = new Employee(100,"aman",120000);
		Employee emp1 = new Employee(200,"nilesh",220000);
		Employee emp2 = new Employee(100,"aman",120000);
		Employee emp3 = new Employee(300,"sandeep",20000);
		l.add(emp);
		l.add(emp1);
		l.add(emp2);
		l.add(emp3);
		HashMap<Integer,Integer> map = new HashMap<>();
		
		Set<Map.Entry<Integer, Integer>> ent = map.entrySet();
		Iterator<Map.Entry<Integer, Integer>> itr = ent.iterator();
		Iterator<Map.Entry<Integer, Integer>> itr1 = ent.iterator();
		Iterator<Employee> itr3=l.iterator();

		while(itr3.hasNext()) {
			Employee e = (Employee) itr3.next();
			Integer val = e.empId;
			//System.out.println(e.eName);
			//System.out.println(map.get(val));
			
			if(map.containsKey(val)) {
				Integer a = map.get(val);
				map.put(val, a+e.salary);
			}
			else {
				map.put(val, e.salary);
			}
		}
		System.out.println(map);
		Set<Map.Entry<Integer,Integer>> oj= map.entrySet();
		Iterator<Map.Entry<Integer,Integer>> itrr = oj.iterator();
		while(itrr.hasNext()) {
			Map.Entry<Integer,Integer> sis = itrr.next();
			System.out.println("key is "+sis.getKey());
			System.out.println("value "+sis.getValue());
		}
      System.out.println("\n\nset______________________________");
       HashSet<String> sett = new HashSet<>();
       sett.add(emp3.eName);
       sett.add(emp1.eName);
       sett.add(emp2.eName);
       Iterator<String> it2 = sett.iterator();
       while(it2.hasNext()) {
    	   System.out.println(it2.next());
       }
		

	}

}
