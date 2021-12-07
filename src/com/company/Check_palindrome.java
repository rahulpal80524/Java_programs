package com.company;

import java.io.*;
import java.util.*;

public class Check_palindrome {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String word =sc.next();

        StringBuilder sb = new StringBuilder(word);
        for(int i=0;i<sb.length()/2;i++){
            int front=i;
            int back=sb.length()-1-i;
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            sb.setCharAt(front, backChar);
            sb.setCharAt(back,  frontChar);

        }
       String word1= String.valueOf(sb);
//        System.out.println(word);

        if (word.compareTo(word1)==0){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }



    }
}