package com.company;

import java.util.Scanner;

public class Literals {
    public static void main(String[] args) {
        byte age = 34;
        int age1 = 56;
        short age2 = 45;
        long value = 56666666666666l;//int long value with l or L
        char ch = 'A';
        float f1 = 5.6f; //by default double but f or F compulsory -> 5.6f floating value
        double d1 = 3.533d; // d or D not compulsory
        boolean  a  = true;
        String name = "rahul pal";
        System.out.println(age);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter int :");
        //
        boolean b = sc.hasNextInt();
        System.out.println(b);

    }
}
