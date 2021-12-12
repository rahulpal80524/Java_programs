package com.company;

import java.util.Scanner;

public class String_task {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
   /*     System.out.print("Enter any word: ");
        String word = sc.nextLine();
        word = word.toLowerCase();
        System.out.println(word);   */


  /*      System.out.print("Enter any word: ");
        String word1 = sc.nextLine();
        word1 = word1.replace(" ","_");
        System.out.println(word1);   */

    /*    String word2 = "Dear <|name|>, Thank a lot!";
        word2 = word2.replace("<|name|>","Rahul pal");
        System.out.println(words);  */


        //space count
        String word3 = "This string contains   double and triple spaces";
        System.out.println(word3.indexOf("  "));
        System.out.println(word3.indexOf("   "));


        String word4 = "Dear \n\tthis is \n\tprogram";
        System.out.println(word4);





    }
}
