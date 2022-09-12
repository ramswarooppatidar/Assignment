package com.map;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Laptop 
{
	String brand , processor ,modelNo ;
	int price ,ramL;
	Laptop(){}
	Laptop(String b,String pro,int p,String m,int r)
	{
		brand = b;
		processor = pro;
		price = p;
		modelNo = m;
		ramL = r;
		
	}
	public String toString()
	{
		return "\nBrand : "+brand+"\nProcessor : "+processor+"\nPrice : "+price+"\nModel No: "+modelNo+"\nRam : "+ramL;
	}
	
}
class SortByRam implements Comparator<Laptop>
{
	public int compare(Laptop o1, Laptop o2)
	{
		
		return o1.ramL-o2.ramL;
	}
	
}

public class LaptopInfo {
	Set<Laptop> l;
	LaptopInfo()
	{
		l = new TreeSet<Laptop>(new SortByRam());
	}
	public void createHashSet()
	{
		Laptop lo = new Laptop("Samsung","Intel Xeon",34000,"tr5Y4yy546",16);
		Laptop lo1 = new Laptop("HP","Intel Core",30000,"wr5Yh546",32);
		Laptop lo2 = new Laptop("Lenovo","Intel Celeron",40000,"qgtrr5Yh546",4);
		Laptop lo3 = new Laptop("DELL","Intel Celeron Pro",35000,"rr5Yh46",8);
		l.add(lo);
		l.add(lo1);
		l.add(lo2);
		l.add(lo3);
		
		//System.out.println(l);
		l.remove(lo3);
		
		//System.out.println(l);
	}
	public void itrate()
	{
		Iterator<Laptop> itr = l.iterator();
	    while(itr.hasNext())
	    {
	    	   System.out.println(itr.next());
	    }
	}

	public static void main(String[] args) {
		LaptopInfo obj = new LaptopInfo();
		obj.createHashSet();
		obj.itrate();

	}

}
