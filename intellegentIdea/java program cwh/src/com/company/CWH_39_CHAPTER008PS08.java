package com.company;
 class Employee1{
     int salary;

     String name;

     public int getSalary() {
         return salary;
     }

     public String getName() {
         System.out.println("your name is "+ name);
         return name;
     }
     public void setName(String n){
         name=n;
     }
 }
 class cellphone{
     public void ring(){
         System.out.println("ringing");
     }
     public void vibrating(){
         System.out.println("vibrating");
     }
     public void call(){
         System.out.println("call mukul");
     }
 }
 class square{
     int side;
     public int area(){
         System.out.println("area of square is "+ side*side);
         return side*side;
     }
     public int perimeter(){
         return 4*side;
     }
 }
 class rectangle{
     int length;
     int breath;
     public int area(){
         return length*breath;
     }
     public int perimeter(){
         return 2*(length+breath);
         }

     }
     class tommy{
     public void hit(){
         System.out.println("hitting the enemy");
     }
     public void run(){
         System.out.println("running from the enemy");
     }
     public void fire(){
         System.out.println("fire the enemy");
     }
     }

    public class CWH_39_CHAPTER008PS08 {
        public static void main(String[] args) {

            // problem 1
            Employee1 harry=new Employee1();
            harry.salary=1243;
            System.out.println(harry.getSalary());
           harry.setName("CodeWithHarry");
           harry.getName();
         //  System.out.println(harry.getName());

            //problem 2

         /*   cellphone asus =new cellphone();
            asus.call();
            asus.ring();
            asus.vibrating();  */

            //problem 3

            square sq=new square();
            sq.side=3;
            sq.area();
           // System.out.println(sq.area());
            System.out.println(sq.perimeter());

            //problem 4

         /*   rectangle rect = new rectangle();
            rect.length = 5;
            rect.breath = 6;
            System.out.println(rect.area());
            System.out.println(rect.perimeter()); */

            //problem 5

            tommy player=new tommy();
            player.hit();
            player.run();
            player.fire();

        }
 }