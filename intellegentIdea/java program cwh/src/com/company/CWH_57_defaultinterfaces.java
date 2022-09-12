package com.company;
interface Mycamera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("good morning");
    }
    default void recordIn4k(){
        greet();      // for run this we need to comment out the recordin4k method in mysmart phone class
        System.out.println("record in 4k");
    }
}
interface Mywifi{
    String[] getNetwork();
    void connectToNetwork(String network);
}
class MyCellphone{
    void callnumber(int phonenumber){
        System.out.println("calling +phone number");
    }
    void pickcall(){
        System.out.println("connecting..");
    }
}
class MysmartPhone extends MyCellphone implements Mywifi,Mycamera{
    public void takeSnap(){
        System.out.println("takimg snape");
    }
    public void recordVideo(){

    }
//    public void recordIn4k(){
//        System.out.println("vedio and snap record in 4k");
//   }
    public void connectToNetwork(String Network){
        System.out.println("connect to network "+Network);

    }
    public String[] getNetwork(){
        System.out.println("getting list of network");
        String[] networkList= {"idea","jio","airtel"};
        return networkList;
    }

}

public class CWH_57_defaultinterfaces {
    public static void main(String[] args) {
MysmartPhone ms=new MysmartPhone();
ms.recordIn4k();  //default run when method is not in mysmartphone if method is in
                      // mysmartphone than default not run
String[] ar=ms.getNetwork();
for(String item: ar){
    System.out.println(item);
}
    }
}
