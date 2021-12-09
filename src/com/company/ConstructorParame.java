package com.company;

import java.awt.print.Printable;

public class ConstructorParame {
    public static void main(String[] args) {
     Student1 s1 = new Student1("rahul",45);
        s1.Print();
    }


}

 class Student1{
    String name;
    int age;
    public void Print(){
        System.out.println(this.name);
        System.out.println(this.age);
    }


     Student1(String name,int age){
      this.name = name;
      this.age = age;
     }

 }
