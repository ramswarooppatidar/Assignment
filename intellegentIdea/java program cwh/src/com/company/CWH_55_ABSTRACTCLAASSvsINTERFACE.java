package com.company;
interface bicycle{
    int a=45;
    void applybreak(int decrement);
    void speeedup(int increment);
}
interface hornbicycle{
    void blowhornk3g();
    void blowhornmhn();
}
class avoncycle implements bicycle,hornbicycle{
    void blowhorn(){
        System.out.println("pee pee poo poo");

    }
    public void applybreak(int decrement){
        System.out.println("apply break");
    }
   public void speeedup(int increment){
        System.out.println("applying speedd");
    }
    public void blowhornk3g(){
        System.out.println("kabhi khushi kabhi gam pee pee pee pee");
    }
   public void blowhornmhn(){
        System.out.println("main hoo naa po po po po");
    }

}

public class CWH_55_ABSTRACTCLAASSvsINTERFACE {
    public static void main(String[] args) {
        avoncycle cyclehary=new avoncycle();
        cyclehary.applybreak(1);
        // you can create properties of interfaces

        System.out.println(cyclehary.a);
        // you cannot modify the properties in interfaces as they final, all properties final
      /*  cyclehary.a=454;
        System.out.println(cyclehary.a);  */

        cyclehary.blowhornk3g();
        cyclehary.blowhornmhn();
    }
}
