package com.company;
abstract class pen{
    abstract void write();
    abstract void refill();
}
class fountainPain extends pen{
    @Override
    void write() {
        System.out.println("write");
    }
    @Override
    void refill() {
        System.out.println("refill");
    }
    void changeNib(){
        System.out.println("change");
    }
}
class monkey{
    void jump(){
        System.out.println("jumping...");
    }
    void bite(){
        System.out.println("bite..");
    }
}
interface BasicAnaimal{
    void eat();
    void sleep();
}
class human extends monkey implements BasicAnaimal{
    void speak(){
        System.out.println("hello sir..");
    }
   public void eat(){
       System.out.println("eating");

    }
    public void sleep(){
        System.out.println("sleeping...");

    }
}


public class CWH_60_CHPTER11PS {
    public static void main(String[] args) {
        // q1-2
        fountainPain pen=new fountainPain();
        pen.changeNib();
        //q3
        human harry =new human();
        harry.sleep();

        //q5
        monkey m1=new human();
        m1.bite();
        m1.jump();
     //   m1.speak();  cannot use speak method because the referance is monkey which does not have speak method
        BasicAnaimal love=new human();
       // love.speak();----wrong
                love.eat();
        love.sleep();
    }
}
