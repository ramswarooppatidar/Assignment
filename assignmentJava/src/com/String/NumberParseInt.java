package com.String;

public class NumberParseInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str[]= {"ram","shyam","rohan"};
   /*   for(int i=0;i<str.length;i++) {
    	  int num = Integer.parseInt(str[1]);
      }*/
      
      
      String str1[]= {"35","45","60"};
      for(int i=0;i<str1.length;i++) {
    	  int num = Integer.parseInt(str1[i]);
    	  System.out.println(num);
      }
      
      
      String str2[]= {"ram","32","13","shyam","12","rohan"};
      char ch[]= str2[0].toCharArray();
      int sum=0;
      for(int i=0;i<str2.length;i++) {
    	 try {
    		 
    		 int num = Integer.parseInt(str2[i]);
    		 System.out.println("only print number "+num);
    		 sum += num;
    	 }
    	 catch(Exception e) {
    		 continue;
    	 }
    	 finally {
    		 System.out.println("sum is. "+sum);
    	 }
      }
 
	}

}
