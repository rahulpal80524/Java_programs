package com.company;

public class CopyConstructor {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        s1.name = "me";
        s1.age = 434;
        Student2 s2 = new Student2(s1);
        s2.Print();
    }
}

class Student2{
    String name;
    int age;

    public Student2() {

    }

    public  void  Print(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student2(Student2 s2){ //Copy Constructor
        this.name = s2.name;
        this.age = s2.age;

    }

}