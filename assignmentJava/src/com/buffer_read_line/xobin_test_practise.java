package com.buffer_read_line;
import java.io.BufferedReader;
import java.io.IOException;
import java.lang.String;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.io.InputStreamReader;
public class xobin_test_practise {
	public String secondMaximum(String s) {
		//char ch[] = s.toCharArray();
		String ch[]=s.split(" ");
		System.out.println(Arrays.toString(ch));
		int j=0;
		int a[]= new int[ch.length];
		for(int i=0;i<ch.length;i++)
		{
			a[i]=Integer.parseInt(ch[i]);
			System.out.println("array a "+a[i]);
		}
		int max = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
				j=i;
			}
		}
		int maxSecond=0;
		for(int i=0;i<a.length;i++) {
			if(i==j) {
				continue;
			}
			if(a[i]>maxSecond) {
				maxSecond=a[i];
			}
		}
		String input_from_question="";
		input_from_question = (max) +"\n"+maxSecond;
		//System.out.println(input_from_question);
		return input_from_question;
	}
	public String dublication(String str) {
		char ch[]=str.toCharArray();
		String input_from_question ="";
		int cnt=1;
		for(int i=0;i<ch.length-1;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					cnt++;
				}
				if(cnt>1) {
					input_from_question += ch[i]+"\n";
					cnt=1;
				}
			}
		}
		return input_from_question;
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enetr the number string with space");
		String input_from_question = br.readLine();
		xobin_test_practise obj = new xobin_test_practise();
		
		String empty ="";
		//empty += obj.secondMaximum(input_from_question);
		empty += obj.dublication(input_from_question);
		
		
		input_from_question = empty;
		System.out.println(input_from_question);
		
	}
}
		
		
