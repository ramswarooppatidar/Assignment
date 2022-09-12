package com.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;


class Actor implements Comparable<Actor>{
	Integer actId;
	String aName;
	public Actor(int a,String s) {
		actId = a;
		aName = s;
	}
	public String toString() {
		return actId+" "+aName;
	}
	public int compareTo(Actor a) {
		if(this.aName.compareTo(a.aName)>0) {
			return 1;
		}
		if(this.aName.compareTo(a.aName)<0) {
			return -1;
		}
		else
			return 0;
	}

}
class Movie implements Comparable<Movie> {
	String movName;
	String producer;
	Integer budget;
	public Movie(int b,String mn,String pn) {
		movName = mn;
		producer  = pn;
		budget = b;
	}
	public String toString() {
		return movName+" "+producer+" "+budget;
	}
	public int compareTo(Movie e) {
		if(this.movName.compareTo(e.movName)>0) {
			return -1;
		}
		if(this.movName.compareTo(e.movName)<0) {
			return 1;
		}
		else
			return 0;
	}

}
class SortByMovie implements Comparator<Movie>{
	public int compare(Movie o,Movie o1) {
		return o.movName.compareTo(o1.movName);
		//return o.producer.compareTo(o1.producer);
			}

	
	}
class SortByMovieandProducer implements Comparator<Movie>{
	public int compare(Movie o,Movie o1) {
		int prName = o.producer.compareTo(o1.producer);
		int movieName = o.movName.compareTo(o1.movName);
		if(prName==0) {
			if(movieName==0) {
				return prName;
			}
			else {
				return movieName;
			}
		}else {
			return movieName;
		}
	
	}
}

public class Written_test_q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Movie> l = new ArrayList<>();
		Movie m = new Movie(1200,"rrr","ramcharan");
		Movie m5 = new Movie(1200,"rrr","charan");
		Movie m1 = new Movie(3200,"jhon wick","keanu reeves");
		Movie m2 = new Movie(200,"breaking bad","bryan lee");
		Movie m3 = new Movie(5000,"withers"," henry");
		Movie m4 = new Movie(3000,"withers","  cavil");
		
		
		l.add(m);
		l.add(m2);
		l.add(m1);
		l.add(m3);
		TreeMap<String,String> map = new TreeMap<>(Collections.reverseOrder());
		map.put(m3.movName, m3.producer);
		map.put(m1.movName,m1.producer);
		map.put(m.movName,m.producer);
		map.put(m2.movName,m2.producer);
		map.put(m4.movName, m4.producer);
		map.put(m5.movName, m5.producer);
		
		System.out.println(map);
		
		
		LinkedHashMap<String,Movie> lmap = new LinkedHashMap<>();
		Actor a = new Actor(101,"omkar");
		Actor a1 = new Actor(102,"pradeep");
		Actor a2 = new Actor(103,"ram");
		Actor a3 = new Actor(104,"rohit");
		Actor a4 = new Actor(105,"shubham");

		Actor a5 = new Actor(105,"ragahv");

		lmap.put(a1.aName, m2);
		lmap.put(a.aName, m1);
		lmap.put(a3.aName, m);
		lmap.put(a4.aName, m4);
		lmap.put(a2.aName, m3);
		lmap.put(a5.aName, m5);
		//System.out.println(lmap);
		Set<String> ss = lmap.keySet();
		Iterator<String> itr = ss.iterator();
		while(itr.hasNext()) {
			String k = itr.next();
			System.out.println("key is"+k);
			System.out.println(lmap.get(k));
			System.out.println("\n");
		}
		System.out.println("\n____________________________________________________");

		LinkedHashMap<Movie,String> lmap1 = new LinkedHashMap<>();
		
		lmap1.put( m1,a1.aName);
		lmap1.put( m2,a.aName);
		lmap1.put( m3,a2.aName);
		lmap1.put( m,a3.aName);
		lmap1.put( m4,a4.aName);
		//System.out.println(lmap);
		Set<Movie> ss1 = lmap1.keySet();
		Iterator<Movie> itr1 = ss1.iterator();
		while(itr1.hasNext()) {
			Movie k = itr1.next();
			System.out.println("key is "+k);
			System.out.println(lmap1.get(k));
			System.out.println("\n");
		}


	}

}
