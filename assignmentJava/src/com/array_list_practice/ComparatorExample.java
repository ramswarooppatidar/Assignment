package com.array_list_practice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;



class Student{
	Integer age,roll;
	String name;
	public Student(String s,int a,int r) {
		name =s;
		roll = r;
		age = a;
	}
	public void setRoll(int a) {
		roll=a;
	}
	public void setName(String s) {
		name=s;
	}
	public void setAge(int a) {
		age=a;
	}
	public Integer getRoll() {
		return roll;
	}
	public Integer getAge() {
		return age;
		
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return name+" "+ age+" "+roll;
	}
}
class SortByRoll implements Comparator<Student>{
	public int compare(Student a,Student b) {
		return a.roll-b.roll;
	}
}
class SortByName implements Comparator<Student>{
	public int compare(Student a,Student b) {
		return a.name.compareTo(b.name);
	}
}
class SortByAge implements Comparator<Student>{
	public int compare(Student a,Student b) {
		return a.age-b.age;
	}
}
class SortByRollandName implements Comparator<Student>{
	public int compare(Student a,Student b) {
		int rollCompare = a.getRoll().compareTo(b.getRoll());
		int nameCompare = a.getName().compareTo(b.getName());
		//compate to not allowed primittive typr int
		//name sorting if name same than roll sorting
		if(rollCompare==0) {
			if(nameCompare==0) {
				return rollCompare;
			}
			else
				return nameCompare;
		}
		else
			return nameCompare;
		
	}
}

public class ComparatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> l = new ArrayList<>();
		l.add(new Student("ram",16,100));
		l.add(new Student("akash",13,100));
		l.add(new Student("nilesh",14,200));
		l.add(new Student("sandeep",12,200));
		l.add(new Student("amit",16,100));
		l.add(new Student("darmen",13,100));
		
		
		System.out.println("Unsorted");
		for (int i = 0; i < l.size(); i++)
			System.out.println(l.get(i));

		Collections.sort(l, new SortByRoll());
		System.out.println("\nsort by rollnumber....");
	    Iterator <Student> itr = l.iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	    
	    Collections.sort(l,new SortByName());
	    Iterator <Student> itr1 = l.iterator();
	    System.out.println("\nsort by name....");
	    while(itr1.hasNext()) {
	    	System.out.println(itr1.next());
	    }
	    
	    Collections.sort(l,new SortByAge());
	   // Iterator<Student>
	    System.out.println("\nsort by age>>>>>>>>");
	    Iterator<Student> itr2 = l.iterator();
	    while(itr2.hasNext()) {
	    	System.out.println(itr2.next());
	    } 
	    
		l.add(new Student("jatin",17,300));
		l.add(new Student("ram",103,300));
	    Collections.sort(l,new SortByRollandName());
	    System.out.println("\nSort by roll and name");
		
	    Iterator<Student> itr3 = l.iterator();
	    while(itr3.hasNext()) {
	    	System.out.println(itr3.next());
	    }

	

	}

}
