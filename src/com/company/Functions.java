package com.company;

import java.util.Scanner;

public class Functions { //function declaration

    public static void printMyName(String name){
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = sc.next();

        printMyName(name); //function calling

    }
}
