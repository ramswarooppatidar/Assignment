package com.map;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;


public class Xobin_even_odd {
	public ArrayList even_ArrayList(ArrayList<Integer> l) {
		for(int i=0;i<l.size();i++) {
			if(l.get(i)%2==0) {
				l.remove(i);
			}
		}
		return l;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Integer> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++) {
        	System.out.println("enter a number");
        	al.add(sc.nextInt());
        }
        Xobin_even_odd obj = new Xobin_even_odd();
        ArrayList aal =obj.even_ArrayList(al);
        System.out.println(aal);
	}

}
