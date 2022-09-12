package com.array_list_practice;
import java.util.*;
import java.util.function.Consumer;
import java.util.Collections;
import java.util.Comparator;

class Employe implements Comparable<Employe>{
	
	String name;
	int id;
	int age;
	public Employe() {};
	public Employe(String s, int b,int c) {
		name = s;
		id = b;
		age = c;
		
	}
	/*public int compareTo(Employe e) {
		if(this.age<e.age) {
			return 1;
		}
		else if(this.age>e.age) {
			return -1;
		}
		else
			if(this.id>e.id) {
				return 1;
			}
			else if(this.id<e.id) {
				return -1;
			}
			return 0;
	}*/
	
/*	public int compareTo(Employe e) {
		if(this.age<e.age) {
			return 1;
		}
		else if(this.age>e.age) {
			return -1;
		}
		else
		     if( this.name.compareTo(e.name)>0)
			      return 1;
			 else if(this.name.compareTo(e.name)<0) {
		          return -1;}
			 else
				 return 0;
	}*/
	
	public int compareTo(Employe e) {
		if(this.age<e.age) {
			return 1;
		}
		else if(this.age>e.age) {
			return -1;
		}
		else
		     if( this.name.compareTo(e.name)>0)
			      return 1;
			 else if(this.name.compareTo(e.name)<0) {
		          return -1;}
			 else
				  if(this.id>e.id) {
					 return 1;
				  }
				  else if(this.id<e.id) {
					  return -1;
				  }
				  else
					  return 0;
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int a) {
		age = a;
	}
	public void setName(String s) {
		name = s;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return name +" "+id+" "+age;
	}
	public void showLmbda() {
		ArrayList<Employe>l;
		l= new ArrayList<Employe>();
		l.add(new Employe("ram",1200,34));
		l.add(new Employe("ram",1300,44));
		l.add(new Employe("shrishti",17834,44));
		l.add(new Employe("prachi",15634,24));
		l.add(new Employe("pardeep",1002,324));
		l.add(new Employe("omkar",1000,64));
		
	
		Collections.sort(l);
		System.out.println("sorting.....");
		
		System.out.println(l);
		
		Object consumer;
		System.out.println("using lambda");
		Consumer<Employe> c2 = (list)->System.out.println(list); 
		l.forEach(c2);
		}
	
	public void showDetail() {
		ArrayList<Employe>l;
		l= new ArrayList<Employe>();
		l.add(new Employe("ram",1244,34));
		l.add(new Employe("ram1",2234,44));
		l.add(new Employe("ram2",17834,14));
		l.add(new Employe("ram3",15634,24));
		
		System.out.println(l);
		
		for(Employe e : l) {
			System.out.println(l);
		}
		Iterator l1 = l.iterator();
		Iterator<Employe> l2 = l.iterator();
		while(l1.hasNext()) {
		
		
			Employe s = l2.next();
		    if(s.name.equals("ram"))
			System.out.println(s);
			}
		
		
		
		
	}
	
	public void show() {
		ArrayList<Employe>l;
		l= new ArrayList<Employe>();
		
		l.add(new Employe("ram",1244,34));
		l.add(new Employe("ram1",2234,44));
		l.add(new Employe("ram2",17834,14));
		l.add(new Employe("ram3",15634,24));
		Employe obj = new Employe();
		
		
		Iterator l1 = l.iterator();
		Iterator<Employe> l2 = l.iterator();
		while(l2.hasNext()) {
		
			//Employe s = l1.next();       error
		      Employe s = l2.next();
		    //if(s.age>20)
			if(s.name.equals("ram"))
			System.out.println(s);
			
			}
		
		
 		
	}
	public void mainimumAge() {
		ArrayList<Employe>l;
		l= new ArrayList<Employe>();
		
		l.add(new Employe("ram",1244,34));
		l.add(new Employe("rahul1",200,44));
		l.add(new Employe("ram2",17834,14));
		l.add(new Employe("ram3",15634,24));
		
		int min = 100;
		for(int i=0;i<l.size();i++) {
            Employe e1 = l.get(i);
			if(e1.age<min) {
				min = e1.age;
			}
		
			}
		System.out.println(min);
		for(int i=0;i<l.size();i++) {
			 Employe r = l.get(i);
				
			Employe obj = new Employe();
			obj.setAge(r.age);
		  int ep = obj.getAge();
			 
			if(ep==min) {
				System.out.println(l.get(i));
			}
		}
		String str = "ram";
		System.out.println("get exect by name");
		for(int i=0;i<l.size();i++) {
			Employe r1 = l.get(i);
			Employe obj = new Employe();
			obj.setName(r1.name);
			String mtch = obj.getName();
			if(str.equals(mtch)) {
			
				System.out.println(l.get(i));
			}
			
		}
		
		}
	public void changedAge() {
		ArrayList<Employe>l;
		l= new ArrayList<Employe>();
		
		l.add(new Employe("ram",1244,34));
		l.add(new Employe("rahul1",200,44));
		l.add(new Employe("ram2",17834,14));
		l.add(new Employe("ram3",15634,24));
		String str = "ram";
		int cAge = 34;
		for(int i=0;i<l.size();i++) {
			Employe r1 = l.get(i);
			Employe obj = new Employe();
			
			String mtch1 = r1.getName();
			if(str.equals(mtch1)) {
				System.out.println("before change "+l.get(i));
				  
				r1.setAge(50);
				System.out.println("after change the age  : "+l.get(i));
			}
		}
	}
	public void changedName(String chng,String rep) {
		ArrayList<Employe>l;
		l= new ArrayList<Employe>();
		
		l.add(new Employe("ram",1244,34));
		l.add(new Employe("rahul1",200,44));
		l.add(new Employe("ram2",17834,14));
		l.add(new Employe("ram3",15634,24));
		Iterator<Employe> itr = l.iterator();
		for(int i=0;i<l.size();i++) {
			Employe emp = l.get(i);
			String str = emp.getName();
			 
				if(chng.equals(str)){
					System.out.println("\nbefore change "+l.get(i));
					emp.setName(rep);
					System.out.println("after change the name  : "+l.get(i));
				}
			}
		
	}
		
		
	public void changedAge2() {
		ArrayList<Employe>l;
		l= new ArrayList<Employe>();
		
		l.add(new Employe("ram",1244,34));
		l.add(new Employe("rahul1",200,44));
		l.add(new Employe("ram2",17834,14));
		l.add(new Employe("ram3",15634,24));

		
	
}
	public boolean equals(Employe emp) {
		if(this==null) {
			return false;
		}
		if(emp==null||this.getClass() != emp.getClass()) {
			return false;
		}
		Employe obj = (Employe)emp;
		return    this.name.equals(obj.name) &&
				           this.age==obj.age &&
				                this.age == obj.age;
	}
public void occurance() {
	ArrayList<Employe>l;
	l= new ArrayList<Employe>();
	
	l.add(new Employe("ram",1244,34));
	l.add(new Employe("shyam",200,44));
	l.add(new Employe("shrishti",17834,14));
	l.add(new Employe("shrishti",17834,14));
	
	l.add(new Employe("ram",1244,34));
	l.add(new Employe("ram",1244,34));
	l.add(new Employe("ram",1244,34));
	
	l.add(new Employe("jatin",15634,24));
	for(int i=0;i<l.size();i++) {
		Employe emp = l.get(i);
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
		System.out.println("the name "+l.get(i)+" occures "+cnt+"times");
		cnt=1;
	}

}
public void Occurance2() {
	ArrayList<Employe>l;
	l= new ArrayList<Employe>();
	
	l.add(new Employe("ram",1244,34));
	l.add(new Employe("shyam",200,44));
	l.add(new Employe("shrishti",17834,14));
	l.add(new Employe("shrishti",17834,14));
	
	l.add(new Employe("ram",1244,34));
	l.add(new Employe("ram",1244,34));
	l.add(new Employe("ram",1244,34));
	
	l.add(new Employe("jatin",15634,24));
	for(int i=0;i<l.size();i++) {
		if(l.get(i)==null) {
			continue;
		}
		System.out.println(l.get(i)+"occurance "+Collections.frequency(l,l.get(i)));
		for(int j=i+1;j<l.size();j++) {
			if(l.get(i) != null && l.get(i).equals(l.get(j)));
		}
	
}
}
}

class AgeSort implements Comparator<Employe>{
	public int compare(Employe a,Employe b) {
		return a.age-b.age;
	}
}
class NameSort implements Comparator<Employe>{
	public int compare(Employe a,Employe b) {
		return a.name.compareTo(b.name);
	}
}
class SortById implements Comparator<Employe>{
	public int compare(Employe a,Employe b) {
		return a.id-b.id;
	}
}



	
public class CustumerDetail {
	public static void main(String args[]) {
		List<Employe> l= new ArrayList<>(); 
		l.add(new Employe("RAM",1200,34));
		l.add(new Employe("SHAYAM",1214,44));
		l.add(new Employe("RAGAHV",1250,14));
		l.add(new Employe("JATIN",1201,24));
		Employe obj = new Employe();
		//obj.showDetail();
		//obj.show();
		//obj.mainimumAge();
		//obj.equalsMethod(obj);
		//obj.changedAge();
		//obj.showLmbda();
		//obj.changedName("RAM", "shrishti");
		//obj.occurance();
		//obj.Occurance2();
		
		
		System.out.println("\nsorting by age......");    
		//Collections.sort(l,new AgeSort());
		System.out.println(l);
		System.out.println("\nsort by age>>>>>>>>");
		Iterator<Employe> itr1 = l.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		
		System.out.println("\nsorting by ID......");    
		Collections.sort(l,new SortById());
		System.out.println(l);
		System.out.println("\nsort by ID>>>>>>>>");
		Iterator<Employe> itr2 = l.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		
		
		System.out.println("\nsorting by NAME......");    
		Collections.sort(l,new NameSort());
		System.out.println(l);

		System.out.println("\nsort by NAME>>>>>>>>");
		Iterator<Employe> itr3 = l.iterator();
		while(itr3.hasNext()) {
			System.out.println(itr3.next());
		}
				
		
	/*	System.out.println("\nreverse order AGE...");    
		Collections.sort(l, Collections.reverseOrder(new AgeSort()));
		System.out.println(l);
		

		System.out.println("\nreverse order NAME...");    
		Collections.sort(l, Collections.reverseOrder(new NameSort()));
		System.out.println(l);
		

		System.out.println("\nreverse order ID...");    
		Collections.sort(l, Collections.reverseOrder(new SortById())); 
		System.out.println(l);*/
		


		
		
	}
}
			
		
		
	
	
	
	
