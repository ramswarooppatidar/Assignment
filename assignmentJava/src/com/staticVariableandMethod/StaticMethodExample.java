package com.staticVariableandMethod;
class StaticMethod{
	static int a=3;
	public static void sum(int a,int b) {
		int c= a+b;
		System.out.println("in parent class "+c);
	}
	public static void sum(int a,int b,int c) {
		int d=a+b+c;
		System.out.println(d);
	}
}
class override extends StaticMethod{
	public static void sum(int a,int b) {
		int c= a+b;
		System.out.println("in overide class "+c);
	}
	public static void sum(int a,int b,int c) {
		int d=a+b+c;
		System.out.println(d);
	}
}
public class StaticMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      StaticMethod.sum(15, 7);
      StaticMethod obj = new override();
      obj.sum(12, 13);
      
	}

}
