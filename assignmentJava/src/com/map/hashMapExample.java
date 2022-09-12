package com.map;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


class IteratorHashMap{
	
	public void usingKeySet() {
		 HashMap <Integer , String> m = new HashMap<>();
		   
		    m.put(23,"kavita");
	        m.put(24,"nena");
	        m.put(25,"shrishti");
	        m.put(26,"anu");
	        m.put(27,"radha");
	        m.put(28,"nisha");
	        

	        Set<Integer> s = m.keySet();
	        Iterator<Integer> itr = s.iterator();
	        while(itr.hasNext()) {
	        	Integer key = itr.next();
	        	System.out.println("key : "+key);
	        	System.out.println("value of key "+m.get(key));
	        }
	}
   public void usinhValues() {
	   HashMap <Integer , String> m = new HashMap<>();
	   
	    m.put(23,"kavita");
       m.put(24,"nena");
       m.put(25,"shrishti");
       m.put(26,"anu");
       m.put(27,"radha");
       m.put(28,"nisha");
       
       Collection List = m.values();
     //  List<String> l = (List<String>)m.values();
       Iterator<String> itr = List.iterator();
     /*  while(itr.hasNext()) {
    	   
    	   System.out.println("value is : "+itr.next());
       }*/
       Collection List1 = m.keySet();
       Iterator<Integer> itr1 = List1.iterator();
    /*  while(itr1.hasNext()) {
    	   System.out.println("key is : "+itr1.next());
       } */
       
       //pointer is reached to last index , so not enterd n while loop
    /*	while(itr.hasNext() && itr1.hasNext()) {
    		 System.out.print("key is>>> : "+itr1.next());
    		 System.out.println(" , value is>>> : "+itr.next());
    		  
    	}*/
    	
    	 //List<String> l = (List<String>)m.values();
    	 Set<String> l = (Set<String>)m.values();

    	// List<Integer> l1 = (List<Integer>)m.keySet();
    	 Set<Integer> l1 = (Set<Integer>)m.keySet();

    	 Iterator<Integer> itr11= l1.iterator();
    	 Iterator<String> itr22 = l.iterator();
    	 while(itr11.hasNext()&&itr22.hasNext()) {
    		 System.out.println("key  is(list) "+itr.next());
    		 System.out.println("value is (list) "+itr22.next());
    	 }
    	 

    		  
    		
    	   
       
     /*  Collection List1 = m.values();
       Iterator<Integer> itr1 = List.iterator();
       System.out.println("_________");
       while(itr.hasNext()) {
    	   System.out.println("key valye is "+itr1.next());
       }*/
   
   }
 //iterator map using entryType  
   public void usngEntrySet() {
	   HashMap <Integer , String> m = new HashMap<>();
	   
	    m.put(23,"kavita");
      m.put(24,"nena");
      m.put(25,"shrishti");
      m.put(26,"anu");
      m.put(27,"radha");
      m.put(28,"nisha");
    
	   
      System.out.println("non genric way");
      Set entyp = m.entrySet();
      Iterator itr = entyp.iterator();
	   while(itr.hasNext()) {
		   System.out.println("what is "+itr.next());
	   }
	   
	   
	   System.out.println(" genric way");
	   Set<Map.Entry<Integer, String>> entryset = m.entrySet();
	   Iterator itr1 = entryset.iterator();
	   while(itr1.hasNext()) {
		   Map.Entry<Integer, String> ent = ( Map.Entry<Integer, String>)itr1.next();
		   System.out.println("key : "+ent.getKey()+" ,value is :"+ent.getValue());
	   }
   }
   
}

public class hashMapExample {

	public static void main(String[] args) {
		IteratorHashMap obj = new IteratorHashMap();
		//obj.usingKeySet();
		obj.usinhValues();
		//obj. usngEntrySet();
    HashMap m1 = new HashMap();
    //generic form
    HashMap <Integer , String> m = new HashMap<>();
    System.out.println("size of map is "+m.size());
        m.put(23,"kavita");
        m.put(24,"nena");
        m.put(25,"shrishti");

        m.put(26,"anu");
        m.put(27,"radha");
        m.put(28,"nisha");
     /*   System.out.println("original value of key 23 "+m.put(23, "neeta"));
        System.out.println(m);  //over written
        
        String s = m.put(125, "nikita");
        System.out.println(s);
        System.out.println(m);  //over written*/
        
 //get method
        System.out.println(m.get(23));
  // remove()  - retrun value;      
        System.out.println("remove "+m.remove(23));
        System.out.println(m);
        System.out.println("remove "+m.remove(123));  //return null
        
 //contain key
       boolean b= m.containsValue("anu");
       boolean b1= m.containsValue("ram");
       System.out.println(b1);
//replace
      String s2= m.replace(24,"ramswaroop" );
      System.out.println(s2);
      System.out.println(m); 
       
        
        
        
      
        
        




	}

}
