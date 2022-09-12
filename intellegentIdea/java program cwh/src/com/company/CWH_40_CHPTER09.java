package com.company;
class MyEmployee{
 private int id;
 private String name;

 public String getName(){
   //  System.out.println("your name is " +name);
     return name;
 }
 public void setName(String n){
     name=n;
 }
 public void setid(int i){
     id=i;
 }
 public int getid(){
     return id;
 }}

/* class circle1 {
     private int radius;
     private float area;
     private float perimeter;

     public void radius(int r) {
         radius = r;
     }

     public void setarea(float a) {
         area = 3.142f * radius * radius;
         if (a == area) {
             area = a;
         } else {
             System.out.println("wrong value of area");
         }
     }
     public float perimeter(float a) {
         perimeter = 2 * 3.314f * radius;
         if (a == perimeter) {
             perimeter = a;
         } else {
             System.out.println("perimeter is wrong");

         } */

   public class CWH_40_CHPTER09 {
    public static void main(String[] args) {
        MyEmployee harry = new MyEmployee();
        //    harry.id=45;
      //       harry.name=("codewithharrry");    // throw an error dueto private access modifier

        harry.setName("codewithharry");
        harry.getName();
        System.out.println(harry.getName());
    }
   }



