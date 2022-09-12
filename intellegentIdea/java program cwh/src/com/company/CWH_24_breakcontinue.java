package com.company;

public class CWH_24_breakcontinue {
    public static void main(String[] args) {
        //break and continue using
        //  for (int i=0; i < 5; i++) {
        //      System.out.println(i);
        //      System.out.println("java is great");
        //      if (i == 2) {
        //          System.out.println("end the loop");
        //          break;
        //      }
        //   }
//        int i=0;
//        while(i<5){
//            System.out.println(i);
        //           System.out.println("java is great");
        //           if(i==2){
        //               System.out.println("ending the lopp");
        //               break;
        //         }
        //         i++;
        //     }
        //    System.out.println("ending the programm");
        //      int i=0;
        //      do{
        //          System.out.println(i);
        //          System.out.println("java is great");
        //          if(i==2){
        //              System.out.println("ending the looop");
        //              break;
        //          }
        //          i++;
        //          }while(i<5);
        //      System.out.println("loop ends here");
        //      }


        // continue stetment
        // for(int i=0;i<5;i++){
     //       if(i==2) {
     //           System.out.println("escape sequence 2");
       //         continue;   //it is just to just move on next itration and aslo used to escape something
     //       }
     //       System.out.println(i);
           // System.out.println("java is great");
       //     }


        int i=0;
        do{
            i++;
            if(i==2){
                System.out.println("escape two");
                continue;
            }
            System.out.println(i);
            System.out.println("java is good");
        }while(i<5);
        System.out.println("loop end here");
        }
    }



