package com.array_list_practice;
import java.util.ArrayList;
import java.util.*;

public class Array_list_problems {
	public void addMethod() {
		ArrayList<Integer> l1 = new ArrayList<>();
		ArrayList<Integer> l2 = new ArrayList<>();
//1 add mathod add();
		l1.add(20);
		l2.add(10);
		/*for(int i=0;i<l1.size();i++) {       //out of memory error;
			l1.add(i);
		}*/
		for(int i=0;i<10;i++) {
			l2.add(i);
		}

		System.out.println(l1);
		System.out.println(l2);
	}
	public void remove() {
		//int k=0;
		ArrayList<Integer> l1 = new ArrayList<>();
		ArrayList<Integer> l2 = new ArrayList<>();

		for(int i=0;i<10;i++) {
			l1.add(i);
		}
		for(int i=0;i<20;i++) {
			if(i%2==0) {
				
				l2.add(i);
			}
		}
		System.out.println(l1);
		System.out.println(l2);
		System.out.println("remove index 0 element "+ l1.remove(2));
		System.out.println(l1);
		int rem = l1.remove(3);
		System.out.println("remove(index=3) method return index element "+rem);
		System.out.println(l1);
		l1.removeAll(l2);
		System.out.println("l1.removeAll(l2) "+l1.removeAll(l2));
		//System.out.println("l1.removeAll(l2) "+l1.removeAll());  error
		
		//l2.removeIf(k->(k%2==0));
	}
	
		
	public void sublist1() {
		ArrayList<Integer> l1 = new ArrayList<>();
		ArrayList<Integer> l2 = new ArrayList<>();
		for(int i=0;i<10;i++) {
			l1.add(i);
		}
		for(int i=0;i<20;i++) {
			if(i%2==0) {
				
				l2.add(i);
				
			}
		}
		List<Integer> l3 =l1.subList(2, 5);
        System.out.println(l3);
	}
	public void iteration() {
		ArrayList<String> name = new ArrayList<>();
		//Iterator<String> itr = name.iterator();
		name.add("ajay");
		name.add("jatin");
		name.add("shrishti");
		name.add("vijay");
		name.add("shyam");
		//name.addAll(name);
		//System.out.println(name);
		System.out.println("class _ problems before itration "+name);
		
		for(Iterator<String> itr = name.iterator();itr.hasNext();) {
			String o = itr.next();
			if(o.equals("vijay")) {
				itr.remove();
			}
		}
		System.out.println("\nclass _ problems after itration  "+name);
		
		
		System.out.println("\nclass _ problems print in reverce order  ");

		ListIterator<String> rev = name.listIterator(name.size());
		while(rev.hasPrevious()) {
			String name1 = rev.previous();
		    
			System.out.println(name1);
		}
		
		
		List <String> l = name.subList(2,3);
		//System.out.println(l);
		
		name.add(1,"ram");
		//System.out.println(name);
		
		if(name.contains("ajay")) {
			boolean result = name.remove("ajay");
			//System.out.println(result);
		}
		
		//for each
		for(String s : name) {
			//System.out.println(s);
		}
		
		//for each/errorrrr
		
		/*for(String s:name) {
			if(s.equals("jatin")) {
				String result = name.remove(name.indexOf(1));
				System.out.println("for each"+name);
				System.out.println(result);
			}
		}*/
			
	}
	public void iteratorOverArrayListExample() {
		List<String> tvShow = new ArrayList<>();
		tvShow.add("breaking bad");
		tvShow.add("Game Of Thrones");
		tvShow.add("friend");
		tvShow.add("witcher");
		
		System.out.println("===itrate using for each and lambda==");
		tvShow.forEach(tvShowss->{
			System.out.println(tvShowss);
		});
		
		System.out.println("\n==iterate using an iterator()==");
		
		Iterator<String> tvShowIterator = tvShow.iterator();
		while(tvShowIterator.hasNext()) {
			String tvShows1 = tvShowIterator.next();
			System.out.println(tvShows1);
		}
		
		System.out.println("\n===iterate using an iterator()  forEachRemaining() method==");
		tvShowIterator = tvShow.iterator();
		tvShowIterator.forEachRemaining(tvShows ->{
			System.out.println(tvShows);
		});
		
		System.out.println("=====iterate using listiterator() to transver in both dirsection==");
		//here we start from end of the list and traverse backWard.
		//listIterator<String> tvShowIterator = tvShow.listIterator(0)
		ListIterator<String> tvShow1Iterator = tvShow.listIterator(tvShow.size());
		while(tvShow1Iterator.hasPrevious()) {
			String tvShows = tvShow1Iterator.previous();
			System.out.println(tvShows);
		}
		
		System.out.println("\n==using simple for each loop===");
		for(String ts : tvShow ) {
			System.out.println(ts);
		}
		
		System.out.println("\n==using for loop with index");
		for(int i=0;i<tvShow.size();i++) {
			System.out.println(tvShow.get(i));
		}
	}
	public void ArrayListIteratorRemoveExample() {
		List<Integer> number = new ArrayList<>();
		number.add(12);
		number.add(13);number.add(14);number.add(15);
		 Iterator<Integer> numberIterator = number.iterator();
		 while(numberIterator.hasNext()) {
			 Integer num = numberIterator.next();
			 if(num%2 !=0) {
				 numberIterator.remove();
			 }
		 }
		 System.out.println(number);
	}
	public void searchingElementsInArrayList() {
		List<String> name = new ArrayList<>();
		name.add("shrishti");
		name.add("shyam");
		name.add("jatin");
		name.add("ram");
		name.add("shyam");
		
		
		
		//check if Arry list contain a given name
		System.out.println("name arry conatin /shrishti/ "+name.contains("shrishti"));
		
		//find index of first occurrence of elements in arryList
		System.out.println("index of  /shyam/ "+name.indexOf("shyam"));
		
		//find index of last occurrence of elements in arryList
		System.out.println("lastindex of  /shyam/ "+name.lastIndexOf("shyam"));
			
		
	}
	public void sortingArrayList() {
		List<Integer> number = new ArrayList<>();
		number.add(12);
		number.add(17);
		number.add(44);
		number.add(5);
		
		System.out.println("before "+ number);
		
		//sorting of number using collection.sort()
		Collections.sort(number);
		System.out.println("after "+ number);
	}
	public void sortintArrayusingArraySORT() {
		List<String> name = new ArrayList<>();
		name.add("lisa");
		name.add("diya");
		
		name.add("jenny");
		
		name.add("mark");
		
		name.add("david");
		
		name.add("jennifer");
		
		System.out.println("name :"+name);
//sort an array list using its sort() method,you mustpass a 
		                                //comparetot to the arry list short()method		
		name.sort(new Comparator<String>() {
			public int compare(String nam1,String nam2) {
				return nam1.compareTo(nam2);
			}
		});
		
		
	}
	public void sortArrayListOfObjectsUsingCustomComprtor() {
		
	}
		

	 	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	
		Array_list_problems obj = new Array_list_problems();
		//obj.addMethod();
		//obj.remove();
		//obj.sublist1();
		//obj.iteratorOverArrayListExample();
		//obj.ArrayListIteratorRemoveExample();
		//obj.searchingElementsInArrayList();
		obj.iteration();

	}
}
  
  
