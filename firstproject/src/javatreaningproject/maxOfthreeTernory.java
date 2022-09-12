package javatreaningproject;
import java.util.Scanner;
class MaximumNumber{
	public void MaximumofThree(int a,int b,int c) {
		if(a>b && a>c) {
			System.out.println("number1 A IS maximum "+a);
		}
		else if(b>c) {
			System.out.println("number2 A IS maximum "+b);
		}
		else
			System.out.println("number3 A IS maximum "+c);
	}
	public void ternoryOperator(int a,int b,int c) {
		String maximum = a>b && a>c ? a+" is a maximum number" :
			                            b>c?b +" is a maximum number":c +"is a maximum number";
			                            System.out.println(maximum);                         
	}
	public void ternoryMinimum(int a,int b,int c) {
		int minimum = a<b && a<c ? a : b<c ?b:c;
		System.out.println("minimum number is "+minimum);
	}
	public void ternory4number(int a,int b, int c,int d) {
		String maximum = a>b && a>c && a>d ? a+"  : is maximum number" :
			                           b>c && b>d ? b+" : is maximum number":
			                        	   c>d ? c +" : is maximum number" :d +" : is a maximum number";
			        System.out.println(maximum);
	}
}
public class maxOfthreeTernory {
	public static void main(String[] args) {
		int num1,num2,num3,num4;
		MaximumNumber m = new MaximumNumber();
		Scanner sc=new Scanner(System.in);
		System.out.println("pls enter num1");
		num1=sc.nextInt();
		
		System.out.println("pls enter num2");
		num2=sc.nextInt();
		
		System.out.println("pls enter num3");
		num3=sc.nextInt();
		System.out.println("pls enter num4");
		num4=sc.nextInt();
		
		//m.MaximumofThree(num1, num2, num3);
		//m.ternoryOperator(num1, num2, num3);
		//m.ternoryMinimum(num2, num3, num1);
		m.ternory4number(num1, num2, num3, num4);
		String maximum =num1>num2 && num1>num3?num1+
				" num1 s maximum":num2>num3?num2+" num2 is maximum":num3+" num3 is maximum";
		//System.out.println(maximum);
	}
	

}

// no1=8
//no2= 12
//no3 = 3