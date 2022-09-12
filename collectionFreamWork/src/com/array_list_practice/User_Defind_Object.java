package com.array_list_practice;
import java.util.ArrayList;
import java.util.*;

class User{
	   String name;
	   int age;
	   public User(String s,int b) {
		   name =s;
		   age = b;
		   
	   }
	   public String getName() {
		   return name;
	   }
	   public int getAge() {
		   return age;
	   }
	   public void setName(String s) {
		   name=s;
	   }
	   public void setAge(int b) {
		   age = b;
	   }

}
class Person{
	private String name;
	private Integer age;
	public Person(String s,int a) {
		name = s;
		age = a;
	}
	public String getNmae() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int a) {
		age = a;
	}
	public String toString() {
		return "name "+name +'/' + ", age"+age+"}";
	}
}


public class User_Defind_Object {

	public void main(String[] arg) {
		// TODO Auto-generated method stub
	/*	List<User> userss = new ArrayList<>();
		userss.add(new User("rajeev",25));
		userss.add(new User("rajesh",16));
		userss.add(new User("raghav",35));
		
		userss.forEach(user->{
			System.out.println("name: "+ user.getName()+", age :"+ user.getAge());
		});*/
		
		List<Person> people = new ArrayList<>();
		people.add(new Person("ram",47));
		people.add(new Person("shyam",34));
		people.add(new Person("jatin",67));
		people.add(new Person("david",55));
		people.add(new Person("jenny",32));
		System.out.println("person list "+people);
		
		//sorting people by their age
		people.sort((p1,p2)->{
			return p1.getAge()-p2.getAge();
		});
		
		//A,more concise way of writing the above sorting fi




		
		
		
	}

}
