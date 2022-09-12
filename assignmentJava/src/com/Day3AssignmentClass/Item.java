package com.Day3AssignmentClass;

public class Item {
	private int id;
	private String name;
	 private int cost;
	 
	 public void setId(int id) {
		 this.id= id;
	 }
	 
	 public int getId() {
		 
		 return id;
	 }
	 public void setCost(int cost) {
		 this.cost= cost;
	 }
	 public int getCost() {
		 
		 return cost;
	 }
	 public void setName(String name) {
		 this.name= name;
	 }
	 public String getName() {
		 
		 return name;
	 }
	
	
	 String supplyer;
	 public void acceptItemDetail(int id,String s,int c,String n) {
		 this.id=id;
		 name="s";
		 cost=c;
		 supplyer=n;
		 
	 }
	 public void showDetail() {
		 System.out.println("your item id is"+id);
		 System.out.println(" item name is"+"s");
		 System.out.println("cost of item is"+cost);
		 System.out.println("supplyer name  is"+"n");
	 }
	 public static void main(String[] args) {
		 Item i=new Item();
		
		// i.acceptItemDetail(23,"tq",1200,"ram");
		// i.showDetail();
		 i.setId(23);
		 i.setCost(4500);
		 i.setName("ram");
		 System.out.println("your id is " +i.getId());
		 System.out.println("your id is " +i.getCost());
		 System.out.println("your id is " +i.getName());
	
		 
	 }

}
