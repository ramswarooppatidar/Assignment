package com.array_list_practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class remove_dubliction {
	public void removeDublicaton(List<Integer>a) {
		Iterator<Integer> itr = a.iterator();
		Iterator<Integer> itr1 = a.iterator();

		System.out.println(a);
		while(itr.hasNext()) {
			Integer num =itr.next();
		    while(itr1.hasNext()) {
			if(num.equals(itr1.next())) {
				itr1.remove();
			}
			
			
			
		    }
			
		}
		
	
		
		/*for(int i=0;i<a.size();i++) {
			for(int j=i+1;j<a.size();j++) {
				if(a.get(i).equals(a.get(j))) {
					a.remove(j);
				}
			}
			
		}*/
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<Integer> l = new ArrayList<>();
     l.add(2);
     l.add(12);
     l.add(3);
     l.add(12);
     l.add(3);
     remove_dubliction obj = new remove_dubliction();
     obj.removeDublicaton(l);
     
     
	}

}
  