package www.treemap;

import java.util.NavigableMap;
import java.util.TreeMap;

class sorting{
	
}

public class TreeMap_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       TreeMap<String,String> map = new TreeMap<>();
       TreeMap<String,String> map1 = new TreeMap<>();
       
       map.put("c1", "red");
       map.put("c3", "black");
       map.put("c5", "yellow");
       map.put("c2", "orange");
       map.put("c4", "green");
       System.out.println(map);
       System.out.println("firrst entry "+map.firstKey());
       
       //last key firstkey
       System.out.println("least entry "+map.lastKey());
       System.out.println("least entry "+map.lastKey()+" "+map.get(map.lastKey()));
       
       //descending order
       System.out.println("Reverse order view of the keys: " + map.descendingKeySet());
       
       //tailmap
       System.out.println( "c1 false : "+map.tailMap("c1", false));
       System.out.println( "c1 true :"+map.tailMap("c3", true));
      // map1 =  map.tailMap("c1", true);
       NavigableMap<String,String> map3 = map.tailMap("c4", false);
       System.out.println(map3);
       NavigableMap<String,String> map4 = map.tailMap("c4", true);
       System.out.println(map4);
       
       System.out.println("toString : "+map.toString());
       System.out.println( map.clone());
       map.


	}

}
