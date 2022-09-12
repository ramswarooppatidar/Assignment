package javatreaningproject;
import java.util.Scanner;
public class percentage {
	public static void main(String[] arg) {
		float m;
		float py;
		float ch;
		float percentage;
		float avg;
		Scanner Sc= new Scanner(System.in);
		System.out.println("out of marks 150 ");
		System.out.println("ENTER MARKS OF MATHS:");
		m = Sc.nextFloat();
		System.out.println("out of marks 170");
		py = Sc.nextFloat();
		System.out.println("out of marks 200");
		ch = Sc.nextFloat();
		percentage=  (m+py+ch)/420*100;
		System.out.println("percentage is :"+percentage);
		
	}
}
