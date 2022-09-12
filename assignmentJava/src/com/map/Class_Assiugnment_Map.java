package com.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/*
class PizzaOrder{
	String name;
	Integer qty;
	Integer price;
	public PizzaOrder() {}
	public PizzaOrder(String s,int q,int p) {
		name = s;
		qty = q;
		price = p;
	}
	public String toString() {
		return name+" "+qty+" "+price;
	}
}
class PavBhajiOrder{
	String name;
	Integer qty;
	Integer price;
	public PavBhajiOrder() {}
	public PavBhajiOrder(String s,int q,int p) {
		name = s;
		qty = q;
		price = p;
	}
	public String toString() {
		return name+" "+qty+" "+price;
	}
	
}
class Billing{
public void calculateBill(ArrayList<PizzaOrder> pl1,ArrayList<PizzaOrder> pl3,
                                       ArrayList<PavBhajiOrder>pbl1) {
		Iterator<PizzaOrder> itr = pl1.iterator();
		Iterator<PizzaOrder> itr1 = pl3.iterator();
		Iterator<PavBhajiOrder> itr2 = pbl1.iterator();
		HashMap<String , Integer> fmap= new HashMap<>();
		while(itr.hasNext()) {
			PizzaOrder po = itr.next();
			PizzaOrder po1 = itr1.next();
			PavBhajiOrder pb = itr2.next();
			    Integer totalPricePb=pb.qty*pb.price;
				Integer totalQtyP = po.qty+po1.qty;
				Integer totalPrice = po.price*totalQtyP;
				fmap.put(po.name, totalPrice);
				fmap.put(pb.name, totalPricePb);
				PavBhajiOrder pb1 = itr2.next();
				totalPricePb += pb1.qty*pb1.price;
				fmap.put(pb.name, totalPricePb);
		}
		System.out.println(fmap);
		Set<String> ent = fmap.keySet();
		Iterator<String> itrr= ent.iterator();
		while(itrr.hasNext()) {
			String s = itrr.next();
			System.out.println(s);
			System.out.println(fmap.get(s));
			
		}
	}
}
    


public class Class_Assiugnment_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaOrder po = new PizzaOrder("pizza",3,120);
		PizzaOrder po1 = new PizzaOrder("pizza",2,120);
		PizzaOrder po2 = new PizzaOrder("pizza",4,120);
		ArrayList<PizzaOrder> l = new ArrayList<>();
		l.add(po);
		//l.add(po1);
		ArrayList<PizzaOrder> l3 = new ArrayList<>();
		l3.add(po2);
		
		PavBhajiOrder pb = new PavBhajiOrder("PavBhaji",4,150);
		PavBhajiOrder pb1 = new PavBhajiOrder("PavBhaji",3,150);
		ArrayList<PavBhajiOrder> l2 = new ArrayList<>();
		l2.add(pb1);
		l2.add(pb);
		

		HashMap<String,PizzaOrder> map = new HashMap<>();
		HashMap<String,PavBhajiOrder> map1 = new HashMap<>();
		map.put("o1", po);
		map.put("o2", po1);
		map1.put("o3", pb);
		map1.put("o32", pb1);
		System.out.println(map);
		System.out.println(map1);
		
		Billing obj = new Billing();
		obj.calculateBill(l,l3,l2);
		obj.calculateBill(l3, l3, l2);


	}

}*/
