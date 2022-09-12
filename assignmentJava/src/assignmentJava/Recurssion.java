package assignmentJava;

public class Recurssion {
	static int sum=0; 
	public int addNumber(int n) {
		if(n !=0) {
			sum += n;
			System.out.println(sum);
			return n+addNumber(n-1);
			
		}
		else
			{
			System.out.println(n);
			return n;
			}
	}
	public int factorial(int n) {
		if(n==0) {
			
			return 1;
		}
		
		return  n*factorial(n-1);
		
	
	}
	public int powerSum(int digit, int power) {
		
		if(power==0) {
			return 1;
		}
	
		return digit*powerSum(digit,power-1);
		
	}
	public int sumOfNaturalNumber(int n) {
		if(n==1) {
			return 1;
		}
		return n+sumOfNaturalNumber(n-1);
	}
	public int fibonacci(int n) {
		if(n==1||n==2) {
			return 1;
		}
		return fibonacci(n-1)+fibonacci(n-2);
	}
	public void fibonacci1(int a,int b,int range) {
		if(a<=range) {
			System.out.print(a+" ");
			int c = a+b;
			a=b;
			b=c;
			fibonacci1(a,b,range);
		}
	}
	
	public static void main(String[] args) {
		Recurssion obj = new Recurssion();
		obj.addNumber(7);
		System.out.println(obj.factorial(5));
       // System.out.println(obj.addNumber(7));
        System.out.println(obj.powerSum(4,4));
        System.out.println(obj.sumOfNaturalNumber(4));
        obj.fibonacci1(1,2,45);
	}

}
