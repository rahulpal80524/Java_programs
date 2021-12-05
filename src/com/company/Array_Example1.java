package com.company;

import java.util.Scanner;

public class Array_Example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of name: ");
        int size = sc.nextInt();

        String name[] = new String[size]; //array decaleration

        for (int i=0;i<size;i++){
           name[i] = sc.next(); //input
        }

        for (int i=0;i<name.length;i++){
            System.out.println("name "+(i+1)+" is: "+name[i]);
        }
    }
}
