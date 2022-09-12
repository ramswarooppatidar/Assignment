package com.map;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Department{
	Integer dId;
	String depName;
	List<Student> studentList;
	public Department() {};
	public Department(Integer a,String s,List<Student> sl) {
		dId = a;
		depName = s;
		this.studentList = sl;
	}
	public 	String toString() {
		return "department Id "+dId+" dep name "+depName+studentList;
	}
}
class Student{
	Integer roll;
	String sName;
	public Student(Integer a, String s) {
		roll=a;
		sName= s;
	}
	
	public String toString() {
		return "name "+sName+" roll "+roll;
				
	}
}
public class DepartmentMapApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1= new Student(101,"ram");
		Student s2= new Student(102,"rahul");
		Student s3= new Student(103,"aman");
		List<Student> stuList = new ArrayList<>();
		stuList.add(s1);
		stuList.add(s2);
		stuList.add(s3);
		Department d1 = new Department(202,"computer",stuList);
		Department d2 = new Department(203,"Electrical",stuList);
		Department d3 = new Department(204,"electronics",stuList);
		//System.out.println(d1);
		Map<Integer,Department> deptMap = new HashMap<Integer,Department>();
		deptMap.put(d1.dId, d1);
        deptMap.put(d2.dId, d2);
        deptMap.put(d3.dId, d3);
        System.out.println(deptMap);
        
        Set<Map.Entry<Integer,Department>> entry = deptMap.entrySet();
        for(Map.Entry<Integer,Department> e : entry) {
        	System.out.println("key dep.id "+e.getKey());
        	Department o = e.getValue();
        	System.out.println("department id "+o.dId+" Departments name "+o.depName);
        	List<Student> sl = o.studentList;
        	for(Student s : sl) {
        		System.out.println("name "+s.sName+" roll no "+s.roll);
        	}
        }


	}

}
