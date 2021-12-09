package com.company;

public class ConstructorConceptNonPara {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "rahul";
        s1.age = 45;
        s1.PrintInfo();

    }
}
class Students {
    String name;
    int age;

    public void PrintInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }



    Students(){
        System.out.println("Non paramitered Constructor");
    }
}
