package com.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class PizzaOrderr{
	String name;
	Integer qty;
	Integer price;
	public PizzaOrderr() {}
	public PizzaOrderr(String s,int q,int p) {
		name = s;
		qty = q;
		price = p;
	}
	public String toString() {
		return name+" "+qty+" "+price;
	}
}
class PavBhajiOrderr{
	String name;
	Integer qty;
	Integer price;
	public PavBhajiOrderr() {}
	public PavBhajiOrderr(String s,int q,int p) {
		name = s;
		qty = q;
		price = p;
	}
	public String toString() {
		return name+" "+qty+" "+price;
	}
	
}
class Burger{
	String name;
	Integer qty;
	Integer price;
	public Burger() {}
	public Burger(String s,int q,int p) {
		name = s;
		qty = q;
		price = p;
	}
	public String toString() {
		return name+" "+qty+" "+price;
	}
}
class BillingMan{
	public void billCalculate(ArrayList<PizzaOrderr> lpo,
			ArrayList<PavBhajiOrderr> lpb,ArrayList<Burger> lbr)
	{
		Iterator<PizzaOrderr> itr = lpo.iterator();
		Iterator<Burger> itr1 = lbr.iterator();
		Iterator<PavBhajiOrderr> itr2 = lpb.iterator();
		HashMap<String , Integer> fmap= new HashMap<>();
		Integer totalPricePizza =0;
		Integer totalPricePav =0;
		Integer totalPriceBur =0;
		while(itr.hasNext()) {
			PizzaOrderr rr = itr.next();
			totalPricePizza += rr.qty*rr.price;
			fmap.put(rr.name, totalPricePizza);
			while(itr1.hasNext()) {
				Burger rr1 = itr1.next();
				totalPriceBur += rr1.qty*rr1.price;
				fmap.put(rr1.name, totalPriceBur);
				while(itr2.hasNext()) {
					PavBhajiOrderr rr2 = itr2.next();
					totalPricePav += rr2.qty*rr2.price;
					fmap.put(rr2.name, totalPricePav);
				}

			}

			
		}
		System.out.println("\nFinal Map_________________");
		System.out.println(fmap);
		System.out.println("\n\n");
		Set<String> ent = fmap.keySet();
		Iterator<String> it = ent.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key);
			System.out.println("total price = "+fmap.get(key));
		}

		
	}
}
	


public class Class_Assignments_map2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaOrderr po = new PizzaOrderr("pizza",3,120);
		PizzaOrderr po1 = new PizzaOrderr("pizza",2,120);
		PizzaOrderr po2 = new PizzaOrderr("pizza",4,120);
		ArrayList<PizzaOrderr> lpo = new ArrayList<>();
		lpo.add(po);
		lpo.add(po2);
		lpo.add(po1);
		//l.add(po1);
		
		PavBhajiOrderr pb = new PavBhajiOrderr("PavBhaji",4,150);
		PavBhajiOrderr pb1 = new PavBhajiOrderr("PavBhaji",3,150);
		ArrayList<PavBhajiOrderr> lpb = new ArrayList<>();
		lpb.add(pb1);
		lpb.add(pb);
		
		Burger br= new Burger("burger",3,60);
		Burger br1= new Burger("burger",1,60);
		Burger br2= new Burger("burger",7,60);
		 
		ArrayList<Burger> lbr = new ArrayList<>();
		lbr.add(br2);
		lbr.add(br1);
		lbr.add(br1);

		HashMap<String,ArrayList<PizzaOrderr>> map = new HashMap<>();
		HashMap<String,ArrayList<PavBhajiOrderr>> map1 = new HashMap<>();
		HashMap<String,ArrayList<Burger>> map2 = new HashMap<>();
		map.put("d1", lpo);
		
		map1.put("d2", lpb);
		map2.put( "d3",lbr );
		
		System.out.println(map);
		System.out.println(map1);
		System.out.println(map2);
		
		BillingMan obj = new BillingMan();
		obj.billCalculate(lpo, lpb, lbr);
		
		


	}

}
