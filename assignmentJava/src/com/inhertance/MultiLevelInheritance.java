package com.inhertance;
class Mytologies{
	String name;
	
	public void myt() {
		System.out.println("i am inside mytologies class");
	}
	
}
class Ramayana extends Mytologies{
	String name;
	public void abc() {
		System.out.println("i am inside ramayana class");
	}
}
class Mahabharat extends Mytologies{
	String name;
	public void mhbrt() {
		System.out.println("i am inside mahabharat class");
	}
	
}
class krishna extends Mahabharat{
	String name;
	public void krsh() {
		System.out.println("i am inside krishna class");
	}
}
public class MultiLevelInheritance {
	public static void main(String[] args) {
		
		krishna k = new krishna();
		k.myt();
		k.krsh();
	}
   
}
