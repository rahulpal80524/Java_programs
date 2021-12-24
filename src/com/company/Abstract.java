package com.company;

public class Abstract {
    public static void main(String[] args) {
      Child2 c = new Child2();
    }
}

abstract class Parent2 {
    public Parent2(){
        System.out.println("Base2 Constructor ");
    }
    public void sayhello(){
        System.out.println("hello");
    }
    abstract public void greet();
}

class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    public void me(){

    }
}

abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("th");
    }
}