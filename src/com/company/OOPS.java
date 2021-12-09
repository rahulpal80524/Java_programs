package com.company;
      public class OOPS {
          public static void main(String[] args) {
           // Pen pen1=new Pen();
       /*     pen1.color = "blue";//properties
            pen1.type = "gel";

           // pen1.Write();//method calling
              Pen pen2 = new Pen();
              pen2.color = "black";
              pen2.type = "ballpoint";

              pen1.printColor();
              pen2.printColor();  */
             // Student s1 = new Student("rahul",23);
              Student s1 = new Student();
              s1.name = "rahul";
              s1.age = 23;
            Student s2 = new Student(s1);
          //    s1.name = "name";
          //    s1.age = 22;
              s2.Printinfo();
          }


}

class Pen{
          String color;
          String type;

          public void Write(){
              System.out.println("Writing Something");
          }

        public void printColor(){
        System.out.println(this.color);
    }

}

class Student {
          String name;
          int age;

 /*    Student(String name,int age) { //parameterized Constructor
        this.name = name;
        this.age = age;
    } */

     Student(Student s2){ //Copy Constructor
         this.name = s2.name;
         this.age = s2.age;

     }

    public Student() {

    }


    public void Printinfo() {
              System.out.println(this.name);
              System.out.println(this.age);
          }

       /*   Student(){ //non parameterized Constructor
              System.out.println("Constructor called");
          } */


}