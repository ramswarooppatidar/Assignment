package com.company;
import java.util.Scanner;
public class CWH_19_PS {
    public static void main(String[] args) {
  //      byte m1,m2,m3;
  //      Scanner sc = new Scanner(System.in);
  //      System.out.println("enter your marks in physics");
  //      m1= sc.nextByte();
  //      System.out.println("enter your marks in chemistry");
  //      m2= sc.nextByte();
  //      System.out.println("enter your marks in maths");
  //      m3= sc.nextByte();
  //      float avg=(m1+m2+m3)/3.0f;
  //      System.out.println("your over all percentage is:" + avg);
  //      if(avg>=40 && m1>=33 && m2>=33 && m3>=33) {

  //          System.out.println("you are passed");
  //      }
  //      else{
  //          System.out.println("you are fail");
  //      }
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your income");
        float tax=0;
        float income=sc.nextFloat();
        if(income<=2.5f){
            tax=tax+0;
        }
        else if(income>2.5f && income<=5.0f){
        tax=tax+ 0.05f*(income-2.5f);
    }
        else if(income>5f && income<=10f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 2.5f);
        }
        else if(income>10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5f);
            tax = tax + 0.3f * (income - 10.0f);
        }
        System.out.println("the total tax is paid by empoyers is:" + tax);



        }
}
