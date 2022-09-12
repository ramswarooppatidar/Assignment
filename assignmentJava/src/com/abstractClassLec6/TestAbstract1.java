package com.abstractClassLec6;
abstract class shap{
	int a;
	int b;
	int c;
	int d;
	abstract void draw();
	void uses() {
		System.out.println("only pencil");
	}
	shap(){}
	shap(int a,int b){
		System.out.println("i am in abstract class constractor set a & b=");
		this.a = a;
		this.b = b;
		System.out.println("sum is "+(a+b));
	}
}
class circl extends shap{
	circl(int c,int d,int m){
		super(c,d);
		this.c=m;
		System.out.println("i am circle class constructor set c="+c);
	}
	public void draw() {
		System.out.println("i am draw a circle");
		System.out.println("circle in side reactangle"+a+"*"+b);
	}
}
class semiCircle extends circl{
	semiCircle(int p,int q,int r,int s){
		super(p,q,r);
		this.d=s;
		System.out.println("i am semicircle class constructor set d"+d);
	}
}
class rectangl extends shap{
	public void draw() {
		System.out.println("i  raw rectangle");
	}
	rectangl(int p, int q){
		super(p,q);
	}
}

public class TestAbstract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	shap obj = new circl(5,4,3);
		//obj.draw();
		//obj.uses();
		//shap obj1 = new rectangl(7,5);
		shap o = new semiCircle(2,3,5,7);
		

	}

}
