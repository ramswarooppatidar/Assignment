package com.map;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;






class Customer{
	Integer custId,cAge,noOfSeat;
	String cName;
	public  Customer() {}
	public Customer(int cid,int age,int sn,String name){
		custId=cid;
		cAge = age;
		noOfSeat=sn;
		cName = name;
	}
	public String toString() {
		return "\nname "+cName+" cust ID"+custId+" age "+cAge+" seat number"+noOfSeat;
	}
	public void doBooking() {
		ArrayList<Customer> al1 = new ArrayList<>();
		
		if(al1.size()<50) {
			al1.add(new Customer(1001,24,12,"ram"));
			al1.add(new Customer(1002,25,13,"rahul"));
			al1.add(new Customer(1003,26,14,"jatin"));
			al1.add(new Customer(1004,35,15,"shrishti"));
		}
	}
			
			
	public void showBookingDetail(Map m) {
		Set<Map.Entry<String,ArrayList<Customer>>> entrySet = m.entrySet();
		Iterator<Map.Entry<String,ArrayList<Customer>>> itr = entrySet.iterator();
		while(itr.hasNext()) {
			Map.Entry<String,ArrayList<Customer>> ent = itr.next();
			String bogiNo = ent.getKey();
			ArrayList<Customer> clist = ent.getValue();
			System.out.println("customer booking for "+bogiNo);
			//System.out.println(clist);
			for(Customer c : clist) {
				System.out.println("\t"+c);
			}
		}
	}
	public void creatMap(Map m) {
		
	
	   /* ArrayList<Customer> al1 = new ArrayList<>();
		al1.add(new Customer(1001,24,12,"ram"));
		al1.add(new Customer(1002,25,13,"rahul"));
		al1.add(new Customer(1003,26,14,"jatin"));
		al1.add(new Customer(1004,35,15,"shrishti"));
		
		ArrayList<Customer> al2 = new ArrayList<>();
		al2.add(new Customer(101,64,32,"nena"));
		al2.add(new Customer(102,65,33,"tamiya"));
		al2.add(new Customer(103,66,34,"pragya"));
		al2.add(new Customer(104,65,35,"salon2"));
		//System.out.println(al1);
		
		HashMap<String,ArrayList<Customer>> map = new HashMap<>();
		map.put("s1", al1);
		map.put("s2", al2);*/
		
		
		
		
		
		HashMap<Integer,Integer> map2 = new HashMap<Integer,Integer>();
		HashMap<Integer,ArrayList<Customer>> map1 = new HashMap<Integer,ArrayList<Customer>>();
		
		  	 Collection<ArrayList<Customer>> cll = m.values();
		  	 for(ArrayList<Customer> cli : cll) {
		  		System.out.println(cli) ;
		  		System.out.println("________________________");
		  		Iterator<Customer> itr = cli.iterator();
		  		while(itr.hasNext()) {
		  			Customer c = itr.next();
		  			map2.put(c.custId, c.cAge);
		  		}
		  		System.out.println(map2);
		  	 }
		  	 System.out.println("map created is");
		  	 Set<Map.Entry<Integer,Integer>> entryset = map2.entrySet();
		  	 Iterator<Map.Entry<Integer,Integer>> itr1 = entryset.iterator();
		  	 while(itr1.hasNext()) {
		  		Map.Entry<Integer,Integer> ent = itr1.next();
		  		System.out.println(ent.getKey()+" booked"+ent.getValue()+" seats");
		  	 }
	}
	
}

public class Train_ticket_booking_Application {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Customer> al1 = new ArrayList<>();
		al1.add(new Customer(1001,24,12,"ram"));
		al1.add(new Customer(1002,25,13,"rahul"));
		al1.add(new Customer(1003,26,14,"jatin"));
		al1.add(new Customer(1004,35,15,"shrishti"));
		
		ArrayList<Customer> al2 = new ArrayList<>();
		al2.add(new Customer(101,64,32,"nena"));
		al2.add(new Customer(102,65,33,"tamiya"));
		al2.add(new Customer(103,66,34,"pragya"));
		al2.add(new Customer(104,65,35,"salon2"));
		//System.out.println(al1);
		
		HashMap<String,ArrayList<Customer>> map = new HashMap<>();
		map.put("s1", al1);
		map.put("s2", al2);
		//System.out.println(map);
		
		Customer obj = new Customer();
		//obj.showBookingDetail(map);
		obj.creatMap(map);
		
		


	}

}
