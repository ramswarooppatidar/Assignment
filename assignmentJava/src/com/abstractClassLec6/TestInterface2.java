package com.abstractClassLec6;
interface A{
	void a();
	void b();
	void c();
	void d();
	
}
abstract class B implements A{
	public void abstarctclass() {
		System.out.println("no need to override abstract method of interface");
	}
	public void b() {
		System.out.println("i am  b");
	}
}
class M extends B{
	public void a() {
		System.out.println("i am  a");
	}
	public void c() {
		System.out.println("i am  c");
	}
	public void d() {
		System.out.println("i am  d");
	}
}
public class TestInterface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     A obj = new M();
     obj.a();
     obj.b();
     obj.c();
     obj.d();
	}

}
