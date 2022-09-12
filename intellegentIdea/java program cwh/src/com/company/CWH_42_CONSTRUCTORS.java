package com.company;

class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
        id=45;
        name= "RAMSWAROOP PATIDAR";
    }
 public MyMainEmployee(String Myname,int MyId){      // methodoverloading also be used in constructor
     id=MyId;
     name= Myname;
 }
 public MyMainEmployee(String Myname){
        id=143;
        name= Myname;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    public void setId(int i) {
        id=i;
    }public int getId(){
        return id;
    }
}

public class CWH_42_CONSTRUCTORS {
    public static void main(String[] args) {
       // MyMainEmployee harry=new MyMainEmployee();

        //  harry.setName("ramswaroopPatidar"); //no need to do like these,constructor is help to acess direct
        //        harry.setId(34);               //,method of same name of class when object is created
                                                   //   automatic is envoked


       // MyMainEmployee harry=new MyMainEmployee("KATARIYARAMSWAROP",78);
        MyMainEmployee harry=new MyMainEmployee("anuradhapatidar");

        System.out.println(harry.getName());
        System.out.println(harry.getId());

    }
}
