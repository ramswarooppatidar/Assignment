package com.company;

public class CWH_27_ARRAYS {
    public static void main(String[] args) {
        // arrays length
         int[] num={100,70,80,71,98};
         float[] marks={100,70,80,71,98};
   //      String[] students={"harry", "ram","katariya"};
  //      System.out.println(num.length);
       System.out.println(marks.length);
   //     System.out.println(students.length);
   //     System.out.println(students[2]);


//  displaying using for loopk
 //       System.out.println("printing using for loop");
 //       for(int i=0;i<marks.length;i++){
 //           System.out.println(marks[i]);   // arrays trevarsl

        //reverce order
       // for(int i=marks.length-1;i>=0;i--){
       //     System.out.println(marks[i]);


  // FOR EACH LOOP
        for(float element:marks){
            System.out.println(element);

        }

    }
}
