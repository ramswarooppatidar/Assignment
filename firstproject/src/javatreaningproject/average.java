
package javatreaningproject;
import java.util.Scanner;
public class average {
	public static void main(String[] arg) {
		float m;
		float py;
		float ch;
		float avg;
		Scanner Sc= new Scanner(System.in);
		System.out.println("enter a marks of PCM ");
		System.out.println("ENTER MARKS OF MATHS:");
		m = Sc.nextFloat();
		System.out.println("ENTER MARKS OF PHYSICS:");
		py = Sc.nextFloat();
		System.out.println("ENTER MARKS OF CHEMISTRY:");
		ch = Sc.nextFloat();
		avg=(m+py+ch)/3;
		System.out.println("average marks of PCM IS : "+avg);
		
		
		
		
		
	}

}
