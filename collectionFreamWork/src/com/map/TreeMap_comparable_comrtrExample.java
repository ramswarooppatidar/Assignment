package com.map;

import java.util.TreeMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


class Item implements Comparable<Item>{
	Integer cost;
	String name;
	public Item() {}
	public Item(int c,String s) {
		cost=c;
		name=s;
	}
	public String toString() {
		return " "+cost+"  "+name;
	}
	public int compareTo(Item e) {
		if(this.cost>e.cost) {
			return 1;
		}
		else if(this.cost<e.cost) {
			return -1;
		}
		else {
			if(this.name.compareTo(e.name)>0) {
				return 1;
			}
			else if(this.name.compareTo(e.name)<0) {
				return -1;
			}
			else
				return 0;
		}
	}
}
class Supplier{
	Integer sId;
	String sName;
	public Supplier(int a,String s) {
		sId=a;
		sName=s;
	}
}
class sortByCostandName implements Comparator<Item>{
	public int compare(Item i1,Item i2) {
		int comCost = i1.cost.compareTo(i2.cost);
		int comName = i1.name.compareTo(i2.name);
		if(comCost==0) {
			if(comName==0) {
				return comCost;
			}
			else {
				return comName;
			}
		}
		else
			return comCost;
	//	return i1.cost-i2.cost ;
		/*if(i1.cost>i2.cost) {
			return 1;
		}
		if(i1.cost<i2.cost){
		return 1;}
		else{
		    if( i1.name.equals(i2.name)>0){
		    retrun 1;
		     }
		     else if(i1.name.equals.(i2.name)<0){
		     return -1;
		      }
		      else
		      return 0;*/
		
	}

	
	
}


public class TreeMap_comparable_comrtrExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      TreeMap<Item,String> map = new TreeMap<>();
      Item obj1 = new Item (1000,"headPhone");
      Item obj = new Item(1000,"mobile");
      Item obj2 = new Item(5000,"leptop");
      Item obj3 = new Item (7000,"tv");
      Item obj4 = new Item(3000,"tv");
      Item obj5 = new Item(2000,"charger");
      Item obj6 = new Item(2000,"charger");
      
      
      

      map.put(obj1, "ram");
      map.put(obj2, "pradip");
      map.put(obj3, "omkar");
      map.put(obj, "jatin");
      map.put(obj4, "rahul");
      map.put(obj6, "subham");
      map.put(obj5, "banty");
     
     
      System.out.println("ascending map "+map);
      Set<Map.Entry<Item,String>> ent = map.entrySet();
      Iterator<Map.Entry<Item,String>> itr = ent.iterator();
      while(itr.hasNext()) {
    	  Map.Entry<Item,String> tt = itr.next();
    	  System.out.println("key "+tt.getKey());
    	  System.out.println("value "+tt.getValue());
      }
      
      TreeMap<Item,String> map1 = new TreeMap<>(Collections.reverseOrder(new sortByCostandName()));
      map1.put(obj1, "anu");
      map1.put(obj, "shivi");
      map1.put(obj2, "lalli");
      map1.put(obj4, "geeta");
      map1.put(obj6, "sanu");
      map1.put(obj5, "anita");
      map1.put(obj3, "pooja");
     
    // map2.putAll(map);
     System.out.println("decending map "+map1);
     Set<Map.Entry<Item,String>> ent1 = map1.entrySet();
     Iterator<Map.Entry<Item,String>> itr1 = ent1.iterator();
     while(itr1.hasNext()) {
   	  Map.Entry<Item,String> t = itr1.next();
   	  System.out.println("key "+t.getKey());
   	  System.out.println("value "+t.getValue());
     }
   
      
    }

}
