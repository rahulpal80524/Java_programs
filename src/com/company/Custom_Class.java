package com.company;

public class Custom_Class {
    public static void main(String[] args) {
        System.out.println("this is our Custom class");
        Employee rahul = new Employee();//instanting a new Employee Object
        Employee mithlesh = new Employee();//instanting a new Employee Object

//        Setting properties
          rahul.id = 21;
          rahul.name = "rahul pal";
          rahul.salary= 4500;
//        printing the Attribute
//        System.out.println(rahul.id);
//        System.out.println(rahul.name);
          rahul.PrintDetails();


          mithlesh.id=22;
          mithlesh.name="mithlesh kumar";
          mithlesh.salary=2354;
          mithlesh.PrintDetails();
          int salary = rahul.getSalary();
         System.out.println(salary);


    }
}

class Employee{
    int id;
    String name;
    int salary;

    public void PrintDetails(){
        System.out.println("My name is: "+ name);
        System.out.println("My id is: "+id);

    }
    public int getSalary(){
        return salary;
    }
}
