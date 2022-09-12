package com.company;

public class CWH_31_METHODSCHPTER7 {
    static int logic(int x,int y){
    int z;
    if(x>y){
        z=x+y;
    }else{             //using this conncept sumof two matics add and get result from return
        z=(x+y)*5;
    }
    return z;  // return will take the value to the place from where he is callede
    }

    public static void main(String[] args) {
        int a = 7;
        int b = 9;
        int c;
        c=logic(a,b);
        System.out.println(c);
    }
}