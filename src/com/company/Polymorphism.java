package com.company;

public class Polymorphism {
    public static void main(String[] args) {
        Student3 s1 =new Student3();
        s1.name = "rahul";
        s1.age = 23;
        s1.PrintInfo(s1.name,s1.age);
    }

}


class Student3 {
    String name;
    int age;
public void PrintInfo(String name){
    System.out.println(name);
}
public void PrintInfo(int age){
    System.out.println(age);
}
public void PrintInfo(String name,int age){
    System.out.println(name + " "+age);
}

}