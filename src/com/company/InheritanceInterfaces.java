package com.company;

public class InheritanceInterfaces {
    public static void main(String[] args) {

    }
}

interface SampleInterface{
    void method1();
    void method2();
}

interface childSampleInterface extends SampleInterface{
    void method3();
    void method4();
}

class MySampleClass implements childSampleInterface{
    public void method3(){
        System.out.println();
    }
    public void method4(){
        System.out.println();
    }

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}