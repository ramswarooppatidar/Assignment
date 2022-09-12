package com.map;

import java.util.Arrays;
import java.util.Scanner;

class Solution{
	public int find_highest_saving(int salary[],int expenses[]) {
		int highest_saving=0;
		
		for(int i=0;i<salary.length;i++) {
		  int diff=salary[i]-expenses[i];
			if(diff>highest_saving) {
				highest_saving=diff;
			}
		}
		return highest_saving;
	}
}

public class Xobin_test_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salary[]=new int[3];
		int expenses[]=new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a numeric value with spaces");
		String input = sc.nextLine();
	
		String str[]=input.split(" ");
		for(int i=0;i<str.length;i++) {
			
				if(i<3) {
					salary[i]=  Integer.parseInt(str[i]);
				}
				else {
					expenses[i-3]=Integer.parseInt(str[i]);
				}
		}
		//System.out.println(Arrays.toString(salary));
		//System.out.println(Arrays.toString(expenses));
		
		
		Solution obj = new Solution();
		int a =obj.find_highest_saving(salary, expenses);
		System.out.println(a);
	}
	
}
					
					
				
					
			
