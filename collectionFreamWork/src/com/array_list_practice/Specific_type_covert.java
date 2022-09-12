package com.array_list_practice;
import java.util.*;
class list_to_Array{
	public void evensum(Integer a[]) {
		int sum =0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println("even number is "+a[i]);
				sum += a[i];
			}
		}
		System.out.println("\nsum of even number is "+sum);
	}
}
public class Specific_type_covert {
	public static void main(String []args) {
		int a[]= {23,56,62,83,79};
		/*List<Int> l1 = Arrays.asList(a);
		List<Integer> l3 = Arrays.asList(a);
		
		Integer b[]= {23,56,78,90};
		List<Integer> l2 = Arrays.asList(a);*/
		Scanner sc = new Scanner(System.in);
		List<Integer> l = new ArrayList<>();
		for(int i=0;i<5;i++) {
			System.out.println("enter a "+i+" index number");
			int num= sc.nextInt();
			l.add(num);
		}
		Integer arr[] = new Integer[l.size()];
	// arr[0]=23;
		l.toArray(arr);
		System.out.println("list of array length:"+l.size());
		
		System.out.println("list of array:"+Arrays.toString(arr));
		list_to_Array obj = new list_to_Array();
		obj.evensum(arr);
		
	}

}
