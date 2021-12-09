package com.company;


public class ClassConcept {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        Pens pen1 = new Pens();//object create Pens class
        pen1.color = "blue"; //value put in  pen1 object
        pen1.type  = "gel";
        pen1.printInfo(); // in object pen1 method printInfo calling

    }
}
class Pens{
    String color;
    String type;
    public void printInfo(){
        System.out.println(this.color); //‘this’ keyword in Java that refers to the current instance of the class. In ClassConcept it is used to:
        System.out.println(this.type);
    }
}
