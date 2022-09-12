package com.array_list_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
class WordOccuranceInList12{
	public void occurance(List l) {
		String s = l.toString();
		System.out.println(s);
		
		
		String ch[] = s.split(" ");  
		System.out.println("......"+Arrays.toString(ch));
		int fr[] = new int[ch.length];
		for(int i=0;i<ch.length;i++) {
			fr[i]=1;
		}
		System.out.println(Arrays.toString(fr));

		for( int i=1;i<ch.length-2;i++) {
			int cnt=1;
			for(int j=i+1;j<ch.length-1;j++) {
				if(ch[i].equals(ch[j])) {
					cnt++;
					fr[j]=0;    //ch[j] also be deleted
					//fr[i]=cnt;
					//ch[j]=" ";
					 
				}
			}
			if(fr[i]!=0) {
				fr[i]=cnt;
			}
			
			
				}
		System.out.println(Arrays.toString(fr));
		for(int i=0;i<fr.length;i++) {
			if(fr[i]!=0) {                     
				System.out.println(ch[i]+" occurance "+fr[i]+" times");
			
			}
	    
	
		}
}}

public class OccuranceOfWord2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> str = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr a name");
		  String s = sc.nextLine();
		  str.add(s);
		  WordOccuranceInList12 obj = new WordOccuranceInList12();
		  obj.occurance(str);
	

	}

}
