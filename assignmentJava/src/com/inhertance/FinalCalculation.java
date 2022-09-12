package com.inhertance;
//class Maths{
final class Maths{	
	final int a=12;
    int b=13;
    int c;
    public void add() {
    	c=a+b;
    	System.out.println("sum of number is "+c);
    }
   /* public static void add() {
    	c=a+b;
    	System.out.println("sum of number is "+c);
    }*/
}
class Experiment extends Maths{
	
	public void add() {
		c=a+b;
		System.out.println("sum of number is "+c);
		
	}
	
}
/*class Experiment extends Maths{
	
	public void add() {
		c=a+b;
		System.out.println("sum of number is "+c);
		
	}
	
}*/

public class FinalCalculation {
	public static void main(String[]args) {
		Maths m = new  Experiment();
		m.add();
		m.b=20;
		//m.a=50;
		m.add();
	}

}
