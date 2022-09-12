package assignmentJava;
import java.util.Scanner;
class patternd{
	public void ptrn(int row) {
		for(int i=1;i<=row;i++) {
			for(int space =row-i;space>0;space--) {
				System.out.print(1);
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
	}
}

public class NewPatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		patternd p = new patternd();
		System.out.println("enter number of row");
		int row = sc.nextInt();
		p.ptrn(row);

	}

}
