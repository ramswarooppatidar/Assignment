package com.company;

public class CWH_35_CHPTER7PS {
    static void multipication(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d X %d=%d\n", i, n, i * n);
        }
    }

    static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //sum(n)=1+2+3+......+n;
    //sum(n)=1+2+3+4......n-1)+n;
    //sum(n)=sum(n-1)+sum(n)
    //sum(3)=3+sum(2)
    //sum(3)=3+2+sum(1)
    //sum(3)=3+2+1
    static int sumrec(int n) {
        // base condition of recurcive
        if (n == 1) {
            return 1;
        }
        return n + sumrec(n - 1);
    }

    static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                //j=o;j<n-i;j++
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int fib(int n) {
      /*  if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
            }  */
        if (n == 1 || n == 2) {
            return n - 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
    static void patternrec(int n){
        if(n>0){
            patternrec(n-1);
            for(int i=0;i<n;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


     //patternrec(3)
    // patternrec(2)+3 time star and new line
    // patternrec(1)+2 time star and new line + 3time star new line
    //patternrec(1) +1 time star and new lline+ 2time star new line +3 time star new line


    public static void main(String[] args) {

        // multipication(7);

        // problem no. two
        //  pattern(20);

        //problem no. 3
        // int c= sumrec(6);
        //   System.out.println(c);

        //   problem no. 4
        //  pattern2(8);

        // ****problem 5
        //fibonicci series of nth no 0 1 1 2 3 5 8 13 21 34;
        // without using word index in question term start from 1
      /*  int result=fib(2);
        System.out.println(result); */


        // 8 --problem 2 using recurtion
        patternrec(5);
    }
}
