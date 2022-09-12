package com.String;
import java.util.Arrays;
import java.lang.String;
import java.lang.reflect.Array;
import java.io.*;
import java.util.Scanner;
class problemSolvingString{
	//1 palindrome
	public void chack_palindrome(String s) {
		String revrce="";
		for(int i=s.length()-1;i>=0;i--) {
			revrce+=s.charAt(i);
		}
		if(revrce.equals(s)) {
			System.out.println("string "+s+" is a palindrome ");
		}
		else
			System.out.println("not a palindrome");
	}
	// 2 palindrome2
	public void chackPalindrome(String s) {
		String chack ="";
		String chack2 = "";
		//String chack3 = "";
		
		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)!=' ' &&s.charAt(i)!='.' && s.charAt(i)!=',')
			chack +=s.charAt(i);
		
		}
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ' &&s.charAt(i)!='.' && s.charAt(i)!=',')
			chack2 +=s.charAt(i);
			//chack3 += s.charAt(chack.length()-1-i);
		
		}
		if(chack.equals(chack2)) {
			System.out.println("is a palindrome");
		}
		else
			System.out.println("not a palindrome");
	}
	//3chack number is palindrome or not
	public void chackNumberIsPalindrome(int num) {
		String s = Integer.toString(num);
		String empty = "";
		int r;
		int cnt=0;
		while(num>0) {
			r= num%10;
			empty += r;
			num = num/10;
			
		}
		if(s.equals(empty)) {
			System.out.println("palindrome");
			
		}
		else {
			System.out.println("not palindrome");
		}
	}
	//4 reverse a string ram kat to  kat ram
	public void reverce(String str) {
		int j=0;
		String splitArray[] = str.split(" ");
		System.out.println(splitArray.length);
		for ( int i=splitArray.length-1;i>=0;i--) {
			System.out.print(splitArray[i]+" ");
			j++;
			
		}
		System.out.print("\n"+j);
	}
//5 frequency+repeted element+non repetd element print   ***********
	public void frequencey(String str) {
		
		
		String ch[] = str.split(" ");  //two program 1 ="",2=" "   *********
	System.out.println(Arrays.toString(ch));
	int fr[] = new int[ch.length];
	for(int i=0;i<ch.length;i++) {
		fr[i]=1;
	}
	for( int i=0;i<ch.length-1;i++) {
		int cnt=1;
		for(int j=i+1;j<ch.length;j++) {
			if(ch[i].equals(ch[j])) {
				cnt++;
				fr[j]=0;    //ch[j] also be deleted
				//fr[i]=cnt;
				//ch[j]=" ";
				 
			}
		}
		if(fr[i]!=0) {
			fr[i]=cnt;
		}
		
		
			}
	System.out.println(Arrays.toString(fr));
	for(int i=0;i<fr.length;i++) {
		if(fr[i]!=0) {                     
			System.out.println(ch[i]+" occurance "+fr[i]+" times");
		
		}
    //find first non repeted charechtor
	/*for( i=0;i<fr.length;i++) {
		if(fr[i]==1) {
			System.out.println(ch[i]+" occurance "+fr[i]+" times");
			break;
		}*/
		
  //repeted element print
		/*for( i=0;i<fr.length;i++) {
		if(fr[i]!=0 && fr[i]!=1) {
			System.out.println(ch[i]+" occurance "+fr[i]+" times");
			break;
		}*/

	}
}
//6 sum of digit in string
	public void sumOfStringNum(String str) {
		char ch[] = str.toCharArray();
		int sum = 0;
		for(int i=0;i<ch.length;i++) {
			if(Character.isDigit(ch[i])) {
				int a=Integer.parseInt(String.valueOf(ch[i]));
				
				sum += a;
			}
		}
		System.out.println("(method1)sum of digit present in string is "+sum);
		
	}
// 7 sum of digit method 2
	public void sumOfStringNum2(String str) {
		int sum =0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='0' && str.charAt(i)<='9' ) {
			  //character convert into string and than ineteger ,tham we can add in interger
				 sum= sum+Integer.parseInt(String.valueOf(str.charAt(i)));
			}
		}
		System.out.println("(method 2) sum of digit present in string is "+sum);
	}
// 8 continue sum of digit string
	public void stringsumOfContinueDigit123(String s) {
		char ch[]= s.toCharArray();
		System.out.println(ch);

		String temp = "0";
		int sum = 0;
		for(int i=0;i<ch.length;i++) 
		{
			if(Character.isDigit(ch[i])) {
				temp += ch[i];
				System.out.println(ch[i]);
				//sum+=Integer.parseInt(temp);
				System.out.println("if block 1...."+sum);

				if(i==s.length()-1) {
					sum+=Integer.parseInt(temp);
					System.out.println("if block 2...."+sum);
					
				}
			}
			else
				{
					System.out.println("else block "+temp);
					

					sum += Integer.parseInt(temp);
				    temp="0";
				 }
				
			}
		System.out.println("(method3)"+"string continue digit sum is "+sum);
		
		
	}
	public int StringSumDigit(String s) {
		String temp="0";   //*****
		int sum=0;
		for (int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(Character.isDigit(ch)) {
				temp += (ch);
				System.out.println(ch);
				System.out.println(temp);
                if(i==s.length()-1) {
                	sum += Integer.parseInt(String.valueOf(temp));
                	System.out.println("sum is "+sum);
                }
			}
			else
				{System.out.println(temp);

				sum += Integer.parseInt(String.valueOf(temp));
			//System.out.println("else block "+sum);
				temp ="0";}
		}
		return sum;
	}
//10 shorting of string	
	public void shorting(String s) {
		char ch[] = s.toCharArray();
		char temp;
		System.out.println(Arrays.toString(ch));
		for(int i=0;i<ch.length-1;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]>ch[j]) {
					temp = ch[j];
					ch[j] = ch[i];
					ch[i]=temp;
				}
				
			}
		}
		System.out.println(Arrays.toString(ch));

	}
	public void sum(String s) {
		int sum=0;
		for (int i =0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(Character.isDigit(ch)) {
				sum += Character.getNumericValue(ch);
			}
		}
		System.out.println("sum of string digit is"+sum);
	}
	public void reverceString(String str) {
		int j=0;
		String splitArray[] = str.split(" ");
		System.out.println(splitArray.length);
		for ( int i=splitArray.length-1;i>=0;i--) {
			System.out.print(splitArray[i]+" ");
			j++;
			
		}
		System.out.print("\n"+j);
	}
	public void decodeString(String s) {
		
		for(int i=0;i<s.length();i++) {
			char ch =s.charAt(i);
			  int c= (int)ch+2;
			
			  System.out.print((char)c+" ");
		}
	}
	public String secondMaximum(String s) {
		//char ch[] = s.toCharArray();
		String ch[]=s.split(" ");
		System.out.println(Arrays.toString(ch));
		int j=0;
		int a[]= new int[ch.length];
		for(int i=0;i<ch.length;i++)
		{
			a[i]=Integer.parseInt(ch[i]);
			System.out.println("array a "+a[i]);
		}
		int max = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
				j=i;
			}
		}
		int maxSecond=0;
		for(int i=0;i<a.length;i++) {
			if(i==j) {
				continue;
			}
			if(a[i]>maxSecond) {
				maxSecond=a[i];
			}
		}
		String input_from_question="";
		input_from_question = (max) +"\n"+maxSecond;
		//System.out.println(input_from_question);
		return input_from_question;
	}
	public String dublication(String str) {
		char ch[]=str.toCharArray();
		String input_from_question ="";
		int cnt=1;
		for(int i=0;i<ch.length-1;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					cnt++;
				}
				if(cnt>1) {
					input_from_question += ch[i]+"\n";
					cnt=1;
				}
			}
		}
		return input_from_question;
	}
	public void vowelReplace(String s) {
		String str = s.toLowerCase();
		char ch1[]= new char[s.length()];
		for(int i=0;i<s.length();i++) {
			char ch = str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				ch='*';
				ch1[i]=ch;
			}
			else
				ch1[i]=ch;
		}
		System.out.println(Arrays.toString(ch1));
	}
	
   public void oddLengthwordReverce(String s) {
	  // String upr =s.toUpperCase();
	   String []str = s.split(" ");
	  // String empty="";
	   String ept2 = "";
	   for(int i=0;i<str.length;i++) {
		   if(str[i].length()%2==0) {
			   System.out.println(str[i]);
			   ept2 += str[i]+" ";
		   }
		   else {
			       // System.out.println(str[i]);

		          // empty += str[i];
	   
			   for(int j=str[i].length()-1;j>=0;j--) {
				   ept2 += str[i].charAt(j);
				   
			   }
			  // empty ="";
			   ept2 += " ";
		   }
	   }
	   System.out.println(ept2);
   }
   public void anaaGram(String s,String s1) {
	   char ch[]= s.toCharArray();
	   char ch1[] = s1.toCharArray();
	   boolean flag = true;
	   for(int i=0;i<ch.length-1;i++) {
		   for(int j=i+1;j<ch.length;j++) {
			   if(ch[i]<ch[j]) {
				   char temp = ch[j];
				   ch[j]=ch[i];
				   ch[i]=temp;
			   }
			   if(ch1[i]<ch1[j]) {
				   char temp1 = ch1[j];
				   ch1[j]=ch1[i];
				   ch1[i]=temp1;
			   }
			   
		   }
	   }
	   for(int i=0;i<ch.length;i++) {
		   if(ch[i]!=ch1[i]) {
			   flag = false;
		   }
	   }
	   System.out.println(Arrays.toString(ch));
	   System.out.println(Arrays.toString(ch1));
	   if(flag) {
		   System.out.println("Yes : is anagram");
	   }
	   else
		   System.out.println("Not");
	   
   }
   public void divideInNpart(String s,int a) {
	   int num = s.length()/a;
	   System.out.println(num);
	   String empty="";
	   for(int i=0;i<s.length();i++) {
		  if(i==0) {
			   empty += s.charAt(i);
		   }
		  else if (i%3==0) {
			  empty += " "+s.charAt(i);  
		  }
		  
	     else {
		      empty+=s.charAt(i);
		     }
	   }
	   System.out.println(empty);
   }
   public void divideInNpart2(String s,int a) {
	   int num = s.length()/a;
	   if(s.length()%num!=0) {
		   System.out.println("stringh length not divisible by "+num);
	   }
	   else {
		   for(int i=0;i<s.length();i++) {
			   
				  // System.out.print(s.charAt(i));

			   
			   if(i%num==0) {
				   System.out.println();
			   }
			   System.out.print(s.charAt(i));
		   }
	   }
   }
   public void space(String s) {
	   String str[] = s.split(" ");
	   //System.out.println(str);
	  // String str1 = s.split(" ");
	   System.out.println(Arrays.toString(str));
	   int i;
	   int k;
	   int j;
	   String empty="";
	   
		 System.out.println(str.length);

		 System.out.println(str[3].length());
	   for( i=0;i<str.length;i++) {
		   empty += str[i];
		   k = (i+1);
		    
		    for( j=0;j<k;j++) {
		       if(i==str.length-1)
		    	   break;
			   empty += "_"; 
		   }
     }
	   System.out.println(empty);
   }
   public void addSpaces(String s) {
	   String str[]= s.split("");
	   int cnt=0;
	   for(int i=0;i<str.length;i++) {
		   System.out.println(str);
		   cnt++;
		   if(cnt==str.length-1) {
			   break;
		   }
		   int k=cnt*3;
		   for( int j=0;j<k ;j++) {
			   System.out.print("_");
		   }
	   }
	   
   }
   //first non repeted elements
  /* String: godisgood
   Reading: g
   The first non-repeating character so far is:  g
   Reading: o
   The first non-repeating character so far is:  g
   Reading: d
   The first non-repeating character so far is:  g
   Reading: i
   The first non-repeating character so far is:  g
   Reading: s
   The first non-repeating character so far is:  g
   Reading: g
   The first non-repeating character so far is:  o
   Reading: o
   The first non-repeating character so far is:  d
   Reading: o
   The first non-repeating character so far is:  d
   Reading: d
   The first non-repeating character so far is:  i
    */
    public void firstNonRepeted(String s) {
    	//RAMSWAROOP
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
    public void printeachCharFromSameIndex(String s) {
    	String str[] = s.split(" ");
    	int maxLength=0;
    	for(int m=0;m<str.length;m++) {
    		 maxLength=str[m].length();
    		if(maxLength<str[m].length()) {
    			maxLength = str[m].length();
    		}
    	}
    	for(int o=0;o<maxLength;o++) {
    		for(int i=0;i<str.length;i++) {
    			System.out.println(str[i].charAt(o));
    			if(i<str[i].length()) {
    				
    			}
    		}
    	}
    	/*for(int i=0;i<str.length;i++) {
    		
    		for(int j=0;j<str[i].length();) {
    			
    			for(int k=0;k<str.length;) {
    				
    				System.out.print(str[k].charAt(i));
    				j++;
    				if(k<str[j].length()) {
    				System.out.println(str[j])	
    			}
    			}
    		}
    	}  */ 
    }
   
}

public class AllStringProblems {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		problemSolvingString s = new problemSolvingString();
		int k=0;
	
			System.out.println("plz enetr a String");
			String str = sc.nextLine();
			s.frequencey(str);
			//s.chackNumberIsPalindrome(k);
			//s.sumOfStringNum(str);
//			//s.sumOfStringNum2(str);
			//s.StringSumDigit(str);
			//s.shorting(str);
			//System.out.println("\ncontinue digit sum is "+s.StringSumDigit(str));
			//s.decodeString(str);
			//s. vowelReplace(str);
			//s.oddLengthwordReverce(str);
			//s.anaaGram(str, "keep");
			//s.anaaGram("maann", "naman");
			//s.divideInNpart(str, 3);
			//s.divideInNpart2(str, 4);
			//s.space(str);
			//s.firstNonRepeted(str);
		//	s.printeachCharFromSameIndex(str);
			
			
		
		
		
	}

}
