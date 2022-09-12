package com.String;
import java.util.Scanner;

import java.util.Arrays;
import java.lang.String;

class FrequencyCount{
	public void frequency(String str) {
		String splitArray[] = str.split(" ");  //""    mistackkkkkkkkkkkkkkkkkkkkkkkkk**********
		System.out.println(splitArray.length);
		for(int i= 0;i<splitArray.length-1;i++) {
			for(int j= i+1;j<splitArray.length;j++) {
				if(splitArray[i].equals(splitArray[j])) {
					System.out.print(splitArray[i]+" ");
				}
			}
		}
	}
	public void charecterCountInWord(String str) {
		String str1[] = str.split(" ");
		
		//1direct method
		for(int i=0;i<str1.length;i++) {
			
			System.out.println(str1[i]+" => "+str1[i].length());
		}
		
		//2 method
	/*	int cnt=0;
		int i=0;
		for ( i=0;i<str1.length;i++) {
			for (int j=0;j<str1[i].length();j++) {
				  cnt++;
			}
			System.out.println("in ' "+str1[i]+"' " +"word , number of charecter is "+cnt);
			cnt=0;
		}*/
	}
	//3 rd method
	public void charecterCountInWord2(String str) {
		/*int cnt=0;
		int i=0;
		char ch[]=str.toCharArray();
		for (  i=0;i<str.length();i++) {
			//String s[]=new String[100];
			ch[i] = str.charAt(i);
		}
		System.out.println(ch);
		for ( i=0;i<str.length();i++) {
			String s="";
			System.out.println(Arrays.toString(ch));
			for(int j=0;j<str.length();j++) {
				
				if(ch[j] != ' ') {
					cnt++;
					//s[i] += ch[j];
					s+=ch[j];
				}
			}
			System.out.println();
			System.out.println(s+"count of charetor is "+cnt);
			cnt=0;
		}*/
		char []ch = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			String s = "";
			int cnt=0;
			while(i<ch.length && ch[i]!=' ') {
				s += ch[i];
				cnt++;
				i++;
			}
			System.out.println(s+" => "+cnt);
		}
	}
}

public class WordOccurance {
	public static void main(String[] args) {
		//String s1="java is best language , java is good";
		FrequencyCount ff = new FrequencyCount();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("plese enter a string"); 
		String s1=sc.nextLine();
		
		StringReverce s = new StringReverce();
		
		//ff.frequency(s1);
		ff.charecterCountInWord(s1);
		ff.charecterCountInWord2(s1);
		
		// TODO Auto-generated method stub
		
	}
	
			
		
		

	
}
	

