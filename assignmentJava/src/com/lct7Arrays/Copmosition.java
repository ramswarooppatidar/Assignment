package com.lct7Arrays;

class Market1{
	String name;
	String place;
	
	Shop1 sh,sh1,sh2;
	
	//SETTER METHOD
	
	Market1(){}
	Market1(String s,String s1){
		name=s;
		place=s1;
		// Shop1 sh = new Shop1(100,"VegRestaurant",12500); mistack show null
		 sh = new Shop1(100,"VegRestaurant",12500);
		 sh1 = new Shop1(200,"stationary",22500);
		 sh2 = new Shop1(300,"electronic",32000);
		
	
	}
	public String toString() {
		return "name of market is "+name+"\nplace of market is "+place+" "+sh+sh1+sh2;
	}
	
}
class Shop1{
	int shNumber;
	String shName;
	int turnOver;
	
	//Shop1(){}
	Shop1(int num,String name,int c){
		shNumber=num;
		shName=name;
		turnOver=c;
	} 
	public String toString(){
		return "\n\nshop name is "+shName+"\nshop number is "+shNumber+"\nshop turn over is"
				+ " "+turnOver;
	}
}

public class Copmosition {
	public static void main(String[] args) {
			Market1 m1= new Market1("chandniChowk","new delhi");
		System.out.println("USING CONSTRUCTOR_______________");
		System.out.println(m1);  
	
	}

}
