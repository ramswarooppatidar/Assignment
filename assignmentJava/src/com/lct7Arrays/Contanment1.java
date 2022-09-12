package com.lct7Arrays;
class Market{
	String name;
	String place;
	
	Shop sh,sh1,sh2;
	
	//SETTER METHOD
	public void setName(String s) {
		name=s;
	}
	public void setPlace(String s) {
		place=s;
	}
	public void setShop(Shop a,Shop b,Shop c) {
		sh=a;
		sh1=b;
		sh2=c;
	}
	Market(){}
	Market(String s,String s1,Shop sh,Shop sh1,Shop sh2){
		name=s;
		place=s1;
		
		this.sh=sh;
		this.sh1=sh1;
		this.sh2=sh2;
	}
	public String toString() {
		return "name of market is "+name+"\nplace of market is "+place+" "+sh+sh1+sh2;
	}
	
}
class Shop{
	int shNumber;
	String shName;
	int turnOver;
	
	public void setShNumber(int a) {
		shNumber=a;
	}
	public void setShName(String a) {
		shName=a;
	}
	public void setTurnOver(int a) {
		turnOver=a;
	}
	Shop(){}
	Shop(int num,String name,int c){
		shNumber=num;
		shName=name;
		turnOver=c;
	} 
	public String toString(){
		return "\n\nshop name is "+shName+"\nshop number is "+shNumber+"\nshop turn over is"
				+ " "+turnOver;
	}
}
public class Contanment1 {
	public static void main(String[] args) {
		
		//USING CONSTRUCTOR
		//Market m= new Market();
		Shop sh = new Shop(100,"VegRestaurant",12500);
		Shop sh1 = new Shop(200,"stationary",22500);
		Shop sh2 = new Shop(300,"electronic",32000);
		Market m1= new Market("chandniChowk","new delhi",sh,sh1,sh2);
		System.out.println("USING CONSTRUCTOR_______________");
		System.out.println(m1);  
		
		//USING SETTER METHOD
		Shop s = new Shop();
		s.setShNumber(120);
		s.setShName("tealoggy");
		s.setTurnOver(12500);
		Shop s1 = new Shop();
		s1.setShNumber(140);
		s1.setShName("fastFOODcorner");
		s1.setTurnOver(32500);
		Shop s2 = new Shop();
		s2.setShNumber(120);
		s2.setShName("dublineBar");
		s2.setTurnOver(42500);
		
		Market m = new Market();
		m.setName("chppanDukan");
		m.setPlace("bhopal");
		/*m.setShope(s);       method is    public void setShope(Shope a)
		m.setShope(s1);   //                     sh=a;
		m.setShope(s2);*/      //  than only it is correct,
		
		m.setShop(s,s1,s2);  //   public void setShope(shope a,shope b,shope c)
		
		
		/*System.out.println(s);
		System.out.println("_________________________________");
		System.out.println(s1);
		System.out.println("_________________________________");
		System.out.println(s2);
		System.out.println("\n_________________________________");*/
		System.out.println("USING SETTER METHOD_________________________________");
		System.out.println(m);
	
	
	





	}

}
