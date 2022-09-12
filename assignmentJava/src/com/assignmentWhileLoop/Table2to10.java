package com.assignmentWhileLoop;

public class Table2to10 {
	public static void main(String[] args) {
		
		int cnt=1;
		loop1:
		while(cnt<10) {
			cnt++;
			if(cnt==6)
				continue;
			for(int i=1;i<=10;i++) {
				if(i==5) {
					continue loop1;
				}
				System.out.print(cnt*i+" ");
			}
			System.out.println(" ");
		}
 }
}
