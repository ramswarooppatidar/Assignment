package com.inhertance;
class Account12{
	int aId;
	String aName;
	int ifscCode;
	static float intRate=11.2f;
	public Account12() {};
	public Account12(int a,String s,int b,float f) {
		aId = a;
		aName = s;
		ifscCode = b;
		intRate = f;
	}
	public String toString() {
		return "acount id is "+aId+"\nacoount holder name "+aName+"\nifsc code is "+ifscCode+
				"\nintrest rate is "+intRate;
	}
	public void intrestRate() {
		System.out.println("intrest rate is "+Account12.intRate);
		
	}
	
}
public class StaticFianlaAccount {
	public static void main(String[] args) {
		Account12 a = new Account12(12120,"katariya",56789876,56.56f);
		System.out.println(a);
		
	}

}
