package com.map;

import java.util.Collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

class Book //implements Comparable<Book>
{
	Integer bookId,price;
	String bookName,auther;
	public Book(int bi,int bp,String bn,String an) {
		bookId = bi;
		price = bp;
		bookName = bn;
		auther = an;
	}
	public String toString() {
		return bookId+" "+price+" "+bookName+" "+auther;
	}
	
	/*public int compareTo(Book o) {
	
		if(this.price>o.price) {
			return -1;
		}
	    if(this.price<o.price) {
	    	return 1;
	    }
	    else
	    	if(this.bookId>o.bookId) {
	    		return -1;
	    	}
	        if(this.bookId<o.bookId) {
	        	return 1;
	        }
	        else
	        	return 0;
	}*/
		
}
class SortByPrice implements Comparator<Book>{
	public int compare(Book b,Book b1) {
		return b.price.compareTo(b1.price);
	}
}
class SortById implements Comparator<Book>{
	public int compare(Book b,Book b1) {
		return b.bookId.compareTo(b1.bookId);
	}
}
class SortByPriceAndId implements Comparator<Book>{
	public int compare(Book b,Book b1) {
		
		int bid = b.bookId.compareTo(b1.bookId);
		int bprice =b.price.compareTo(b1.price);
		if(bid==0) {
			if(bprice==0) {
				return bid;
			}
			else {
				return bprice;
			}
		}else
			return bid;
		
	}
}
class SortByIdAndPrice1 implements Comparator<Book>{
	public int compare(Book b,Book b1) {
		
		int bid = b.bookId.compareTo(b1.bookId);
		int bprice =b.price.compareTo(b1.price);
		if(bprice==0) {
			if(bid==0) {
				return bprice;
			}
			else {
				return bid;
			}
		}else
			return bprice;
		
	}
}

	

public class Written_test_q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LinkedList<Book> ll = new LinkedList<>();
     Book b = new Book(30,1200,"java","lalli gova");
     Book b1 = new Book(20,1600,"c++","naresh reddy");
     Book b6 = new Book(50,1600,"c+","naresh reddy");
     
     Book b2 = new Book(10,1000,"mathematics","yogita");
     Book b3 = new Book(40,1500,"algebra","yogesh");
     Book b4 = new Book(40,2100,"mathematics","yogita");
     Book b5 = new Book(20,1300,"algebra","yogesh");
     
     
     TreeMap<Integer,Book> map = new TreeMap<>();
     map.put(b3.bookId, b3);
     map.put(b.bookId, b);
     map.put(b2.bookId, b2);
     map.put(b1.bookId, b1);
     map.put(b5.bookId, b5);
     map.put(b4.bookId, b4);
     map.put(b6.bookId,b6);
    
     System.out.println("id sort");
     Set<Integer> st2 = map.keySet();
     Iterator<Integer> itr2 = st2.iterator();
     while(itr2.hasNext()) {
    	 Integer val = itr2.next();
    	 System.out.println(val);
    	 System.out.println(map.get(val));
     }
    
     
     TreeMap<Integer,Book> map1 = new TreeMap<>(Collections.reverseOrder());
   //if key is premittive type than no need pass comparator refernce,its give errro
    // TreeMap<Integer,Book> map1 = new TreeMap<>();
     map1.put(b3.price, b3);
     map1.put(b2.price, b2);
     map1.put(b1.price, b1);
     map1.put(b.price, b);
     map1.put(b5.price, b5);
     map1.put(b4.price, b4);
     map1.put(b6.price, b6);
      System.out.println("\nprice sort");
     
     Set<Integer> st = map1.keySet();
     Iterator<Integer> itr = st.iterator();
     while(itr.hasNext()) {
    	 Integer val = itr.next();
    	 System.out.print(val+" ");
    	 System.out.println(map1.get(val));
     }
     
    // TreeMap<Book,Integer> map2 = new TreeMap<>(new SortByPriceAndId() );
     TreeMap<Book,Integer> map2 = new TreeMap<>(new SortByIdAndPrice1() );
     
    // TreeMap<Book,Integer> map2 = new TreeMap<>(Collections.reverseOrder() );
     //not use Collections.reverce because Book is not comapreble in java.lang package
     map2.put(b3, b3.bookId);
     map2.put(b, b.bookId);
     map2.put(b2, b2.bookId);
     map2.put(b1, b1.bookId);
     map2.put(b4, b5.bookId);
     map2.put(b5, b4.bookId);
     map2.put(b6, b6.bookId);
     
     //Collections.reverseOrder();
     
     System.out.println("\nid_price");
     Set<Book> st1 = map2.keySet();
     Iterator<Book> itr1 = st1.iterator();
     while(itr1.hasNext()) {
    	 Book val = itr1.next();
    	 System.out.print(val+" ");
    	 System.out.println(map2.get(val));
     }
    
   Collections.reverse(ll);
     
    
     
     //problem 2
     NavigableSet<Integer> kset1 = map1.descendingKeySet();
     for(Integer bs1 : kset1) {
    	// System.out.println(map1.get(bs1));
     }
     
     
     NavigableSet<Integer> kset = map1.navigableKeySet();
       for(Integer bs : kset) {
    	 //  System.out.println(map1.get(bs));
       }



	}

}
