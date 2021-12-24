package com.company;

import java.util.Random;

public class Guess_the_Number {
    public static void main(String[] args) {
        GuessTheNumber guessTheNumber = new GuessTheNumber();
       // GuessTheNumber();

    }
}

class GuessTheNumber{
    GuessTheNumber(){
        Random ran = new Random();//
        int random = ran.nextInt(1,100);
        System.out.println(random);
    }

    public void takeUserInput(){

    }

  public void isCorrectNumber(){
        
  }

}
