package com.company;

public class CWH_32_methodOverloading {
    static void foo(){
        System.out.println("good morning bro");
    }
    static void foo(int a){
        System.out.println("good morning" + a + "bro!");
    }
    static void foo(int a,int b){  // a and b are perameters , ko kuch value milegi abhi mili nahi hai
        System.out.println("good morning" + a + "bro!");
        System.out.println("good morning" + b + "bro!");
    }

    static void change2(int [] arr){
    arr[0]=98;         // also change index,1,2,3....of object
                   // address passing ke bat yah bhi same object ki baat kar
        // raha hai ,chahe arry name kuch bhi ho, esi liye
        // ham fir koi bhi index change kar skte hai
  //bhot hi imporant concept hai yah to yaad rkahna hi jruri hai********
}

    static void change(int a){
     //   a=98;
    }
        static void tellJoke( ){
            System.out.println("I INVITED A NEW WORD \n"+ "plagiarism");
        }

    public static void main(String[] args) {
        //  tellJoke();
        //   int [ ] marks={52,75,77,98,98,94};
        // case1 changing an integer
        //   int x=45;
        //   change(x);
        //   System.out.println("the value of x after running change is " + x);
        //
        //   case2 changing the arry


        //   int [ ] marks={52,75,77,98,98,94};   //object ka reference pass ho jata hai ,
        // or sare oblects ka reference pass hota hai, jab ham kisis object ko function ki
        // madad se call karte hai to ,
        // ****** esi liye ham object ko change kar skte hai with ffunction calling*****
        //    System.out.println("the value of x after running change2:"+ marks[0 ]);

        // method overloading
        foo();
        foo(3000);   // argument 3000 and a ,b are perametr
        foo(3000,4000);   // always doubt a and b hahahahahh
        // arguments are actual

        //you can not change return type if change than this cant be case pf over loading****
        //return type void to---int
    }
    }

