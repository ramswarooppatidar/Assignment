package com.array_list_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
class WordOccuranceInList{
	public void occurance(List l) {
		List<Character> nls = new ArrayList<>();
//
		//nls.add('p');
		String s=l.toString();  //****consider bracket 
	    char ch[]= s.toCharArray();             //  '[' part of character ch
	   // String ch[]=s.split(" ");
	    int a[]= new int[s.length()-2];    
	    
		
		for(int i=0;i<a.length;i++) {
		
			a[i]=1;
		}
		for(int i=1;i<ch.length-1;i++) {
			nls.add(ch[i]);
		
		}
		System.out.println(ch[1]);
		System.out.println(Arrays.toString(a));
		System.out.println(nls);
		int i;
		int cnt =1;
		for( i=0;i<nls.size()-1;i++) {
			int j;
			for( j=i+1;j<nls.size();j++) {
			   if(nls.get(i).equals(nls.get(j))) {
				cnt++;
				a[j]=0;
			}
		}
			System.out.println(Arrays.toString(a));

			if(a[i]!=0) {
				a[i]=cnt;
				cnt=1;
			}
		}
		for(i=0;i<nls.size();i++) {
			if(a[i]!=0) {
				System.out.println("Word "+nls.get(i)+" Occurce "+a[i]+" Times");
			}
			else
				nls.remove(i);
		}
	
		System.out.println("new list "+nls);
	}
}
public class OccuranceOfWord {

	public static void main(String[] args) {
		List<String> str = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr a name");
		  String s = sc.nextLine();
		  str.add(s);
		  WordOccuranceInList obj = new WordOccuranceInList();
		  obj.occurance(str);
	}

}
