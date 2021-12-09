package com.company;
import com.Bank.*;

public class SingleLevelInheritance1 {
    public static void main(String[] args) {
    // Bank.Account account1 = new Bank.Account();

    }
}

class Triangle1 extends Shape1{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}

class EquilateralTringle extends Triangle1 {
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}

class Circle extends Shape1 {
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}


class Shape1{

    public void area(){
        System.out.println("displays area");
    }

}
