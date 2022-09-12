package com.Day3AssignmentClass;
import java.util.Scanner;
public class semester {
	float m1,m2,m3;
	semester finalRasult;
	public void acceptMarks(float m1,float m2,float m3) {
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	/*public void showResult(semester obj1,semester obj2) {
		exam e =new exam();
		System.out.println(" marks obj1 & obj2 of m1 is "+(obj1.m1+obj2.m1));
		System.out.println(" marks obj1 & obj2 of m2 is "+(obj1.m2+obj2.m2));
		System.out.println(" marks obj1 & obj2 of m3 is "+(obj1.m3+obj2.m3));
		System.out.println("total sum of pbj1 and obj2 is "+e.calculateResult(obj1, obj2));
		
		
	}*/
	public void showResult(semester obj2) {
		exam e =new exam();
		System.out.println(" marks obj1 & obj2 of m1 is "+(m1+obj2.m1));
		System.out.println(" marks obj1 & obj2 of m2 is "+(m2+obj2.m2));
		System.out.println(" marks obj1 & obj2 of m3 is"+ (m3+obj2.m3));
		System.out.println("total sum of pbj1 and obj2 is "+e.calculateResult(this, obj2));
		
		
	}
	public static void main(String[] args) {
		semester s1=new semester();
		semester s2=new semester();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("pls enter number of marks obj.m1");
		float m1=sc.nextFloat();
		System.out.println("pls enter number of marks obj.m2");
		float m2=sc.nextFloat();
		System.out.println("pls enter number of marks obj.m3");
		float m3=sc.nextFloat();


		
		s1.acceptMarks(m1,m2,m3);
		
		System.out.println("pls enter masks for obj2.m1 ");
		 m1=sc.nextFloat();
		System.out.println("pls enter number of marksobj2 m1");
		 m2=sc.nextFloat();
		System.out.println("pls enter number of marksobj2 m1");
		 m3=sc.nextFloat();
		

		s2.acceptMarks(m1,m2,m3);
		//s1.showResult(s1,s2);
		s1.showResult(s2);
	}
public class exam{
	    
		public float calculateResult(semester obj1 ,semester obj2) {
			
			semester finalRasult=new semester();
			finalRasult.m1 =obj1.m1+obj2.m1;
			finalRasult.m2 =obj1.m2+obj2.m2;
			finalRasult.m3 =obj1.m3+obj2.m3;
		    
			
			return finalRasult.m1 + finalRasult.m2 + finalRasult.m3;
			
		}
}
		
		
		

}
