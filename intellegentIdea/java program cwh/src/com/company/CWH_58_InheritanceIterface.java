package com.company;

import jdk.swing.interop.SwingInterOpUtils;

interface sampleInterface{
    void math1();
    void math2();
}
interface childSampleInterface extends sampleInterface{
    void math3();
    void math4();
}
class MySampleClass implements childSampleInterface{
    @Override
    public void math1(){
        System.out.println("MATHEMATICS");
    }
    @Override
    public void math2() {
        System.out.println("physics");
    }

    @Override
    public void math3(){

    }

    @Override
    public void math4() {

    }
}

public class CWH_58_InheritanceIterface {
    public static void main(String[] args) {
    MySampleClass OBJ =new MySampleClass();
    OBJ.math1();
    OBJ.math2();

    }
}
