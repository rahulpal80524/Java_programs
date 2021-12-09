package com.company;

public class SingleLevelInheritance {
    public static void main(String[] args) {
       Triangle t1 = new Triangle();
       t1.color = "red";
    }

}

class Shapes{

    String color;
}

class Triangle extends Shapes {

}



