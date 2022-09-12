package com.company;
class ekclass{
    int a;
    public int getA(){
        return a;
    }
    ekclass(int v){
       //a=v;
        this.a=v;
    }
    public int returnname(){
        return 1;
    }
}
   class doclass extends ekclass{
    doclass(int c){
        super(c) ;
        System.out.println("mai ek constructor hu");
    }
        }
        public class CWH_47_THIS_SUPER {
    public static void main(String[] args) {
  ekclass e=new ekclass(65);
        System.out.println(e.getA());
        doclass d=new doclass(5);
    }
}
