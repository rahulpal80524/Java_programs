package com.company;

public class ConstructorsInharitance {
    public static void main(String[] args) {
      //  Base1 base1 = new Base1();
//        Derived1 derived1 = new Derived1();
      //  Derived1 derived1 = new Derived1(23,45);
        ChildOfDerived CD = new ChildOfDerived(1,2,3);

    }
}

class Base1{
    Base1(){
        System.out.println("I am a Constructor in Base class 1st");
    }

    Base1(int x){
        System.out.println("I am overloaded Constructor in Base class x: "+x);
    }

}



class Derived1 extends Base1{

    Derived1(){
      //  super(0);//with argument Constructor calling
        System.out.println("I am a Derived class Constructor 1st");

    }
    Derived1(int x ,int y){
        super(x);
        System.out.println("I am overloaded Constructor of Derived with value of x and y :"+x+" "+y);
    }



}
class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I am a Child-Derived of Constructor 1st");

    }

    ChildOfDerived(int x,int y,int z){
        super(x,y);
        System.out.println("I am overloaded Constructor of Child-Derived with value of and z:"+z);

    }

}