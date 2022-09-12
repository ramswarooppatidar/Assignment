//calulator
package assignmentJava;
import java.util.Scanner;
public class Switch {
	public static void main(String[] args) {
		float num1,num2;
		int choice;
		int i=0;
		while(i<3) {
				System.out.println("please select your choice 1,2,3,4");
				System.out.println("1. add"+"\n2. Sub"+"\n3. Multi"+"\n4. Div");
				System.out.println("------------------------");
		
		
		
				Scanner sc=new Scanner(System.in);
				choice=sc.nextInt();
	    switch(choice)
		{
		case 1:
			System.out.println("please enter first number");
			num1=sc.nextFloat();
			System.out.println("please enter second number");
			num2=sc.nextFloat();
			
			System.out.println("sum of two number is:"+(num1+num2));
		break;
		
		case 2:
			System.out.println("please enter first number");
			num1=sc.nextFloat();
			System.out.println("please enter second number");
			num2=sc.nextFloat();
		
			System.out.println("sub of two number is:"+(num1-num2));
		break;
		
		case 3:
			System.out.println("please enter first number");
			num1=sc.nextFloat();
			System.out.println("please enter second number");
			num2=sc.nextFloat();
			System.out.println("multipication of two number is:"+(num1*num2));
		
		break;
		
		case 4:
			System.out.println("please enter first number");
			num1=sc.nextFloat();
			System.out.println("please enter second number");
			num2=sc.nextFloat();
			System.out.println("division of two number is:"+(num1/num2));
		
		break;
		
		default:
			System.out.println("please select correct choice");
		
		}
		 
		i++;
		}
		
		
		
	}

}
