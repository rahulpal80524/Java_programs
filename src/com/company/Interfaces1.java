package com.company;

public class Interfaces1 {
    public static void main(String[] args) {
    AvonCycle cycle = new AvonCycle();
    cycle.applyBreak(4);
//  You Con Create Properties in Interfaces
        System.out.println(cycle.a);
//        You can't Modify the Properties in interface as they are final
    //    cycle.a = 413;
    //    System.out.println(cycle.a);
        cycle.bloghorn();
        cycle.blowhorn();
        cycle.BlowHorn();
    }
}
interface Bicycle{
    int a= 45;
    void applyBreak(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    void blowhorn();
    void bloghorn();

}
class AvonCycle implements Bicycle,HornBicycle{
    void BlowHorn(){
        System.out.println("Voice");
    }
    int speed=7;
    public void applyBreak(int decrement){
        System.out.println("Applying Break");
         speed = speed - decrement;
    }
   public void speedUp(int increment){
       System.out.println("Applying SpeedUp");
        speed = speed + increment;
    }

    public void blowhorn(){
        System.out.println("blowhorn call");
    }
    public void bloghorn(){
        System.out.println("bloghorn");
    }
}