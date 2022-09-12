package com.company;

public class CWH_34_FABIAONOSERIS {
    public static void main(String[] args) {
        int maxnumber =10;
        int privousenumber=0;
        int nextnumber=1;
        System.out.println(" fabiaono series of " +maxnumber +" number ");
      /*  for(int i=1;i<=maxnumber;i++){
            System.out.println(privousenumber + " ");
            int sum=privousenumber+ nextnumber;
            privousenumber=nextnumber;
            nextnumber=sum;  */
           int i=1;
           while(i<=maxnumber){
               System.out.println(privousenumber+ " ");
               int sum=privousenumber+ nextnumber;
               privousenumber=nextnumber;
               nextnumber=sum;

             i++;
           }

    }
}
