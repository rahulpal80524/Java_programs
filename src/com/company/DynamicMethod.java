package com.company;

class Phone{
    public void name(){
        System.out.println("In class One name function");
    }
    public void name1(){
        System.out.println("In class One name1 function");
    }
}

class SmartPhone extends Phone{
    public void name(){
        System.out.println("In class Two name function");
    }
    public void name2(){
        System.out.println("In class Two name2 function");
    }
}


public class DynamicMethod {
    public static void main(String[] args) {
   //  Phone phone = new Phone();
   //  SmartPhone smartPhone =new SmartPhone();
   //  phone.name();
     Phone phone = new SmartPhone();
//     SmartPhone smartPhone = new Phone(); its not allowed
        phone.name();
    }
}
