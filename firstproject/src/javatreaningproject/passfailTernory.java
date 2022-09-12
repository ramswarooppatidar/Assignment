package javatreaningproject;
import java.util.Scanner;
public class passfailTernory {
	public static void main(String[] args) {
		int per;
		Scanner sc=new Scanner(System.in);
		System.out.println("pls enter percentage");
		per=sc.nextInt();
		
		
		String msg =per>=40?per+"you passed":per+" you faild";
		System.out.println(msg);
	}
	

}

