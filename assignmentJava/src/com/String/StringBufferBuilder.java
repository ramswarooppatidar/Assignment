package com.String;

public class StringBufferBuilder {

	public static void main(String[] args) {
		StringBuffer b = new StringBuffer();
		b.append("hi");
		System.out.println(b);
		b.insert(1,"yellow");
	
		StringBuilder bi = new StringBuilder();
		bi.append("hi");
		System.out.println(b.equals(bi));
		System.out.println(b.compareTo(bi));
		
		

	}

}
