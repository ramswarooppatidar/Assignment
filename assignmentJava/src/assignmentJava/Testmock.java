package assignmentJava;
import java.util.Scanner;
public class Testmock {
	public static void main(String[]args) {
		int a[]=new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter array elements");
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
	
		for(int i=0;i<a.length;i++) {
			if(a[i]==1 && a[i]==2) {
				System.out.println("is prime number");
			}
			boolean flag = true;
			for(int j=2;j<=a[i]/2;j++) {
				if(a[i]%j==0) {
					
					flag = false;
					break;
				}
				
			}
			if(flag==false) {
				System.out.println(a[i]+ " not a prime number");
			}
			else
				System.out.println(a[i]+ " is prime number");
		}
		}

}
