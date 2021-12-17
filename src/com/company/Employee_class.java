package com.company;

public class Employee_class{
    public static void main(String[] args) {
        Emp emp1 = new Emp();
        emp1.Setname("rahul pal");
        emp1.salary = 4500;
        System.out.println(emp1.getName());
        System.out.println(emp1.getSalary());
        emp1.name = "rahul";
        System.out.println(emp1.name);




    }
}

class Emp{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }

    public void Setname(String n){
      name=n;
    }



}