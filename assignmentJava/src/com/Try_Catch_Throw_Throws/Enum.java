package com.Try_Catch_Throw_Throws;
enum Flag{
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY


}
public class Enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Flag f =  Flag.MONDAY;
     switch(f) {
     case MONDAY :
     case TUESDAY:
     case WEDNESDAY:
     case THURSDAY:
     case FRIDAY: System.out.println("WORKING DAY");
                  break;
     case SATURDAY:
     case SUNDAY:System.out.println("WEEKEND");
    	 
     }
	}

}
