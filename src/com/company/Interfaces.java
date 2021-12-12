package com.company;
interface Animals {
   public void walk();

}

interface Herbivore{

}

class Horses implements Animals,Herbivore {
   public void walk() {
        System.out.println("walks on 4 legs");
    }
}

public class Interfaces {
    public static void main(String[] args) {
    Horse horse = new Horse();
    horse.walk();
    }
}
