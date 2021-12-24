package com.practice;

public class InharitanceCircleCylinder {
    public static void main(String[] args) {
       // Circle circle = new Circle(12);
        Cylinder cylinder = new Cylinder(12,4);
        System.out.println(cylinder.Area());
    }
}

class Circle{
 public int radius;
 Circle(int r){
     System.out.println("I am circle parameterized Constructor");
     this.radius = r;
 }
 public double Area(){
     return Math.PI * this.radius *this.radius;
 }
}

class Cylinder extends Circle{
    Cylinder(int r ,int h){
   super(r);
        System.out.println("I am Cylinder Parameterized Constructor");
   this.height= h;
    }
public int height;
public double Volume(){
    return Math.PI * this.radius *this.radius * this.height;
}
}