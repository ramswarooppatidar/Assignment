package com.String;
import java.util.Arrays;
import java.util.Scanner;
class CountChar{
	public void frequencey(String str) {
		
			
			String ch[] = str.split(" ");  //two program 1 ="",2=" "   *********
		System.out.println(Arrays.toString(ch));
		int fr[] = new int[ch.length];
		for(int i=0;i<ch.length;i++) {
			fr[i]=1;
		}
		for( int i=0;i<ch.length-1;i++) {
			int cnt=1;
			for(int j=i+1;j<ch.length;j++) {
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
        //find first non repeted charechtor
		/*for( i=0;i<fr.length;i++) {
			if(fr[i]==1) {
				System.out.println(ch[i]+" occurance "+fr[i]+" times");
				break;
			}*/
			
	  //repeted element print
			/*for( i=0;i<fr.length;i++) {
			if(fr[i]!=0 && fr[i]!=1) {
				System.out.println(ch[i]+" occurance "+fr[i]+" times");
				break;
			}*/
	
		}
	}
	public void consonant(String s) {
		String s1 = s.toUpperCase();
		String ch[] = s1.split("");
		int vov=0;
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=="A" || ch[i]=="E"|| ch[i]=="I"|| ch[i]=="O"|| ch[i]=="U") {
				vov++;
			}
		}
			System.out.println("occurance of vowel is "+vov);
			System.out.println("occurance of consonant is "+ (ch.length-vov));
			
			
		}
	public void anagram(String s,String s1) {
		String ch[] = s.split("");
		String ch1[] = s1.split("");
		int cnt=0;
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<ch1.length;j++) {
				if(ch[i].equals(ch1[j])) {
					cnt++;
				}
				else
					cnt--;
				
			}
			
		}
		if(cnt==0) {
			System.out.println("is an anagram");
		}
		else
			System.out.println("not an angram");
		
	}
	public void anagram2(String s,String s1) {
		char a[]= s.toCharArray();
		char b[]= s1.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		boolean result = Arrays.equals(a,b);
		 
		if(result== true) {
			System.out.println("String are anagram");
		}
		else
			System.out.println("not anagram");
	}
	
	}


public class CharOccurance11 {

	public static void main(String[] args) {
		CountChar c = new CountChar();
		String s="india is best country india is best all is best";
		c.frequencey(s);
		//c.consonant(s);
		Scanner sc = new Scanner(System.in);
		int k=0;
		
		/*while(k<3) {
			
			System.out.println("pls enetr the String");
			String s0 = sc.next();
			System.out.println("pls enetr the String 2");
			String s1 = sc.next();
			c.anagram(s0,s1);
			
		}*/



	}

}
