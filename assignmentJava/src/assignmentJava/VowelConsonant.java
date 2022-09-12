package assignmentJava;
import java.util.Scanner;
public class VowelConsonant {
	public static void main(String[] args) {
		char ch;
		
		System.out.println("plese enter a single charector");
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		System.out.println("you select = "+ch);
		
	
		
		  switch(ch)
		  {
		
		  case 'A':System.out.println(ch+"  is a vowel");
		  break;
		  case 'a':System.out.println(ch+"  is a vowel");
		  break;
		  case 'e':System.out.println(ch+"  is a vowel");
		  break;
		  case 'E':System.out.println(ch+"  is a vowel");
		  break;
		  case 'i':System.out.println(ch+"  is a vowel");
		  break;
		  case 'I':System.out.println(ch+"  is a vowel");
		  break;
		  case 'o':System.out.println(ch+"  is a vowel");
		  break;
  		  case 'O':System.out.println(ch+"  is a vowel");
  		  break;
		  case 'u':System.out.println(ch+" is a vowel");
		  break;
		  case 'U':System.out.println(ch+" is a vowel");
		  break;  
		  default:System.out.println(ch+"  is a consonant");
		  }
		}
		
		
	}


