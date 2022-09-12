package com.lct7Arrays;
import java.util.Scanner;
import java.util.Arrays;
 class Two_2D_Array{
	 // 1 ADDITION OF TWO MATRIX
	 public void additionOfMatrix(int a[][],int b[][]) {
		 int c[][] = new int[100][100];
		 int sum=0;
		 for(int i=0;i<a.length;i++) {
			 for(int j=0;j<a[i].length;j++) {
				 c[i][j] = a[i][j]+b[i][j];
				 
			 }
		 }
		 System.out.print("addition of two matrix is ");
		 for(int i=0;i<a.length;i++) {
			 for(int j=0;j<a[i].length;j++) {
				 System.out.print(c[i][j]+" ");
				 
			 }
			 System.out.println("");
		 }

	 }
	 //2 SUBSTRACTION OF TWO MATRIX;
	 public void substraction(int a[][],int b[][]) {
		 int c[][]= new int[100][100];
		 for(int i=0;i<a.length;i++) {
			 for(int j=0;j<a[i].length;j++) {
				 if((i+j)%2==0) {
					 c[i][j]=a[i][j]-b[i][j];
				 }
				
			 }
		 }
		 System.out.println("substraction of even place");
		 for(int i=0;i<a.length;i++) {
			 for(int j=0;j<a[i].length;j++) {
				 System.out.print(c[i][j]+" ");
				 
			 }
			 System.out.println("");
		 }
	 }
	 //3 UPPER TRAINAGLE/lowe traingle
	 public void upperTraingle(int a[][]) {
		 int c[][]= new int[100][100];
		 for(int i=0;i<a.length;i++) {
			 for(int j=0;j<a[i].length;j++) {
				 if(i<=j) {
					 c[i][j]=a[i][j];
				 }
			 }
		 }
		 for(int i = 0;i<a.length;i++) {
			 for(int j = 0;j<a[i].length;j++) {
				 System.out.print(c[i][j]+" ");
			 }
			 System.out.println("");
		 }
	 }
	 //4 coloum/row sum only for square matrix
	 public void coloumSum(int a[][]) {
		 int c[] = new int[10];
		 int r[] = new int[a.length];
		 for(int i=0;i<a.length;i++) {
			 int sumc = 0;
			 int sumr = 0;
			 for(int j=0;j<a[i].length;j++) {
				sumc += a[j][i];
				sumr += a[i][j];
			 }
			 c[i]=sumc;
			 r[i]= sumr;
			 
		 }
		 System.out.println("sum of each colom is ");
		 System.out.println(Arrays.toString(c));
		 System.out.println("sum of each row is ");
		 System.out.println(Arrays.toString(r));
	 }
	 
	 //5 coloum sum for any matrix
	 public void coloumSum2(int a[][],int col) {      //it is difficult to by calla method thriugh main
		 int c[] = new int[col];                //because loop run totaly different way , we need number 
		 int r[] = new int[a.length];         //row number
		 for(int i=0;i<col;i++) {             //  or colum number
			 int sumc = 0;
			 int sumr = 0;
			 for(int j=0;j<a.length;j++) {
				sumc += a[j][i];
				//sumr += a[i][j];
			 }
			 c[i]=sumc;
			// r[i]= sumr;
			 
		 }
		 System.out.println("sum of each colom is ");
		 System.out.println(Arrays.toString(c));
		// System.out.println("sum of each row is ");
		// System.out.println(Arrays.toString(r));
	 }
	 //6 MULTIPICATION OF TWO MATRIX
	 public void multiplication(int a[][],int b[][]) {
		 int c[][] = new int[3][3];
		 for(int i=0;i<a.length;i++) {
			 for(int j=0;j<a[i].length;j++) {  //j goes to number of col times of b matrix
				 int sum=0;
				 for(int k=0;k<a[i].length;k++) {
					 
					 sum += a[i][k]*b[k][j]; 
				 }
				 c[i][j] = sum;
				 }
		 }
		 System.out.println("multiplication of matrix is");
		 for(int i=0;i<c.length;i++) {
			 for(int j=0;j<c[i].length;j++) {
				 System.out.print(c[i][j]+" ");
				 
			 }
			 System.out.println("");
		 }
	 }
	 //7 right/left diagonal sum
     public void sumOfDiagonal(int a[][]) {
    	 int sum=0;
    	 int sum1 =0;
    	 for(int i=0;i<a.length;i++) {
    		 
    		 for(int j=0;j<a[i].length;j++) {        //if(i+j==a.length-1)
    			 if(i==j)
    			 {
   				  sum += a[i][j];
   			     }
    			 if(i+j==a.length-1)	 
    			 {
    				  sum1 += a[i][j];
    			 }
    		 }
    	 }
    	 System.out.println("sum of right diagonal element is "+sum);
    	 System.out.println("sum of left diagonal element is "+sum1);
     	
     }
	 
					 
				 
	
}
public class All__2D__ArrayProblems {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int d[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int e[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int f[][]  =  {{1,2,3},{4,5,6}};
		int g[][]  =  {{1,2,3,4},{4,5,6,7}};
		int h[][]  =  {{1,2},{4,5},{6,7},{8,9},{10,11}};
		int i[][]  =  {{1,2,67},{4,5,4},{6,7,35},{8,9,25},{10,11,55}};

	/*	int row = sc.nextInt();
		System.out.println("plese enter number of row");
		int col = sc.nextInt();
		int a[][] = new int[row][col];
		System.out.println("plese enter element of matrix 1");
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("plese enter number of row");
		int row2 = sc.nextInt();
		System.out.println("plese enter number of row");
		int col2 = sc.nextInt();
		int b[][] = new int[row2][col2];
		System.out.println("plese enter element of matrix 2");
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<a[i].length;j++) {
				b[i][j]=sc.nextInt();
				
			}
		}*/
		Two_2D_Array obj = new Two_2D_Array();
       // obj.additionOfMatrix(d,e);
       // obj.substraction(d,e);
       // obj.upperTraingle(d);
       // obj.coloumSum(d);
       // obj.coloumSum2(f);
       // obj.coloumSum2(g,4);
       // obj.coloumSum2(h,2);
       // obj.coloumSum2(i,3);
       // obj.multiplication(d,e);
		obj.sumOfDiagonal(d);
	}

}
