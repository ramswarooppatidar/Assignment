package com.Try_Catch_Throw_Throws;



class ItemStockUnderFlowException extends Exception{
	public String toString() {
		return "item cannot be less than minimum";
	}
	public String getMeassage() {
		return "item shuold be greter than minimum";
	}
	
}
class ItemStockOverFlowException extends Exception{
	public String toString() {
		return "item cannot be excced than maximum";
	}
	public String getMeassage() {
		return "item cannot be greter than maximum";
	}
	
}

public class Store {
  int noOfItemAvailable;
  int maximumLevel;
  int minimumLevel;
  public Store(int a,int b,int c) {
	   noOfItemAvailable =a;
	   maximumLevel =b;
	   minimumLevel = c;
	  
  }
  public void addItem(int a)  throws ItemStockOverFlowException{
	  
	   if(noOfItemAvailable+a>maximumLevel) {
			throw new ItemStockOverFlowException ();
		}
	  
		  noOfItemAvailable += a;
		  chackStock();
		  System.out.println("update stock is"+ chackStock());

	  
	  
  }
  public void removeItem(int b)throws ItemStockUnderFlowException {
	  if(noOfItemAvailable-b<minimumLevel) {
			throw new ItemStockUnderFlowException ();
		}
	  noOfItemAvailable -= b;
	  chackStock();
	  System.out.println("update stock is"+ chackStock());
  }
  public int chackStock() {
	 
	  return noOfItemAvailable;
  }
	public static void main(String[] args) {
	
		Store obj = new Store(50,200,100);
		try {
			
			obj.addItem(25);
			obj.removeItem(30);
			
		}
		catch( ItemStockOverFlowException e) {
			System.out.println(e.getMeassage());
		}
		catch(ItemStockUnderFlowException e) {
			System.out.println(e.getMeassage());
		}

	}

}
