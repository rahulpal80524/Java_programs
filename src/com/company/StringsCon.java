package com.company;

import javax.swing.*;
import java.io.*;
import java.util.*;

public class StringsCon {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new Scanner(System.in);



        String word1=sc.next();
        String word2=sc.next();
        String sum=word1+word2;
        System.out.println(sum.length());
        String a= String.valueOf(word1.compareTo(word2));
        System.out.println(a);

        if(word1.compareTo(word2)>0) {
            System.out.println("Yes");
        } else
            System.out.println("No");

        System.out.println(word1.substring(0,1).toUpperCase()+word1.substring(1)+" "+word2.substring(0,1).toUpperCase()+word2.substring(1));

    }
}
