package com.array_list_practice;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Practice_Problems{
	public void OccuranceArryList(ArrayList a) {
		int cnt=1;
		//List<Integer> fr = new ArrayList<>();
		int fr[] = new int[a.size()];
		for(int i=0;i<a.size();i++) {
			fr[i]=1;
		}
		System.out.println(Arrays.toString(fr));
	  for(int i=0;i<a.size();i++) {
		  System.out.println(a.get(i));
	  }
	  for(int i=0;i<a.size()-1;i++) {
		  for(int j=i+1;j<a.size();j++) {
			  if(a.get(i).equals(a.get(j))){
				  cnt++;
				  //fr.add(j,0);
				  fr[j]=0;
				  System.out.println(fr[j]);
			  }
		  }
		  if(fr[i]!=0) {
			  fr[i]=cnt;;
			  System.out.println(fr[i]);
			  cnt = 1;
		  }
	  }
	  for(int i=0;i<fr.length;i++) {
		  if(fr[i]!=0) {
			  System.out.println("number "+a.get(i)+" occurse "+fr[i]+" times");
		  }
	  }
	}
}

public class OccuranceOfInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<>();
		
		System.out.println("enetr a size of list ");
		int size = sc.nextInt();
		for(int i=0;i<size;i++) {
			int a = sc.nextInt();
			num.add(a);
		}
		Practice_Problems obj = new Practice_Problems();
				obj. OccuranceArryList(num);
	}

}
