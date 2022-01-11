package com.practice;

public class AbstractClass {
    public static void main(String[] args) {
      FountainPen fp = new FountainPen();
      fp.changeNib();

      human h=new human();
      h.eat();
      h.speak();
      Monkey m1 = new human();
//      m1.speak(); error
        basicanimal b= new human();
//        b.speak(); its not work
          b.eat();
          b.sleep();

    }
}

class FountainPen extends Pen{
    void write(){
        System.out.println("FountainPen in write");
    }

    void refill(){
        System.out.println("FountainPen refill");
    }
    void changeNib(){
        System.out.println("Changing the nib");
    }

}
 class Monkey{
    void jump (){
        System.out.println("Monkey jump");
    }
    void bite(){
        System.out.println("Monkey bite");
    }
 }

 interface basicanimal{
     void eat();
    void sleep();
 }

 class  human extends Monkey implements basicanimal {
       void speak(){
           System.out.println("human class speak");
       }

     @Override
     public void eat() {
         System.out.println("implements with basicanimal eat");
     }

     @Override
     public void sleep() {
         System.out.println("implements with basicanimal sleep");

     }
 }

abstract class Pen{
     abstract void write();
     abstract void refill();
}

abstract class Telephone {
   abstract void with();
   abstract void lift();
   abstract void disconnected();
}
class SmartTelephone{

}
interface SmartTVRemote{
    void ON();
    void OFF();
}
class TV implements TVRemote{


    @Override
    public void ON() {

    }

    @Override
    public void OFF() {

    }

    @Override
    public void Bluetooth() {

    }
}

interface TVRemote extends SmartTVRemote {
    void ON();
    void OFF();
    void Bluetooth();
}



