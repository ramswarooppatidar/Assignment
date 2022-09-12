package com.company;
import java.util.Scanner;
public class CWH_29_ARRYPS6{
    public static void main(String[] args) {
        // practice problem 1
      /*  float[]marks = {45.7f,56.4f,67.6f,99.5f,34.8f};
        float sum=0;
        for(float element:marks){
            sum=sum+element;
        }
        System.out.println("the value of sum is :");
        System.out.println(sum); */


        // practice problem 2 given number is in arrrays
      /*  float[]marks = {45.7f,56.4f,67.6f,99.5f,34.8f};
        float num=45.7f;
        boolean isInArray=false;

        for(float element:marks){
            if(num==element){
                isInArray=true;
                break;


            }
        }
        if(isInArray){
            System.out.println("value present in the arrays");
        }
        else{
            System.out.println("the value is not present in the arrrays");  */

        //   float[]marks = {45.7f,56.4f,67.6f,99.5f,34.8f};
        //   float sum=0;
        //   float avg;
        //       for(float element:marks){
        //       sum=sum+element;
        //  }
//        System.out.println("the value of sum is :" +  sum );
        //      System.out.println(avg);
    /*    int[][] mat1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] mat2 = {{1, 2, 3}, {4, 5, 6}};
        int[][] result = {{0, 0, 0},{0, 0, 0,}};
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.format("setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        for (int i = 0; i < mat1[i].length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.print(result[i][j] + " ");
               // result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(" ");  // print new line
        }  */


        // write java program to revrce
     /*   int kat[]={1,2,3,4,5,6};
        int temp;
        for(int i=0;i<3;i++){
            temp=kat[i];
            kat[i]=kat[5-i];
            kat[5-i]=temp;
        }for(int element:kat){
            System.out.print(element +" ");
        } */

   // practice problem6
     /*   int kat[]={1,2,3,4,5,6};
        int max=0;              // integer.MIN_VALUE;
        for(int e:kat){
            if (e > max) {
                max =e;
            }
        }System.out.println("maximum value of this arry is :" + max);  */


  // PRACTICE PROBLEM 7
 /* int arr[]={1,2,3,4,5,6,7,8,9};
  int min=Integer.MAX_VALUE;
  for(int e:arr){
      if(e<min){
          min=e;
      }
  }System.out.println(" the minimum number in that aarry is:" +min); */
        boolean IsSorted=true;
        int [] arr={1,4,2,6,3,9,6,5};
        for(int i=0;i<arr.length;i++){
            if (arr[i]>arr[i+1]) {
                IsSorted = false;
                break;
            }
                if(IsSorted){
                    System.out.println("array is sorted ");
                }else{
                    System.out.println("array is not sorted");
                }}

            }
        }

