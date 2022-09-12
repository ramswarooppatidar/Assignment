package com.String;

public class First_non_repeating {
	public void nonRepeted(String s) {
		//abacddbec
		String str[]=s.split("");
    	int k=0;
    	int j=0;
    	System.out.println("reading: "+str[0]);
    	System.out.println("first non-repeting charecter so far is: "+str[k]);
    	for(int i=1;i<str.length;i++) {
    		System.out.println("reading: "+str[i]);
    		if(str[k].equals(str[i])) {
    			j=k;
    			k+=1;
    		System.out.println("first non-repeting charecter so far is: "+str[k]);
    		}
    		else
    			System.out.println("first non-repeting charecter so far is: "+str[k]);
    	}
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First_non_repeating obj = new First_non_repeating();
		obj.nonRepeted("abacddbec");
	}

}
