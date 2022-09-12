package com.lct7Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class MargeToArray 
{
	public void addArrays(int arr[],int arr1[])
	{
		int c[]=new int[arr.length +arr1.length];
		for(int i=0;i<arr.length;i++) {
			c[i]= arr[i];
		}
		for(int i=0;i<arr1.length;i++) {
			c[arr.length+i]= arr1[i];
		}
		System.out.println("marge two arrya arrys1 and array2\n");

		System.out.println(Arrays.toString(c));
		accendingOrder(c);
	}
	public void accendingOrder(int arr[]) 
	{
	  for(int i=0;i<arr.length;i++) 
	  {
		  for(int j=0;j<arr.length-i-1;j++)
		  {
			  if(arr[j+1]<arr[j])
			  {
				  int temp = arr[j+1];
				  arr[j+1]=arr[j];
				  arr[j]=temp;
			  }
		  }
	  }
	  System.out.println("marge array in accesndin order ");

	  System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("plz enter size of arry1 ");
		int size=sc.nextInt();
		int a[] = new int[size];
		System.out.println("plz enter elements of array1 ");
		for(int i=0;i<a.length;i++) {
			a[i]= sc.nextInt();
		}
		System.out.println("plz enter size of arry2 ");
		int size2=sc.nextInt();
		int b[] = new int[size2];
		System.out.println("plz enter elements of array2 ");

		for(int i=0;i<b.length;i++) {
			b[i]= sc.nextInt();
		}
		MargeToArray obj = new MargeToArray();
		obj.addArrays(a,b);
	}
				  

}
