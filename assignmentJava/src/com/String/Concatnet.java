package com.String;
class stringManupulation{
	public void replacString(String a,String b) {
		String empty1 = " ";
		String empty2 = " ";
		for( int i=0; i<a.length();i++) {
			empty1 += a.charAt(i);
		}
		for( int j =0;j<b.length();j++){
		    
		    empty2 += b.charAt(j);
		
	}
	   String s3=empty1+empty2;
	   System.out.println("String add manually\n"+s3);
}}

public class Concatnet {
	public static void main(String[] args) {
		String s1 = "wel";
		String s2 = "come";
		String s3 = s1.concat(s2);
		//s3=s1+s2;
		System.out.println(s3);
		stringManupulation obj = new stringManupulation();
		obj.replacString(s1,s2);		
	}

}
