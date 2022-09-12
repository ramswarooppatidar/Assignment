package com.lct7Arrays;
import java.util.Scanner;
public class TwoDArray {
	int row,col;
	int num[][]=new int[row][col];
	public void showArray() {
		for(int i=0;i<row;i++) {
			for(int j=1;j<col;j++) {
				System.out.print(num[i][j]+" ");
			}
			System.out.println("\n");
		}
	}
	public void acceptElementsinArrays() {
	
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("how many row you want to print:");
		row=sc.nextInt();
		col=sc.nextInt();
		for(int i=0;i<row;i++)
			{
			for(int j=0;j<col;j++) {
				num[i][j]=sc.nextInt();
			}
			
			}

			
		
}
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row;
	
		/*System.out.println("how much row you want to print");
		row= sc.nextInt();
		System.out.println("how much colom you want to print");
*/		TwoDArray d=new TwoDArray();
		d.acceptElementsinArrays();
		d.showArray();
		
		
	}

}
