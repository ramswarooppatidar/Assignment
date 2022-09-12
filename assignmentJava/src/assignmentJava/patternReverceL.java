package assignmentJava;
import java.util.Scanner;
public class patternReverceL {
	public void reverceL(int row) {
		
		for(int i=1;i<=row;i++) 
		{
			for(int spc=1;spc<i;spc++) {
				System.out.print(" ");
				}
			for(int j=1;j<=row-i+1;j++) {
				System.out.print("*");
			}
			System.out.println("\n");
			
		
			
		}
		
	}
	public static void main(String[]args) {
		int row;
		System.out.println("plz enter number of row you want to print");
		Scanner sc =new Scanner(System.in);
		row=sc.nextInt();
		patternReverceL p=new patternReverceL();
		p.reverceL(row);
	}
   
}
