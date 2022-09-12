package com.map;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class Actor1
{
	int actor_id;
	String actor_name;
	Actor1(){}
	Actor1(int id,String a)
	{
		actor_id=id;
		actor_name=a;
	}
	public String toString()
	{
		return actor_id+" "+actor_name;
	}
}
class Movie1
{
	int budget,role;
	String m_name,m_producer;
	Actor1 obj;
	Movie1(){}
	Movie1(String movieName,String producer,int budjet,int r,Actor1 a)
	{
		this.m_name = movieName;
		this.m_producer = producer;
		this.budget = budjet;
		role=r;
		this.obj=a;
	}
	public String toString()
	{
		return m_name+" "+m_producer+" "+budget+" "+role+" "+obj;
	}
}

public class ActorEx {
	Integer max=Integer.MIN_VALUE;
	
	ArrayList<Movie1> al=new ArrayList<Movie1>();
	ActorEx()
	{
	al.add(new Movie1("M.S.Dhoni", "Raju", 700000,3,new Actor1(323,"Madhavan")));
	al.add(new Movie1("WANTED", "KARAN JOHAR", 533000,4,new Actor1(134,"SALAMAN")));
	al.add(new Movie1("RHTDM", "GANESH", 8768760,2,new Actor1(323,"AAMIR")));
	System.out.println(al);
	}
	public void Createmap()
	{
		TreeMap<String, String> tm=new TreeMap<String, String>(Collections.reverseOrder());
		Iterator<Movie1> itr=al.iterator();
		while(itr.hasNext())
		{
			Movie1 m=itr.next();
			tm.put(m.m_name,m.obj.actor_name);
		}
		System.out.println(tm);
	}
	public void createLinkedHashMap()
	{
		LinkedHashMap<String,Integer> lh=new LinkedHashMap<String,Integer>();
		Iterator< Movie1> itr=al.iterator();
		while(itr.hasNext())
		{
			Movie1 m=itr.next();
			lh.put(m.obj.actor_name,m.role);
			
		}
		System.out.println(lh);
		
		/*Set<Map.Entry<String,Integer>> ent = lh.entrySet();
		Iterator<Map.Entry<String,Integer>> it = ent.iterator();
		while(it.hasNext()) {
			Map.Entry<String,Integer> rr = it.next();
		}*/
	}
	public void roleMax()
	{
		TreeMap<String,Integer> tm=new TreeMap<String,Integer>();
		TreeMap<String,Integer> tm1=new TreeMap<String,Integer>();
		Iterator< Movie1> itr=al.iterator();
		while(itr.hasNext())
		{
			
			Movie1 m=itr.next();
			tm.put(m.obj.actor_name,m.role);
			Collection<Integer> s=tm.values();
			
		    for(Integer a:s)
		    {
		    	
		    	if(max<a)
		    
		    	max=a;	
		    }
		   
		}
		 Iterator< Movie1> itr1=al.iterator();
			
			while(itr1.hasNext())
			{
				
				Movie1 m=itr1.next();
				if(m.role==max)
				{
					System.out.println(m.obj.actor_name+" Played maximum "+max+" Role");
				}
			}
			//tm1.putAll(tm);
			Set<String> rfg = tm.keySet();
			Iterator<String> ihj = rfg.iterator();
			while(ihj.hasNext()) {
				String str = ihj.next();
				Integer num = tm.get(str);
				if(num==max) {
					System.out.println( str +" ..maximum number of role done "+ tm.get(str));
				}
			}
	}
	public void maxRole() {
		
	}
    
	public static void main(String[] args) {
		ActorEx x=new ActorEx();
		x.Createmap();
		x.createLinkedHashMap();
		x.roleMax();

	}

}