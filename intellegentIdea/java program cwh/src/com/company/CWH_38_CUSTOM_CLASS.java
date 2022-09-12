package com.company;

import org.w3c.dom.ls.LSOutput;

class employee{
    int id;
    String name;
    int salary;
    public void printdetails(){
        System.out.println("my id is"+id);
        System.out.println("my name is "+  name);
    }
    public int getSalary(){
        System.out.println("my salary is" + salary);
        return salary;
    }
}
public class CWH_38_CUSTOM_CLASS {
    public static void main(String[] args) {
        System.out.println("this is our custom class");
        employee harry= new employee(); //initializing new employee object
        employee ram= new employee();
        //setting attribution
        harry.id=12;
        harry.name="codeWithHarry";
        harry.salary=34;
        ram.id=17;
        ram.name="ramKatariya";
        ram.salary=78;
        //printing attributes
        harry.printdetails();
        ram.printdetails();
        System.out.println(ram.salary);
        harry.getSalary();
        ram.getSalary();
      System.out.println(harry.id);
        System.out.println(harry.name);

    }
}
