package com.Try_Catch_Throw_Throws;

class Socity{
	int regNum;
	String name;
	String location;
	public Socity() {};
	public Socity(int a,String s,String n) {
		regNum = a;
		name=s;
		location = n;
	}
	public void performTask() {
		Socity s = new Decorate() {
			
		}
		
	}
	public void showDetail() {
		System.out.println("your nam,e is "+name);
		System.out.println("your registration no is is "+regNum);
		System.out.println("your location is "+location);
	}
	class Flat{
		String ownerName;
		float price;
		public Flat() {};
		public Flat(String s,float p) {
			ownerName = s;
			price = p;
		}
		public void flatDetail() {
			System.out.println("owner name is "+name);
			System.out.println("price of flat is "+regNum);
			showDetail();
			
		}
		
	}
	static class  Audit{
		String auditName;
      public Audit(String s){
			auditName = s;
		}
      public void doAudit() {
    	  
      }
		
	}
	Socity f1 =new ClubHouse() {
		
	};
	f1.conductGame();
	
}
abstract class ClubHouse{
	abstract public void conductGame();
		
	}
interface Decorate{
	void makeDecoration();
}

public class InnerClass {

	public static void main(String[] args) {
		Socity obj = new Socity(123456,"abcd","pune");
		obj.showDetail();
		Socity.Audit f = new obj.Audit();
		

	}

}
