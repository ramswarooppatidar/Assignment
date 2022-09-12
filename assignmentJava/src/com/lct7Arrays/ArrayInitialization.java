package com.lct7Arrays;
import java.util.Scanner;
public class ArrayInitialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc= new Scanner(System.in);
       System.out.println("enter size of arrys");
       int size=sc.nextInt();
       int a[]=new int[size];
       System.out.println("lemgth of arry: "+a.length);
       System.out.println("plz enter element of arrays");
       for(int i=0;i<=a.length-1;i++) {
    	   a[i]=sc.nextInt();
       }
       System.out.println("arreys elements are");
       for(int i=0;i<=a.length-1;i++) {
    	   System.out.print(a[i]+" ");
       }
       
	}

}
