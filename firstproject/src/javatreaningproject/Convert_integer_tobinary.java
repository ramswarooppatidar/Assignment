package javatreaningproject;
import java.util.Scanner;
class Binary{
	public void convertToBinary(int num) {
		int binary;
		//divide number by 2 and collect remainder 
		while(num>0) {
			binary = num%2;                            //  45%2=1,22%2=0,11%2=1,5%2=1,2%2=0,1%2=1
			System.out.print(binary+" ");                  
			num = num /2;                               // 45/2=22,22/2=11,11/2=5,5/2=2,2/2=1
		
		}
	}
}
public class Convert_integer_tobinary {
	public static void main(String[]args) {
		Binary b = new Binary();
		Scanner sc = new Scanner(System.in);
		System.out.println("plz enter a number");
		int num = sc.nextInt();
		b.convertToBinary(num);
		//b.convertToBinary(45);
		
	}

}
