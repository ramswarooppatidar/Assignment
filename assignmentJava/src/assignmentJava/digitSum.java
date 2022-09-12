package assignmentJava;
import java.util.Scanner;
class minimumDigit{
	public void mimimum(int num) {
		int remendar;
		int sum=0;
		int min=9;
		while(num>0) {
			remendar=num%10;
			sum=sum+remendar;
			if(remendar<min) {
				min=remendar;
			}
			num=num/10;
		}
		System.out.println("minimum number is "+min);
		System.out.println("sum of digitr is "+sum);
		
		
	}
}
public class digitSum {
	public static void main(String[] args) {
		System.out.println("please enter digit you want to calculate sum");
		int num,remendar;
		int sum=0;
		Scanner sc= new Scanner(System.in);
		num=sc.nextInt();
		minimumDigit m = new minimumDigit();
		m.mimimum(num);
		while(num>0) {
			remendar=num%10;
			sum=sum+remendar;
			num=num/10;
		}
		System.out.println("sum of digit is="+sum);
		
	}

}
