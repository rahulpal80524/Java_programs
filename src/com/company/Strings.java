package com.company;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
//        String Declaration
         String name = "rahul"; //one word
         String Fullname="rahul pal"; //multiple words with space
         String  sentence = "hello, my name is rahul pal";//sentence

        Scanner sc = new Scanner(System.in);
//        String name= sc.next();  //single word
//        String name1= sc.nextLine(); //single sentance
//        System.out.println(name);
//        System.out.println(name1);

        for (int i=0;i<Fullname.length();i++){
            System.out.println(Fullname.charAt(i));
        }




    }
}
