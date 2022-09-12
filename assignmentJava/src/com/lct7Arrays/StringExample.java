package com.lct7Arrays;
import java.util.Scanner;
public class StringExample {
	public void reverceString(String a) {
		char ch[]=a.toCharArray();
		for(int i=0;i<ch.length/2;i++) {
			char temp=ch[i];
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]=temp;
			
		}
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		
	}
	public int numberOfChar(String s) {
		char ch[]=s.toCharArray();
		int cnt=0;
		for(int i=0;i<ch.length;i++) {
			cnt++;
		}
		return cnt;
	}
	/*public int numberOfTypeOccurance(String s) {
		char ch[]=s.toCharArray();
		int cnt=0;
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<ch.length-1-i;j++) {
				if(ch[i]==ch[j+1]);
				  cnt++;
			}
			System.out.println("chjarector"+ch[i]+"occourse"+cnt+"time");
		}
	}*/
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a strings ");
		String name=sc.nextLine();
		StringExample obj=new StringExample();
		obj.numberOfChar(name);
		System.out.println(obj.numberOfChar(name));
		obj.reverceString(name);
		
		//obj.numberOfTypeOccurance(name);
		//System.out.println(obj.numberOfTypeOccurance(name));
		
	}

}
