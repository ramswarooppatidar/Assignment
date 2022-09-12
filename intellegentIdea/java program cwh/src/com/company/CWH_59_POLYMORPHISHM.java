package com.company;
interface Mycamera2{
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
interface Mywifi2{
    String[] getNetwork();
    void connectToNetwork(String network);
}
class MyCellphone2{
    void callnumber(int phonenumber){
        System.out.println("calling +phone number");
    }
    void pickcall(){
        System.out.println("connecting..");
    }
}
class MysmartPhone2 extends MyCellphone2 implements Mywifi2,Mycamera2 {
    public void takeSnap() {
        System.out.println("takimg snape");
    }

    public void recordVideo() {

    }

    //    public void recordIn4k(){
//        System.out.println("vedio and snap record in 4k");
//  }
    public void connectToNetwork(String Network) {
        System.out.println("connect to network " + Network);

    }

    public String[] getNetwork() {
        System.out.println("getting list of network");
        String[] networkList = {"idea", "jio", "airtel"};
        return networkList;
    }

}
    public class CWH_59_POLYMORPHISHM {
    public static void main(String[] args) {
Mycamera2 cam1=new MysmartPhone2(); // this is smart phone but please it used for only camra properties
//cam1.getnetwork();  not allowed for good
        cam1.recordIn4k();
MysmartPhone2 s=new MysmartPhone2();
s.getNetwork();
s.recordVideo();
s.callnumber(45);
s.takeSnap();
    }
}
