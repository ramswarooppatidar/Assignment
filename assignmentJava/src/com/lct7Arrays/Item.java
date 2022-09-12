package com.lct7Arrays;
import java.util.Scanner;
class itemDetail{
	String name;
	float cost;
	int quantity;
	
	public String toString() {
		return "name of item "+name+"\ncost of item "+cost+
				"\nquantity of item "+quantity;
	}
	public itemDetail() {}
	public itemDetail(String name,float a,int qut) {
		this.name=name;
		cost=a;
		quantity=qut;
		
	}
	public void show() {
		 
			System.out.println(this);
			System.out.println("__________________");
			
	}
	public void showEspecific(itemDetail a[]) {
		System.out.println("item whos cost greter than 50__");
		for(itemDetail val:a) {
			if(val.cost>=50)
			System.out.println(val);
			System.out.println("__________________");
			}
	}
	public boolean equal(itemDetail obj) {
		itemDetail i= (itemDetail)obj;
		if(this.name.equals(obj.name) && this.cost==obj.cost && this.quantity==obj.quantity);
	    
		return true;
	
	
		
	}
	public void samecost(itemDetail x[]) {
		System.out.println("same cost variable");
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x.length-i-1;j++) {
				
				if(x[i].cost==x[j+1].cost);
				System.out.println(x[i]);
				System.out.println("____________________");
			}
				
		}
		
	}
}
			
			
public class Item {
	public static void main(String[] args) {
		itemDetail obj=new itemDetail("mango",75.0f,100);
		itemDetail obj1=new itemDetail("apple",50.0f,50);
		itemDetail obj2=new itemDetail("banana",25.0f,70);
		
		
		//itemDetail x[]=new itemDetail[2];
		itemDetail x[];
		x=new itemDetail[3];
		//obj2.show(x);   //why show NULL
		
		x[0]=new itemDetail("mango",75.0f,100);

		x[1]=new itemDetail("mango",75.0f,100);
		//x[1]=new itemDetail("book",25.0f,100);
		//x[2]=new itemDetail("apple",75.0f,50);
		
		//System.out.println(x[0].equals.x[1]);
		
		
		for(int i=0;i<x.length;i++) {
			//x[i].show();
		}
		//obj.show(x);
		//obj.showEspecific(x);
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<x.length;i++) {
			System.out.println("plz enetr name of item ");
			String name=sc.nextLine();
			System.out.println("plz enetr cost of item ");
			float a=sc.nextFloat();
			System.out.println("plz enetr quantity of item ");
			int qut=sc.nextInt();
			sc.nextLine();
			
			x[i]=new itemDetail(name,a,qut);
		}
		
		/*for(itemDetail val:x) {
			System.out.println(val);
			System.out.println("______________");
			} */
		//obj.show(x);
		obj.samecost(x);
	}      
}



			
		
		
	
	
